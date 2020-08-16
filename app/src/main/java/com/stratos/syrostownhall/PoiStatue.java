package com.stratos.syrostownhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PoiStatue extends AppCompatActivity {
    private FloatingActionButton btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poi_statue);

        initView();

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoiStatue.this, PoiStatueArCamera.class);
                startActivity(intent);
            }
        });
    }


    private void initView() {
        btnCamera = findViewById(R.id.btnCamera);
    }
}