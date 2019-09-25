package com.lutfiana.myintentapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HalamanActivity2 extends AppCompatActivity {
    TextView txtoutput;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        txtoutput = findViewById(R.id.outputhall);
        Bundle bundle = getIntent().getExtras();
        nama=bundle.getString("nama");
        txtoutput.setText(nama);

    }
}
