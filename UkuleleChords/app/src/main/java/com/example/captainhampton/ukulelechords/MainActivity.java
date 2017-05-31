package com.example.captainhampton.ukulelechords;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayBannerAd();

        // Select the ukulele chord activity
        TextView ukuleleTextView = (TextView) findViewById(R.id.ukuleleTextView);
        ukuleleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ukuleleIntent = new Intent(MainActivity.this, UkuleleActivity.class);
                startActivity(ukuleleIntent);
            }
        });

        // Start the ukulele scales activity
        // TODO

        // Start the ukulele tuner activity
        TextView ukuleleTunerTextView = (TextView) findViewById(R.id.ukuleleTunerTextView);
        ukuleleTunerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tunerIntent = new Intent(MainActivity.this, TunerActivity.class);
                startActivity(tunerIntent);
            }
        });

        // Start the ukulele chord sequencer activity
        // TODO

        // Start the about activity.
        TextView aboutTextView = (TextView) findViewById(R.id.aboutTextView);
        aboutTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });


    }

    public void displayBannerAd() {
        AdView adView = (AdView)findViewById(R.id.mainAdView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();

        adView.loadAd(adRequest);
    }
}
