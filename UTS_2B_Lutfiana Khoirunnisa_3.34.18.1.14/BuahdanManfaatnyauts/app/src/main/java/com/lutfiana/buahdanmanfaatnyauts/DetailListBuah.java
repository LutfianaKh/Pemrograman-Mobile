package com.lutfiana.buahdanmanfaatnyauts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListBuah extends AppCompatActivity{

    private int Buah_id;
    ImageView imgdetail;
    TextView tvName, tvDesc;
    private ArrayList<Buah> listBuah = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_buah);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Buah_id = getIntent().getIntExtra("Buah_id",0);
        tvName = findViewById(R.id.nama_Buah);
        tvDesc = findViewById(R.id.desc_detail);
        imgdetail = findViewById(R.id.img_detail);

        listBuah.addAll(BuahData.getListData());

        setLayout();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    void setLayout(){
        getSupportActionBar().setTitle(listBuah.get(Buah_id).getName());
        tvName.setText(listBuah.get(Buah_id).getName());
        tvDesc.setText(listBuah.get(Buah_id).getDescription());
        Glide.with(this)
                .load(listBuah.get(Buah_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgdetail);
    }
}
