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

    private MediaPlayer mediaPlayer;

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
        categories.add("Canadian Tuning");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerUkuleleTunings.setAdapter(dataAdapter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            if (isFinishing()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        }
    }

    private void stopPlaying() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void setTuning(String selected_tuning) {
        Button buttonTopString = (Button) findViewById(R.id.buttonTopString);
        Button buttonMiddleTopString = (Button) findViewById(R.id.buttonMiddleTopString);
        Button buttonMiddleBottomString = (Button) findViewById(R.id.buttonMiddleBottomString);
        Button buttonBottomString = (Button) findViewById(R.id.buttonBottomString);

        Button buttonStopNote = (Button) findViewById(R.id.buttonStopNote);

        buttonStopNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
            }
        });

        switch (selected_tuning) {
            case "Standard Tuning":
                buttonTopString.setText("G");
                buttonMiddleTopString.setText("C");
                buttonMiddleBottomString.setText("E");
                buttonBottomString.setText("A");

                buttonTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_g);
                        mediaPlayer.start();
                    }
                });
                buttonMiddleTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_c);
                        mediaPlayer.start();
                    }
                });
                buttonMiddleBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_e);
                        mediaPlayer.start();
                    }
                });
                buttonBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_a);
                        mediaPlayer.start();
                    }
                });


                break;
            case "Baritone Tuning":
                buttonTopString.setText("D");
                buttonMiddleTopString.setText("G");
                buttonMiddleBottomString.setText("B");
                buttonBottomString.setText("E");

                buttonTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_baritone_d);
                        mediaPlayer.start();
                    }
                });
                buttonMiddleTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_baritone_g);
                        mediaPlayer.start();
                    }
                });
                buttonMiddleBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_baritone_b);
                        mediaPlayer.start();
                    }
                });
                buttonBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_baritone_e);
                        mediaPlayer.start();
                    }
                });
                break;
            case "Canadian Tuning":
                buttonTopString.setText("Low A");
                buttonMiddleTopString.setText("D");
                buttonMiddleBottomString.setText("F#");
                buttonBottomString.setText("B");

                buttonTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_canadian_a);
                        mediaPlayer.start();
                    }
                });
                buttonMiddleTopString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_canadian_d);
                        mediaPlayer.start();
                    }
                });
                buttonMiddleBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_canadian_fshp);
                        mediaPlayer.start();
                    }
                });
                buttonBottomString.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopPlaying();
                        mediaPlayer = MediaPlayer.create(TunerActivity.this, R.raw.note_canadian_b);
                        mediaPlayer.start();
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
