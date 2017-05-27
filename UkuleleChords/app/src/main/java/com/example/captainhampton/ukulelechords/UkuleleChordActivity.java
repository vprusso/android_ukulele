package com.example.captainhampton.ukulelechords;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class UkuleleChordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ukulele_list_chords);

        String ukulele_note = getIntent().getStringExtra("UKULELE_NOTE_ID");
        Toast.makeText(UkuleleChordActivity.this, ukulele_note, Toast.LENGTH_LONG).show();

        if (ukulele_note.equals("A")) {
            final String[] ukulele_chords = {"A Major", "A Minor", "A 7", "A m7", "A maj7",
                    "A m#7 (mM7)", "A 7b5", "A 7#5", "A m7b5", "A 7b9",
                    "A b5", "A 5 Power Chord", "A 6", "A m6", "A 69",
                    "A 9", "A 9b5", "A 9x5", "A m9", "A maj9", "A add9",
                    "A 7#9", "A 11", "A m11", "A 13", "A maj13", "A sus2",
                    "A sus4", "A7 sus4", "A9 sus4", "A dim", "A half dim",
                    "A dim7", "A aug", "A/C#", "A/E", "A/G#", "A/G", "A/B"};

            ListAdapter chordAdapter = new UkuleleChordAdapter(this, ukulele_chords);
            ListView ukuleleChordsListView = (ListView) findViewById(R.id.ukuleleChordsListView);
            ukuleleChordsListView.setAdapter(chordAdapter);

            ukuleleChordsListView.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            String chord = String.valueOf(parent.getItemAtPosition(position));

                            Intent chordIntent = new Intent(UkuleleChordActivity.this, UkuleleSelectedChordActivity.class);
                            chordIntent.putExtra("UKULELE_CHORD_ID", chord);
                            startActivity(chordIntent);
                        }
                    }
            );


        } else if (ukulele_note.equals("B")) {
            final String[] ukulele_chords = {"B Major", "B Minor", "B 7", "B m7", "B maj7",
                    "B m#7 (mM7)", "B 7b5", "B 7#5", "B m7b5", "B 7b9",
                    "B b5", "B 5 Power Chord", "B 6", "B m6", "B 69",
                    "B 9", "B 9b5", "B 9x5", "B m9", "B maj9", "B add9",
                    "B 7#9", "B 11", "B m11", "B 13", "B maj13", "B sus2",
                    "B sus4", "B7 sus4", "B9 sus4", "B dim", "B half dim",
                    "B dim7", "B aug", "B/D#", "B/F", "B/A#", "B/A", "B/C#"};
        } else{
            Toast.makeText(UkuleleChordActivity.this, "ERROR: Note not found...", Toast.LENGTH_LONG).show();
        }

    }
}
