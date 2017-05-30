package com.example.captainhampton.ukulelechords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        TextView aboutText = (TextView) findViewById(R.id.aboutTextView);

        aboutText.setText("Hey! Thanks for downloading my app. I'm just one guy who does this " +
                "for kicks on the weekends, and it's been a really fun project to work on!" +
                "I built this mostl ikely for the same reason you downloaded it, to learn the" +
                "ukulele! Hopefully this humble little app can help you in achieving this goal!");
    }
}
