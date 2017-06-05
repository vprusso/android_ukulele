package com.example.captainhampton.ukulelechords;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.List;


public class TunerActivity extends Activity implements OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuner);

        // Spinner element
        Spinner spinnerUkuleleTunings = (Spinner) findViewById(R.id.spinnerUkuleleTunings);

        // Spinner click listener
        spinnerUkuleleTunings.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Standard Tuning");
        categories.add("Baritone Tuning");
        categories.add("Slack-key Tuning");
        categories.add("English Tuning");
        categories.add("Canadian Tuning");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerUkuleleTunings.setAdapter(dataAdapter);
    }

    public void setTuning(String selected_tuning) {
        Button buttonTopString = (Button) findViewById(R.id.buttonTopString);
        Button buttonMiddleTopString = (Button) findViewById(R.id.buttonMiddleTopString);
        Button buttonMiddleBottomString = (Button) findViewById(R.id.buttonMiddleBottomString);
        Button buttonBottomString = (Button) findViewById(R.id.buttonBottomString);

        switch (selected_tuning) {
            case "Standard Tuning":
                buttonTopString.setText("G");
                buttonMiddleTopString.setText("C");
                buttonMiddleBottomString.setText("E");
                buttonBottomString.setText("A");
                final MediaPlayer standardTopString = MediaPlayer.create(this, R.raw.note_g);
                final MediaPlayer standardMiddleTopString = MediaPlayer.create(this, R.raw.note_c);
                final MediaPlayer standardMiddleBottomString = MediaPlayer.create(this, R.raw.note_e);
                final MediaPlayer standardBottomString = MediaPlayer.create(this, R.raw.note_a);

                buttonTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        standardTopString.start();
                    }
                });
                buttonMiddleTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        standardMiddleTopString.start();
                    }
                });
                buttonMiddleBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        standardMiddleBottomString.start();
                    }
                });
                buttonBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        standardBottomString.start();
                    }
                });


                break;
            case "Baritone Tuning":
                buttonTopString.setText("D");
                buttonMiddleTopString.setText("G");
                buttonMiddleBottomString.setText("B");
                buttonBottomString.setText("E");
                final MediaPlayer baritoneTopString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer baritoneMiddleTopString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer baritoneMiddleBottomString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer baritoneBottomString = MediaPlayer.create(this, R.raw.a_aug);

                buttonTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        baritoneTopString.start();
                    }
                });
                buttonMiddleTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        baritoneMiddleTopString.start();
                    }
                });
                buttonMiddleBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        baritoneMiddleBottomString.start();
                    }
                });
                buttonBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        baritoneBottomString.start();
                    }
                });
                break;
            case "Slack-key Tuning":
                buttonTopString.setText("G");
                buttonMiddleTopString.setText("C");
                buttonMiddleBottomString.setText("E");
                buttonBottomString.setText("G");
                final MediaPlayer slackTopString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer slackMiddleTopString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer slackMiddleBottomString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer slackBottomString = MediaPlayer.create(this, R.raw.a_aug);

                buttonTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        slackTopString.start();
                    }
                });
                buttonMiddleTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        slackMiddleTopString.start();
                    }
                });
                buttonMiddleBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        slackMiddleBottomString.start();
                    }
                });
                buttonBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        slackBottomString.start();
                    }
                });
                break;
            case "English Tuning":
                buttonTopString.setText("A");
                buttonMiddleTopString.setText("D");
                buttonMiddleBottomString.setText("F#");
                buttonBottomString.setText("B");
                final MediaPlayer englishTopString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer englishMiddleTopString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer englishMiddleBottomString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer englishBottomString = MediaPlayer.create(this, R.raw.a_aug);

                buttonTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        englishTopString.start();
                    }
                });
                buttonMiddleTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        englishMiddleTopString.start();
                    }
                });
                buttonMiddleBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        englishMiddleBottomString.start();
                    }
                });
                buttonBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        englishBottomString.start();
                    }
                });
                break;
            case "Canadian Tuning":
                buttonTopString.setText("Low A");
                buttonMiddleTopString.setText("D");
                buttonMiddleBottomString.setText("F#");
                buttonBottomString.setText("B");
                final MediaPlayer canadianTopString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer canadianMiddleTopString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer canadianMiddleBottomString = MediaPlayer.create(this, R.raw.a_aug);
                final MediaPlayer canadianBottomString = MediaPlayer.create(this, R.raw.a_aug);

                buttonTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canadianTopString.start();
                    }
                });
                buttonMiddleTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canadianMiddleTopString.start();
                    }
                });
                buttonMiddleBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canadianMiddleBottomString.start();
                    }
                });
                buttonBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        canadianBottomString.start();
                    }
                });
                break;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String selected_tuning = parent.getItemAtPosition(position).toString();
        setTuning(selected_tuning);

        // Showing selected spinner item
        //Toast.makeText(parent.getContext(), "Selected: " + selected_tuning, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
