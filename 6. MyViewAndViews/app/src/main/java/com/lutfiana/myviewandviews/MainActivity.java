package com.lutfiana.myviewandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button donasiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }

        donasiBtn = findViewById(R.id.donasi_btn);

        donasiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , Donasi.class);
                startActivity(i);
            }
        });
    }
}
