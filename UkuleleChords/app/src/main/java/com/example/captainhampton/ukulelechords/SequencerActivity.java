package com.example.captainhampton.ukulelechords;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.HashMap;


public class SequencerActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private UkuleleChordUtil ukuleleChordUtil = new UkuleleChordUtil();
    private HashMap<String, Integer> chordDrawableHashMap = ukuleleChordUtil.getSelectedChordDrawableHashMap();
    private HashMap<String, Integer> chordRawHashMap = ukuleleChordUtil.getSelectedChordRawHashMap();;

    private MediaPlayer mediaPlayer;

    private String selected_chord1;
    private String selected_chord2;
    private String selected_chord3;
    private String selected_chord4;

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

    public void setSelectedChord(String selected_chord, int whichChord) {
        if (whichChord == 1) {
            selected_chord1 = selected_chord;
        } else if (whichChord == 2) {
            selected_chord2 = selected_chord;
        } else if (whichChord == 3) {
            selected_chord3 = selected_chord;
        } else if (whichChord == 4) {
            selected_chord4 = selected_chord;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequencer);

        // Spinner Note elements
        Spinner spinnerNote1 = (Spinner)findViewById(R.id.spinnerNote1);
        Spinner spinnerNote2 = (Spinner)findViewById(R.id.spinnerNote2);
        Spinner spinnerNote3 = (Spinner)findViewById(R.id.spinnerNote3);
        Spinner spinnerNote4 = (Spinner)findViewById(R.id.spinnerNote4);

        // Spinner Drop down elements
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E",
                "F", "F#", "G", "G#"};

        // Creating adapter for spinner
        ArrayAdapter<String> noteAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, notes);
        ArrayAdapter<String> noteAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, notes);
        ArrayAdapter<String> noteAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, notes);
        ArrayAdapter<String> noteAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, notes);

        // Drop down layout style - list view with radio button
        noteAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        noteAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        noteAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        noteAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerNote1.setAdapter(noteAdapter1);
        spinnerNote2.setAdapter(noteAdapter2);
        spinnerNote3.setAdapter(noteAdapter3);
        spinnerNote4.setAdapter(noteAdapter4);

        spinnerNote1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected_tuning = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), "Selected: " + selected_tuning, Toast.LENGTH_LONG).show();

                Spinner spinnerChord1 = (Spinner)findViewById(R.id.spinnerChord1);
                final Button buttonPlay1 = (Button)findViewById(R.id.buttonPlay1);

                String [] chords = ukuleleChordUtil.createUkuleleChords(selected_tuning);

                ArrayAdapter<String> chordAdapter1 = new ArrayAdapter<String>(SequencerActivity.this, android.R.layout.simple_spinner_item, chords);

                chordAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerChord1.setAdapter(chordAdapter1);
                spinnerChord1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        setSelectedChord(parent.getItemAtPosition(position).toString(), 1);

                        ImageView imageViewChord1 = (ImageView)findViewById(R.id.imageViewChord1);
                        imageViewChord1.setImageResource(chordDrawableHashMap.get(selected_chord1));

                        buttonPlay1.setOnClickListener(new View.OnClickListener(){

                            public void onClick(View v) {
                                stopPlaying();
                                mediaPlayer = MediaPlayer.create(SequencerActivity.this, chordRawHashMap.get(selected_chord1));
                                //mediaPlayer = MediaPlayer.create(SequencerActivity.this, R.raw.a_6);
                                mediaPlayer.start();
                            }
                        });

                        //Toast.makeText(parent.getContext(), "Selected: " + selected_chord1, Toast.LENGTH_LONG).show();
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
                final Button buttonPlay2 = (Button)findViewById(R.id.buttonPlay2);
                String [] chords = ukuleleChordUtil.createUkuleleChords(selected_tuning);

                ArrayAdapter<String> chordAdapter2 = new ArrayAdapter<String>(SequencerActivity.this, android.R.layout.simple_spinner_item, chords);

                chordAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerChord2.setAdapter(chordAdapter2);
                spinnerChord2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        setSelectedChord(parent.getItemAtPosition(position).toString(), 2);
                        ImageView imageViewChord2 = (ImageView)findViewById(R.id.imageViewChord2);
                        imageViewChord2.setImageResource(chordDrawableHashMap.get(selected_chord2));


                        buttonPlay2.setOnClickListener(new View.OnClickListener(){

                            public void onClick(View v) {
                                stopPlaying();
                                mediaPlayer = MediaPlayer.create(SequencerActivity.this, chordRawHashMap.get(selected_chord2));
                                mediaPlayer.start();
                            }
                        });

                        //Toast.makeText(parent.getContext(), "Selected: " + selected_chord2, Toast.LENGTH_LONG).show();
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

        spinnerNote3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected_tuning = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), "Selected: " + selected_tuning, Toast.LENGTH_LONG).show();

                Spinner spinnerChord3 = (Spinner)findViewById(R.id.spinnerChord3);
                final Button buttonPlay3 = (Button)findViewById(R.id.buttonPlay3);
                String [] chords = ukuleleChordUtil.createUkuleleChords(selected_tuning);

                ArrayAdapter<String> chordAdapter3 = new ArrayAdapter<String>(SequencerActivity.this, android.R.layout.simple_spinner_item, chords);

                chordAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerChord3.setAdapter(chordAdapter3);
                spinnerChord3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        setSelectedChord(parent.getItemAtPosition(position).toString(), 3);
                        ImageView imageViewChord3 = (ImageView)findViewById(R.id.imageViewChord3);
                        imageViewChord3.setImageResource(chordDrawableHashMap.get(selected_chord3));


                        buttonPlay3.setOnClickListener(new View.OnClickListener(){

                            public void onClick(View v) {
                                stopPlaying();
                                mediaPlayer = MediaPlayer.create(SequencerActivity.this, chordRawHashMap.get(selected_chord3));
                                mediaPlayer.start();
                            }
                        });

                        //Toast.makeText(parent.getContext(), "Selected: " + selected_chord3, Toast.LENGTH_LONG).show();
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

        spinnerNote4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected_tuning = parent.getItemAtPosition(position).toString();

                Spinner spinnerChord4 = (Spinner)findViewById(R.id.spinnerChord4);
                final Button buttonPlay4 = (Button)findViewById(R.id.buttonPlay4);
                String [] chords = ukuleleChordUtil.createUkuleleChords(selected_tuning);

                ArrayAdapter<String> chordAdapter4 = new ArrayAdapter<String>(SequencerActivity.this, android.R.layout.simple_spinner_item, chords);

                chordAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerChord4.setAdapter(chordAdapter4);
                spinnerChord4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        setSelectedChord(parent.getItemAtPosition(position).toString(), 4);
                        ImageView imageViewChord4 = (ImageView)findViewById(R.id.imageViewChord4);
                        imageViewChord4.setImageResource(chordDrawableHashMap.get(selected_chord4));


                        buttonPlay4.setOnClickListener(new View.OnClickListener(){

                            public void onClick(View v) {
                                stopPlaying();
                                mediaPlayer = MediaPlayer.create(SequencerActivity.this, chordRawHashMap.get(selected_chord4));
                                mediaPlayer.start();
                            }
                        });
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
