package com.example.edible.p006ui.dashboard;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.edible.C0563R;
import com.example.edible.CartListAdapter;
import com.example.edible.QrcodeActivity;
import java.util.ArrayList;

/* renamed from: com.example.edible.ui.dashboard.DashboardFragment */
public class DashboardFragment extends Fragment implements CartListAdapter.OnItemListener {
    /* access modifiers changed from: private */
    public CartListAdapter adapter;
    private DashboardViewModel dashboardViewModel;
    ItemTouchHelper.SimpleCallback itemtouchhelpercallback = new ItemTouchHelper.SimpleCallback(0, 12) {
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            return false;
        }

        public void onSwiped(final RecyclerView.ViewHolder viewHolder, int direction) {
            new AlertDialog.Builder(viewHolder.itemView.getContext()).setMessage((CharSequence) "Are sure You want to remove item from Cart?").setPositiveButton((CharSequence) "Yes", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    int position = viewHolder.getAdapterPosition();
                    DashboardFragment.this.mimgs.remove(position);
                    DashboardFragment.this.mnames.remove(position);
                    DashboardFragment.this.mprices.remove(position);
                    DashboardFragment.this.mratings.remove(position);
                    DashboardFragment.this.mamts.remove(position);
                    DashboardFragment.this.mnos.remove(position);
                    DashboardFragment.this.adapter.notifyDataSetChanged();
                }
            }).setNegativeButton((CharSequence) "No", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    DashboardFragment.this.adapter.notifyItemChanged(viewHolder.getAdapterPosition());
                }
            }).create().show();
        }
    };
    /* access modifiers changed from: private */
    public ArrayList<Float> mamts = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<String> mimgs = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<String> mnames = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<Integer> mnos = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<Float> mprices = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<Float> mratings = new ArrayList<>();
    RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.dashboardViewModel = (DashboardViewModel) ViewModelProviders.m8of((Fragment) this).get(DashboardViewModel.class);
        View root = inflater.inflate(C0563R.layout.fragment_dashboard, container, false);
        this.recyclerView = (RecyclerView) root.findViewById(C0563R.C0565id.recyclerView);
        this.mnames.add("Food1");
        this.mnames.add("Food2");
        this.mnames.add("Food3");
        this.mnames.add("Food4");
        this.mnames.add("Food5");
        this.mnames.add("Food6");
        this.mnames.add("Food7");
        this.mnames.add("Food8");
        this.mnames.add("Food9");
        this.mnames.add("Food10");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.mimgs.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        ArrayList<Float> arrayList = this.mprices;
        Float valueOf = Float.valueOf(100.0f);
        arrayList.add(valueOf);
        this.mprices.add(valueOf);
        this.mprices.add(valueOf);
        this.mprices.add(valueOf);
        this.mprices.add(valueOf);
        this.mprices.add(valueOf);
        this.mprices.add(valueOf);
        this.mprices.add(valueOf);
        this.mprices.add(valueOf);
        this.mprices.add(valueOf);
        ArrayList<Float> arrayList2 = this.mratings;
        Float valueOf2 = Float.valueOf(4.0f);
        arrayList2.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mratings.add(valueOf2);
        this.mnos.add(1);
        this.mnos.add(2);
        this.mnos.add(3);
        this.mnos.add(1);
        this.mnos.add(2);
        this.mnos.add(3);
        this.mnos.add(1);
        this.mnos.add(2);
        this.mnos.add(3);
        this.mnos.add(1);
        this.mamts.add(valueOf);
        ArrayList<Float> arrayList3 = this.mamts;
        Float valueOf3 = Float.valueOf(200.0f);
        arrayList3.add(valueOf3);
        ArrayList<Float> arrayList4 = this.mamts;
        Float valueOf4 = Float.valueOf(300.0f);
        arrayList4.add(valueOf4);
        this.mamts.add(valueOf);
        this.mamts.add(valueOf3);
        this.mamts.add(valueOf4);
        this.mamts.add(valueOf);
        this.mamts.add(valueOf3);
        this.mamts.add(valueOf4);
        this.mamts.add(valueOf);
        initrecyclerview();
        return root;
    }

    public void initrecyclerview() {
        this.adapter = new CartListAdapter(this.mnames, this.mimgs, this.mprices, this.mratings, this.mnos, this.mamts, getContext(), this);
        new ItemTouchHelper(this.itemtouchhelpercallback).attachToRecyclerView(this.recyclerView);
        this.recyclerView.setAdapter(this.adapter);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public void onItemClickcart(int position) {
        Intent i = new Intent(getContext(), QrcodeActivity.class);
        i.putExtra("Fname", this.mnames.get(position));
        i.putExtra("Fprice", this.mprices.get(position).toString());
        i.putExtra("Fnos", this.mnos.get(position).toString());
        i.putExtra("Famt", this.mamts.get(position).toString());
        startActivity(i);
    }
}
