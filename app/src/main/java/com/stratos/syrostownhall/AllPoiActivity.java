package com.stratos.syrostownhall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class AllPoiActivity extends AppCompatActivity {
    private static final String TAG = "AllPoiActivity";


    @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_all_poi);


            RecyclerView recyclerView = findViewById(R.id.recyclerView);
            PoiAdapter adapter = new PoiAdapter(this);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
            ArrayList<Poi> allPois = Utils.getPois();
            if (null != allPois) {
                adapter.setPois(allPois);
            }

        }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}