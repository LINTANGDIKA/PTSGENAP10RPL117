package com.example.ptsgenap10rpl117;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailUser extends AppCompatActivity {
    Bundle bundle;
    String namaLengkap;
    String noTelp;
    String pelajar;
    String image;
    TextView namalengkap, notelp, pelajarst;
    ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_user);
        bundle = getIntent().getExtras();
        if (bundle != null) {
            namaLengkap = bundle.getString("namaLengkap");
            noTelp = bundle.getString("noTelp");
            pelajar = bundle.getString("pelajar");
            image = bundle.getString("image");

            this.namalengkap = findViewById(R.id.namalengkap);
            this.notelp = findViewById(R.id.notelp);
            this.pelajarst = findViewById(R.id.pelajarst);
            this.image1 = findViewById(R.id.image1);

            namalengkap.setText(namaLengkap);
            notelp.setText(noTelp);
            pelajarst.setText(pelajar);
            Picasso.get()
                    .load(image)
                    .into(image1);
        }

    }
}