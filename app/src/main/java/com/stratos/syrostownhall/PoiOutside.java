package com.stratos.syrostownhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PoiOutside extends AppCompatActivity {
    private FloatingActionButton btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poi_outside);

        initView();

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoiOutside.this, PoiPaintingArCamera.class); //TODO: Replace destination class with Statue AR
                startActivity(intent);
            }
        });
    }
    private void initView() {
        btnCamera = findViewById(R.id.btnCamera);
    }
}