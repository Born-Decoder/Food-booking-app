package com.example.edible;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

public class Food_item extends AppCompatActivity {
    Button btn;
    TextView desc;
    ImageView img;
    Button minus;
    TextView name;
    TextView nos;
    TextView ordr;
    Button plus;
    TextView price;

    /* renamed from: rb */
    RatingBar f68rb;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0563R.layout.activity_food_item);
        Bundle extras = getIntent().getExtras();
        String item_name = "";
        if (extras != null) {
            item_name = extras.getString("Clicked_item");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle((CharSequence) item_name);
        this.name = (TextView) findViewById(C0563R.C0565id.food_txt);
        this.price = (TextView) findViewById(C0563R.C0565id.fp_txt);
        this.nos = (TextView) findViewById(C0563R.C0565id.nos_txt);
        this.desc = (TextView) findViewById(C0563R.C0565id.food_desc);
        this.f68rb = (RatingBar) findViewById(C0563R.C0565id.food_reting);
        this.btn = (Button) findViewById(C0563R.C0565id.book_btn);
        this.img = (ImageView) findViewById(C0563R.C0565id.item_img);
        this.ordr = (TextView) findViewById(C0563R.C0565id.order_txt);
        this.plus = (Button) findViewById(C0563R.C0565id.plus_btn);
        this.minus = (Button) findViewById(C0563R.C0565id.minus_btn);
        this.ordr.setInputType(2);
        this.plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Food_item.this.ordr.setText(String.valueOf(Integer.parseInt(Food_item.this.ordr.getText().toString()) + 1));
            }
        });
        this.minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int ordernos = Integer.parseInt(Food_item.this.ordr.getText().toString());
                if (ordernos > 0) {
                    ordernos--;
                }
                Food_item.this.ordr.setText(String.valueOf(ordernos));
            }
        });
        this.name.setText(item_name);
        this.price.setText("Price - 100/-");
        this.nos.setText("(1 nos)");
        this.desc.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        this.f68rb.setRating(5.0f);
        Picasso.get().load("https://burpple-2.imgix.net/foods/4ec8ca3c4b819551d81336597_original.?w=645&dpr=1&fit=crop&q=80&auto=format").into(this.img);
        this.btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = Food_item.this.name.getText().toString();
                String odn = Food_item.this.ordr.getText().toString();
                if (Integer.parseInt(odn) > 0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Food_item.this.btn.getContext());
                    builder.setMessage((CharSequence) "Do you want to proceed your order of " + odn + " item(s) of " + str + "?").setPositiveButton((CharSequence) "Yes", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Food_item.this.startActivity(new Intent(Food_item.this.getApplicationContext(), BookingActivity.class));
                        }
                    }).setNegativeButton((CharSequence) "No", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    }).create().show();
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }
}
