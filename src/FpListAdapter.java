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

public class FpListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String TAG = "FpListAdapter";
    private Context context;
    private ArrayList<String> images = new ArrayList<>();
    private ArrayList<String> itemnames = new ArrayList<>();
    private ArrayList<Float> itemprices = new ArrayList<>();
    private OnItemListener onItemListener;
    private ArrayList<Float> ratings = new ArrayList<>();
    /* access modifiers changed from: private */
    public String str;

    public interface OnItemListener {
        void onItemClickfp(int i);
    }

    public FpListAdapter(ArrayList<String> mitemnames, ArrayList<String> mimages, ArrayList<Float> mitemprices, ArrayList<Float> mratings, Context mcontext, OnItemListener onItemListener2) {
        this.itemnames = mitemnames;
        this.images = mimages;
        this.context = mcontext;
        this.itemprices = mitemprices;
        this.ratings = mratings;
        this.onItemListener = onItemListener2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(C0563R.layout.food_item, parent, false), this.onItemListener);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(this.context).asBitmap().load(this.images.get(position)).into(holder.img);
        holder.txt_name.setText(this.itemnames.get(position));
        holder.price.setText(this.itemprices.get(position).toString());
        holder.f69rb.setRating(this.ratings.get(position).floatValue());
    }

    public int getItemCount() {
        return this.itemnames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView img;
        OnItemListener onItemListener;
        RelativeLayout parent_list_layout;
        TextView price;

        /* renamed from: rb */
        RatingBar f69rb;
        TextView txt_name;

        public ViewHolder(View itemView, OnItemListener onItemListener2) {
            super(itemView);
            this.img = (ImageView) itemView.findViewById(C0563R.C0565id.imageView);
            this.txt_name = (TextView) itemView.findViewById(C0563R.C0565id.textView);
            this.price = (TextView) itemView.findViewById(C0563R.C0565id.price_txt);
            this.f69rb = (RatingBar) itemView.findViewById(C0563R.C0565id.ratingBar);
            String unused = FpListAdapter.this.str = this.txt_name.getText().toString();
            this.parent_list_layout = (RelativeLayout) itemView.findViewById(C0563R.C0565id.parent_item_layout);
            this.onItemListener = onItemListener2;
            itemView.setOnClickListener(this);
        }

        public void onClick(View v) {
            this.onItemListener.onItemClickfp(getLayoutPosition());
        }
    }
}
