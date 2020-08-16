package com.stratos.syrostownhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Home2Activity extends AppCompatActivity {
    private static final String TAG = "Home2Activity";

    private FloatingActionButton btnListButton, btnButtonBack;
    private ImageButton btnWall, btnStatue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        initViews();
        Utils.initPois();

        btnListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home2Activity.this, AllPoiActivity.class);
                startActivity(intent);
            }
        });
        btnButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home2Activity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        btnWall.setOnClickListener(view -> {
            Intent intent = new Intent(Home2Activity.this, PoiWall.class);
            startActivity(intent);
        });
        btnStatue.setOnClickListener(view -> {
            Intent intent = new Intent(Home2Activity.this, PoiHeadStatue.class);
            startActivity(intent);
        });
    }

    private void initViews() {
        Log.d(TAG, "initViews: started");
        btnListButton = findViewById(R.id.floatingListButton);
        btnButtonBack = findViewById(R.id.floatingButtonBack);
        btnWall = findViewById(R.id.imageButtonWall);
        btnStatue = findViewById(R.id.imageButtonHeadStatue);
    }
}