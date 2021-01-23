package com.example.edible;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.edible.FpListAdapter;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class FoodPlace extends AppCompatActivity implements FpListAdapter.OnItemListener {
    private ArrayList<String> images = new ArrayList<>();
    private ArrayList<String> itemnames = new ArrayList<>();
    private ArrayList<Float> prices = new ArrayList<>();
    private ArrayList<Float> ratings = new ArrayList<>();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.itemnames.add("food1");
        this.images.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.prices.add(Float.valueOf(100.0f));
        this.ratings.add(Float.valueOf(4.0f));
        this.itemnames.add("food2");
        this.images.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.prices.add(Float.valueOf(150.0f));
        this.ratings.add(Float.valueOf(4.5f));
        this.itemnames.add("food3");
        this.images.add("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format");
        this.prices.add(Float.valueOf(200.0f));
        this.ratings.add(Float.valueOf(4.8f));
        setContentView((int) C0563R.layout.activity_food_place);
        Bundle extras = getIntent().getExtras();
        RecyclerView rv1 = (RecyclerView) findViewById(C0563R.C0565id.recyclerView);
        rv1.setAdapter(new FpListAdapter(this.itemnames, this.images, this.prices, this.ratings, this, this));
        rv1.setLayoutManager(new LinearLayoutManager(this));
        String pname = "";
        if (extras != null) {
            pname = extras.getString("clicked_pos");
            String vname = extras.getString("view");
        }
        Picasso.get().load("https://s3-media0.fl.yelpcdn.com/bphoto/AAfCF_-2zcZO4QqzVKd1hw/o.jpg").into((ImageView) findViewById(C0563R.C0565id.top_place_img));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle((CharSequence) pname);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onItemClickfp(int position) {
        Intent i = new Intent(this, Food_item.class);
        i.putExtra("Clicked_item", this.itemnames.get(position));
        startActivity(i);
    }
}
