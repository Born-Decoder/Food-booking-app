package com.example.edible;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class PnbListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String TAG = "MyListAdapter";
    private Context context;
    private ArrayList<String> images = new ArrayList<>();
    private ArrayList<String> itemnames = new ArrayList<>();
    private OnItemListener onItemListener;
    /* access modifiers changed from: private */
    public String str;

    public interface OnItemListener {
        void onItemClickpnb(int i);
    }

    public PnbListAdapter(ArrayList<String> mitemnames, ArrayList<String> mimages, Context mcontext, OnItemListener onItemListener2) {
        this.itemnames = mitemnames;
        this.images = mimages;
        this.context = mcontext;
        this.onItemListener = onItemListener2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(C0563R.layout.list_item, parent, false), this.onItemListener);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(this.context).asBitmap().load(this.images.get(position)).into(holder.img);
        holder.txt.setText(this.itemnames.get(position));
    }

    public int getItemCount() {
        return this.itemnames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView img;
        OnItemListener onItemListener;
        RelativeLayout parent_list_layout;
        TextView txt;

        public ViewHolder(View itemView, OnItemListener onItemListener2) {
            super(itemView);
            this.img = (ImageView) itemView.findViewById(C0563R.C0565id.imageView);
            this.txt = (TextView) itemView.findViewById(C0563R.C0565id.textView);
            String unused = PnbListAdapter.this.str = this.txt.getText().toString();
            this.parent_list_layout = (RelativeLayout) itemView.findViewById(C0563R.C0565id.parent_item_layout);
            this.onItemListener = onItemListener2;
            itemView.setOnClickListener(this);
        }

        public void onClick(View v) {
            this.onItemListener.onItemClickpnb(getLayoutPosition());
        }
    }
}
