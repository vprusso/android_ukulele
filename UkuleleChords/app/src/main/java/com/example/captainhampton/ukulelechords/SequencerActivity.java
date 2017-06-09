package com.example.captainhampton.ukulelechords;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SequencerActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private UkuleleChordUtil ukuleleChordUtil = new UkuleleChordUtil();
    private HashMap<String, Integer> chordDrawableHashMap = ukuleleChordUtil.getSelectedChordDrawableHashMap();
    private HashMap<String, Integer> chordRawHashMap = ukuleleChordUtil.getSelectedChordRawHashMap();;

    private MediaPlayer mediaPlayer;

    private String selected_chord;

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

    public void setSelectedChord(String _selected_chord) {
        selected_chord = _selected_chord;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequencer);

        // Spinner Note elements
        Spinner spinnerNote1 = (Spinner)findViewById(R.id.spinnerNote1);
        Spinner spinnerNote2 = (Spinner)findViewById(R.id.spinnerNote2);

        // Spinner Drop down elements
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E",
                "F", "F#", "G", "G#"};

        // Creating adapter for spinner
        ArrayAdapter<String> noteAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, notes);
        ArrayAdapter<String> noteAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, notes);

        // Drop down layout style - list view with radio button
        noteAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        noteAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerNote1.setAdapter(noteAdapter1);
        spinnerNote2.setAdapter(noteAdapter2);

        spinnerNote1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected_tuning = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), "Selected: " + selected_tuning, Toast.LENGTH_LONG).show();

                Spinner spinnerChord1 = (Spinner)findViewById(R.id.spinnerChord1);
                final ImageButton imageButtonPlay1 = (ImageButton)findViewById(R.id.imageButtonPlay1);

                String [] chords = ukuleleChordUtil.createUkuleleChords(selected_tuning);

                ArrayAdapter<String> chordAdapter1 = new ArrayAdapter<String>(SequencerActivity.this, android.R.layout.simple_spinner_item, chords);

                chordAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerChord1.setAdapter(chordAdapter1);
                spinnerChord1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        setSelectedChord(parent.getItemAtPosition(position).toString());

                        ImageView imageViewChord1 = (ImageView)findViewById(R.id.imageViewChord1);
                        imageViewChord1.setImageResource(chordDrawableHashMap.get(selected_chord));

                        imageButtonPlay1.setOnClickListener(new View.OnClickListener(){

                            public void onClick(View v) {
                                stopPlaying();
                                mediaPlayer = MediaPlayer.create(SequencerActivity.this, chordRawHashMap.get(selected_chord));
                                mediaPlayer.start();
                            }
                        });

                        Toast.makeText(parent.getContext(), "Selected: " + selected_chord, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerNote2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected_tuning = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), "Selected: " + selected_tuning, Toast.LENGTH_LONG).show();

                Spinner spinnerChord2 = (Spinner)findViewById(R.id.spinnerChord2);
                String [] chords = ukuleleChordUtil.createUkuleleChords(selected_tuning);

                ArrayAdapter<String> chordAdapter2 = new ArrayAdapter<String>(SequencerActivity.this, android.R.layout.simple_spinner_item, chords);

                chordAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerChord2.setAdapter(chordAdapter2);
                spinnerChord2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String selected_tuning = parent.getItemAtPosition(position).toString();
                        ImageView imageViewChord2 = (ImageView)findViewById(R.id.imageViewChord2);
                        imageViewChord2.setImageResource(chordDrawableHashMap.get(selected_tuning));

                        Toast.makeText(parent.getContext(), "Selected: " + selected_tuning, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
