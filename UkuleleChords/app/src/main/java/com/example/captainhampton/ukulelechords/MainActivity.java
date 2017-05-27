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

        // Display banner ad at bottom of screen.
        displayBannerAd();

        // Start the ukulele as selected instrument.
        TextView ukulele = (TextView) findViewById(R.id.ukulele);
        ukulele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ukuleleIntent = new Intent(MainActivity.this, UkuleleActivity.class);
                startActivity(ukuleleIntent);
            }
        });


    }

    private void displayBannerAd() {
        AdView adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();

        adView.loadAd(adRequest);
    }
}
