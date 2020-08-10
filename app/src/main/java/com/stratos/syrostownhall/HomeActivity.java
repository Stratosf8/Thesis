package com.stratos.syrostownhall;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";


    private FloatingActionButton btnListButton, btnButtonNext;
    private ImageButton btnOutside, btnStatue, btnPainting, btnStairs,btnBackStairs, btnCourt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        initViews();
        Utils.initPois();

        btnListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AllPoiActivity.class);
                startActivity(intent);
            }
        });

        btnPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PoiPainting.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are You Sure You Want to Exit ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finishAffinity();
                        System.exit(0);
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void initViews(){
        Log.d(TAG, "initViews: started");
        btnListButton = findViewById(R.id.floatingListButton);
        btnButtonNext = findViewById(R.id.floatingButtonNext);
        btnOutside = findViewById(R.id.imageButtonOutside);
        btnBackStairs = findViewById(R.id.imageButtonBackStairs);
        btnCourt = findViewById(R.id.imageButtonCourt);
        btnPainting = findViewById(R.id.imageButtonPainting);
        btnStatue = findViewById(R.id.imageButtonStatue);
        btnStairs = findViewById(R.id.imageButtonStairs);

    }
}