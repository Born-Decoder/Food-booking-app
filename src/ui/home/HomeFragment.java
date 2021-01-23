package com.example.edible.p006ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.edible.C0563R;
import com.example.edible.FoodPlace;
import com.example.edible.MyListAdapter;
import com.example.edible.PnbListAdapter;
import com.example.edible.newopAdapter;
import com.example.edible.ppListAdapter;
import java.util.ArrayList;

/* renamed from: com.example.edible.ui.home.HomeFragment */
public class HomeFragment extends Fragment implements MyListAdapter.OnItemListener, PnbListAdapter.OnItemListener, ppListAdapter.OnItemListener, newopAdapter.OnItemListener {
    private HomeViewModel homeViewModel;
    private ArrayList<String> images = new ArrayList<>();
    private ArrayList<String> itemnames = new ArrayList<>();
    private ArrayList<String> itemnames2 = new ArrayList<>();
    private ArrayList<String> itemnames3 = new ArrayList<>();
    private ArrayList<String> itemnames4 = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.homeViewModel = (HomeViewModel) ViewModelProviders.m8of((Fragment) this).get(HomeViewModel.class);
        View root = inflater.inflate(C0563R.layout.fragment_home, container, false);
        this.itemnames.add("place1");
        this.images.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.itemnames.add("place2");
        this.images.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.itemnames.add("place3");
        this.images.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        RecyclerView rv1 = (RecyclerView) root.findViewById(C0563R.C0565id.recyclerView);
        rv1.setAdapter(new MyListAdapter(this.itemnames, this.images, getContext(), this));
        rv1.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        Button txt1home = (Button) root.findViewById(C0563R.C0565id.txt1home);
        txt1home.setText("Top Picks for You");
        txt1home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        this.itemnames2.add("place4");
        this.itemnames2.add("place5");
        this.itemnames2.add("place6");
        ((Button) root.findViewById(C0563R.C0565id.txt2home)).setText("Places Nearby You");
        RecyclerView rv2 = (RecyclerView) root.findViewById(C0563R.C0565id.recyclerView2);
        rv2.setAdapter(new PnbListAdapter(this.itemnames2, this.images, getContext(), this));
        rv2.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        this.itemnames3.add("place7");
        this.itemnames3.add("place8");
        this.itemnames3.add("place9");
        ((Button) root.findViewById(C0563R.C0565id.txt3home)).setText("Popular Places");
        RecyclerView rv3 = (RecyclerView) root.findViewById(C0563R.C0565id.recyclerView3);
        ppListAdapter ad3 = new ppListAdapter(this.itemnames3, this.images, getContext(), this);
        rv3.setAdapter(ad3);
        rv3.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        this.itemnames4.add("place10");
        this.itemnames4.add("place11");
        this.itemnames4.add("place12");
        ((Button) root.findViewById(C0563R.C0565id.txt4home)).setText("New Openings");
        RecyclerView rv4 = (RecyclerView) root.findViewById(C0563R.C0565id.recyclerView4);
        ppListAdapter pplistadapter = ad3;
        rv4.setAdapter(new newopAdapter(this.itemnames4, this.images, getContext(), this));
        rv4.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        return root;
    }

    public void onItemClicktop(int pos) {
        Intent i = new Intent(getContext(), FoodPlace.class);
        i.putExtra("clicked_pos", this.itemnames.get(pos));
        i.putExtra("View", "Tp");
        startActivity(i);
    }

    public void onItemClickpnb(int pos) {
        Intent i = new Intent(getContext(), FoodPlace.class);
        i.putExtra("clicked_pos", this.itemnames2.get(pos));
        i.putExtra("View", "pnb");
        startActivity(i);
    }

    public void onItemClickpp(int pos) {
        Intent i = new Intent(getContext(), FoodPlace.class);
        i.putExtra("clicked_pos", this.itemnames3.get(pos));
        i.putExtra("View", "pp");
        startActivity(i);
    }

    public void onItemClicknop(int pos) {
        Intent i = new Intent(getContext(), FoodPlace.class);
        i.putExtra("clicked_pos", this.itemnames4.get(pos));
        i.putExtra("View", "no");
        startActivity(i);
    }
}
