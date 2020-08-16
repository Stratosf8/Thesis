package com.stratos.syrostownhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PoiCourt extends AppCompatActivity {
    private FloatingActionButton btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poi_court);

        initView();

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoiCourt.this, PoiCourtArCamera.class);
                startActivity(intent);
            }
        });
    }
    private void initView() {
        btnCamera = findViewById(R.id.btnCamera);
    }
}