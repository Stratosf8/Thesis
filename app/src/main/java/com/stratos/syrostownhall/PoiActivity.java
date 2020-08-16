package com.stratos.syrostownhall;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class PoiActivity extends AppCompatActivity {

    public static final String TAG = "PoiActivity";

    public static final String POI_KEY = "poi";

    private TextView txtName, txtDescription;
    private ImageView poiImage;
    private FloatingActionButton btnAudio;
    private TextToSpeech tts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poi);

        initViews();

        tts =new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.UK);
                }
            }
        });

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
                btnAudio.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String toSpeak = txtDescription.getText().toString();
                        Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                        tts.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                    }
                });

            }

        }

    }

    @Override
    public void onBackPressed() {
        tts.stop();
        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void initViews() {
        Log.d(TAG, "initViews: started");
        txtName = findViewById(R.id.txtName);
        txtDescription = findViewById(R.id.txtDescription);
        poiImage = findViewById(R.id.poiImage);
        btnAudio = findViewById(R.id.floatingAudioButton);


    }

}
