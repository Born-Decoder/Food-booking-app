package com.example.edible;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrcodeActivity extends AppCompatActivity {
    TextView amt;
    Button btn;
    ImageView img;
    TextView name;
    TextView nos;
    TextView price;
    ProgressBar spinner;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0563R.layout.activity_qrcode);
        Bundle extras = getIntent().getExtras();
        String item_name = "";
        String item_amt = "";
        String item_nos = "";
        String item_price = "";
        if (extras != null) {
            item_name = extras.getString("Fname");
            item_amt = extras.getString("Famt");
            item_nos = extras.getString("Fnos");
            item_price = extras.getString("Fprice");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Your Order");
        this.img = (ImageView) findViewById(C0563R.C0565id.qr_img);
        this.nos = (TextView) findViewById(C0563R.C0565id.qr_nos_text);
        this.price = (TextView) findViewById(C0563R.C0565id.qr_price_text);
        this.amt = (TextView) findViewById(C0563R.C0565id.qr_amt_text);
        this.name = (TextView) findViewById(C0563R.C0565id.qr_item_text);
        this.btn = (Button) findViewById(C0563R.C0565id.qr_load_btn);
        this.spinner = (ProgressBar) findViewById(C0563R.C0565id.progress_loader);
        this.spinner.setVisibility(8);
        this.nos.setText(item_nos);
        this.price.setText(item_price);
        this.amt.setText(item_amt);
        this.name.setText(item_name);
        final String qrstr = "Default_vendor_001" + "," + item_name + "," + "Default_user_001" + "," + item_amt;
        final QRCodeWriter writer = new QRCodeWriter();
        this.btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    ProgressDialog dialog = new ProgressDialog(QrcodeActivity.this);
                    dialog.setMessage("QR is getting Loaded");
                    dialog.show();
                    BitMatrix bitMatrix = writer.encode(qrstr, BarcodeFormat.QR_CODE, 512, 512);
                    int width = bitMatrix.getWidth();
                    int height = bitMatrix.getHeight();
                    Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                    for (int x = 0; x < width; x++) {
                        for (int y = 0; y < height; y++) {
                            bmp.setPixel(x, y, bitMatrix.get(x, y) ? ViewCompat.MEASURED_STATE_MASK : -1);
                        }
                    }
                    dialog.dismiss();
                    QrcodeActivity.this.img.setImageBitmap(bmp);
                } catch (WriterException e) {
                    e.printStackTrace();
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
