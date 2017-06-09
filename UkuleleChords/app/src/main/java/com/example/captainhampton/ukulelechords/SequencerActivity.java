package com.example.captainhampton.ukulelechords;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SequencerActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private UkuleleChordUtil ukuleleChordUtil = new UkuleleChordUtil();

    // Spinner Note elements
    private Spinner spinnerNote1 = (Spinner)findViewById(R.id.spinnerNote1);

    private ImageView imageViewChord1 = (ImageView)findViewById(R.id.imageViewChord1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequencer);

        // Spinner Drop down elements
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E",
                "F", "F#", "G", "G#"};

        // Creating adapter for spinner
        ArrayAdapter<String> noteAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, notes);

        // Drop down layout style - list view with radio button
        noteAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerNote1.setAdapter(noteAdapter1);

        spinnerNote1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected_tuning = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + selected_tuning, Toast.LENGTH_LONG).show();

                Spinner spinnerChord1 = (Spinner)findViewById(R.id.spinnerChord1);
                String [] chords = ukuleleChordUtil.createUkuleleChords(selected_tuning);

                ArrayAdapter<String> chordAdapter = new ArrayAdapter<String>(SequencerActivity.this, android.R.layout.simple_spinner_item, chords);

                chordAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerChord1.setAdapter(chordAdapter);
                spinnerChord1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String selected_tuning = parent.getItemAtPosition(position).toString();
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
        Spinner spinner = (Spinner) parent;


        if (spinner.getId() == R.id.spinnerChord1) {
        }

        //String selected_tuning = parent.getItemAtPosition(position).toString();
        //setTuning(selected_tuning);

        // Showing selected spinner item
        //Toast.makeText(parent.getContext(), "Selected: " + selected_tuning, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
