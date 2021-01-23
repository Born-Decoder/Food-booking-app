package com.example.edible;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {
    Button btn;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0563R.layout.activity_booking);
        this.btn = (Button) findViewById(C0563R.C0565id.back);
        this.btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                BookingActivity bookingActivity = BookingActivity.this;
                bookingActivity.startActivity(new Intent(bookingActivity.getApplicationContext(), MainActivity.class));
            }
        });
    }
}
