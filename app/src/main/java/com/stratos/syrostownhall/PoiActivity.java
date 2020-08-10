package com.stratos.syrostownhall;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class PoiActivity extends AppCompatActivity {

    public static final String TAG = "PoiActivity";

    public static final String POI_KEY = "poi";

    private TextView txtName, txtDescription;
    private ImageView poiImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poi);

        initViews();

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };

        Intent intent = getIntent();
        if (null != intent) {
            final Poi poi = intent.getParcelableExtra(POI_KEY);
            if (null != poi) {
                txtName.setText(poi.getName());
                txtDescription.setText(poi.getLongDesc());
                Glide.with(this)
                        .asBitmap()
                        .load(poi.getImageUrl())
                        .into(poiImage);
            }
        }
    }


    private void initViews() {
        Log.d(TAG, "initViews: started");
        txtName = findViewById(R.id.txtName);
        txtDescription = findViewById(R.id.txtDescription);
        poiImage = findViewById(R.id.poiImage);
    }


}