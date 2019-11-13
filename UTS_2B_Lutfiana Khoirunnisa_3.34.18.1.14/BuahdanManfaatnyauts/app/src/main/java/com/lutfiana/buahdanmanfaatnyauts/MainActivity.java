package com.lutfiana.buahdanmanfaatnyauts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBuah;
    private ArrayList<Buah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Buah dan Manfaatnya");
        }
        rvBuah = findViewById(R.id.rv_Buah);
        rvBuah.setHasFixedSize(true);
        list.addAll(BuahData.getListData());
        showRecyclerList();
    }
    private  void  showRecyclerList(){
        rvBuah.setLayoutManager(new LinearLayoutManager(this));
        CardBuahAdapter CardBuahAdapter = new CardBuahAdapter(this,list);
        rvBuah.setAdapter(CardBuahAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tombol, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.DataDiri:
                Intent intent = new Intent(this, DataDiri.class);
                startActivity(intent);
                return true;
        }
        return true;
    }
}
