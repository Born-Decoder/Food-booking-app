package com.example.edible;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class CartListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String TAG = "MyListAdapter";
    private ArrayList<Float> amts = new ArrayList<>();
    private Context context;
    private ArrayList<String> images = new ArrayList<>();
    private ArrayList<String> itemnames = new ArrayList<>();
    private ArrayList<Integer> nos = new ArrayList<>();
    private OnItemListener onItemListener;
    private ArrayList<Float> prices = new ArrayList<>();
    private ArrayList<Float> ratings = new ArrayList<>();
    /* access modifiers changed from: private */
    public String str;

    public interface OnItemListener {
        void onItemClickcart(int i);
    }

    public CartListAdapter(ArrayList<String> mitemnames, ArrayList<String> mimages, ArrayList<Float> mprices, ArrayList<Float> mratings, ArrayList<Integer> mnos, ArrayList<Float> mamts, Context mcontext, OnItemListener onItemListener2) {
        this.itemnames = mitemnames;
        this.images = mimages;
        this.prices = mprices;
        this.ratings = mratings;
        this.context = mcontext;
        this.nos = mnos;
        this.amts = mamts;
        this.onItemListener = onItemListener2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(C0563R.layout.cart_item, parent, false), this.onItemListener);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(this.context).asBitmap().load(this.images.get(position)).into(holder.img);
        holder.ntxt.setText(this.itemnames.get(position));
        holder.ptxt.setText(this.prices.get(position).toString());
        holder.f67rb.setRating(this.ratings.get(position).floatValue());
        holder.atxt.setText(this.amts.get(position).toString());
        holder.nostxt.setText(this.nos.get(position).toString());
    }

    public int getItemCount() {
        return this.itemnames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView atxt;
        ImageView img;
        TextView nostxt;
        TextView ntxt;
        OnItemListener onItemListener;
        RelativeLayout parent_list_layout;
        TextView ptxt;

        /* renamed from: rb */
        RatingBar f67rb;

        public ViewHolder(View itemView, OnItemListener onItemListener2) {
            super(itemView);
            this.img = (ImageView) itemView.findViewById(C0563R.C0565id.imageView);
            this.ntxt = (TextView) itemView.findViewById(C0563R.C0565id.name_txt);
            this.ptxt = (TextView) itemView.findViewById(C0563R.C0565id.price_txt);
            this.nostxt = (TextView) itemView.findViewById(C0563R.C0565id.no_txt);
            this.atxt = (TextView) itemView.findViewById(C0563R.C0565id.amt_txt);
            this.f67rb = (RatingBar) itemView.findViewById(C0563R.C0565id.ratingBar);
            String unused = CartListAdapter.this.str = this.ntxt.getText().toString();
            this.parent_list_layout = (RelativeLayout) itemView.findViewById(C0563R.C0565id.parent_item_layout);
            this.onItemListener = onItemListener2;
            itemView.setOnClickListener(this);
        }

        public void onClick(View v) {
            this.onItemListener.onItemClickcart(getLayoutPosition());
        }
    }
}
