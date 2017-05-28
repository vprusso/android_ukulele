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

    public void ukuleleChordViewTransition(String[] ukulele_chords) {
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
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ukulele_list_chords);

        String ukulele_note = getIntent().getStringExtra("UKULELE_NOTE_ID");
        Toast.makeText(UkuleleChordActivity.this, ukulele_note, Toast.LENGTH_LONG).show();

        if (ukulele_note.equals("C")) {
            final String[] ukulele_chords = {"C maj", "C min", "C aug", "C dim", "C dom7", "C maj7", "C min7",
                    "C aug7", "C dim7", "C add9", "C madd9", "C 6", "C min6", "C 5",
                    "C dom9", "C maj9", "C min9", "C dom13", "C sus4", "C sus2",
                    "C 7sus4", "C 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("C#")) {
            final String[] ukulele_chords = {"C# maj", "C# min", "C# aug", "C# dim", "C# dom7", "C# maj7", "C# min7",
                    "C# aug7", "C# dim7", "C# add9", "C# madd9", "C# 6", "C# min6", "C# 5",
                    "C# dom9", "C# maj9", "C# min9", "C# dom13", "C# sus4", "C# sus2",
                    "C# 7sus4", "C# 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("Db")) {
            final String[] ukulele_chords = {"Db maj", "Db min", "Db aug", "Db dim", "Db dom7", "Db maj7", "Db min7",
                    "Db aug7", "Db dim7", "Db add9", "Db madd9", "Db 6", "Db min6", "Db 5",
                    "Db dom9", "Db maj9", "Db min9", "Db dom13", "Db sus4", "Db sus2",
                    "Db 7sus4", "Db 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("D")) {
            final String[] ukulele_chords = {"D maj", "D min", "D aug", "D dim", "D dom7", "D maj7", "D min7",
                    "D aug7", "D dim7", "D add9", "D madd9", "D 6", "D min6", "D 5",
                    "D dom9", "D maj9", "D min9", "D dom13", "D sus4", "D sus2",
                    "D 7sus4", "D 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("Eb")) {
            final String[] ukulele_chords = {"Eb maj", "Eb min", "Eb aug", "Eb dim", "Eb dom7", "Eb maj7", "Eb min7",
                    "Eb aug7", "Eb dim7", "Eb add9", "Eb madd9", "Eb 6", "Eb min6", "Eb 5",
                    "Eb dom9", "Eb maj9", "Eb min9", "Eb dom13", "Eb sus4", "Eb sus2",
                    "Eb 7sus4", "Eb 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("E")) {
            final String[] ukulele_chords = {"E maj", "E min", "E aug", "E dim", "E dom7", "E maj7", "E min7",
                    "E aug7", "E dim7", "E add9", "E madd9", "E 6", "E min6", "E 5",
                    "E dom9", "E maj9", "E min9", "E dom13", "E sus4", "E sus2",
                    "E 7sus4", "E 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("F")) {
            final String[] ukulele_chords = {"F maj", "F min", "F aug", "F dim", "F dom7", "F maj7", "F min7",
                    "F aug7", "F dim7", "F add9", "F madd9", "F 6", "F min6", "F 5",
                    "F dom9", "F maj9", "F min9", "F dom13", "F sus4", "F sus2",
                    "F 7sus4", "F 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("F#")) {
            final String[] ukulele_chords = {"F# maj", "F# min", "F# aug", "F# dim", "F# dom7", "F# maj7", "F# min7",
                    "F# aug7", "F# dim7", "F# add9", "F# madd9", "F# 6", "F# min6", "F# 5",
                    "F# dom9", "F# maj9", "F# min9", "F# dom13", "F# sus4", "F# sus2",
                    "F# 7sus4", "F# 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("Gb")) {
            final String[] ukulele_chords = {"Gb maj", "Gb min", "Gb aug", "Gb dim", "Gb dom7", "Gb maj7", "Gb min7",
                    "Gb aug7", "Gb dim7", "Gb add9", "Gb madd9", "Gb 6", "Gb min6", "Gb 5",
                    "Gb dom9", "Gb maj9", "Gb min9", "Gb dom13", "Gb sus4", "Gb sus2",
                    "Gb 7sus4", "Gb 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("G")) {
            final String[] ukulele_chords = {"G maj", "G min", "G aug", "G dim", "G dom7", "G maj7", "G min7",
                    "G aug7", "G dim7", "G add9", "G madd9", "G 6", "G min6", "G 5",
                    "G dom9", "G maj9", "G min9", "G dom13", "G sus4", "G sus2",
                    "G 7sus4", "G 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("G#")) {
            final String[] ukulele_chords = {"G# maj", "G# min", "G# aug", "G# dim", "G# dom7", "G# maj7", "G# min7",
                    "G# aug7", "G# dim7", "G# add9", "G# madd9", "G# 6", "G# min6", "G# 5",
                    "G# dom9", "G# maj9", "G# min9", "G# dom13", "G# sus4", "G# sus2",
                    "G# 7sus4", "G# 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("Ab")) {
            final String[] ukulele_chords = {"Ab maj", "Ab min", "Ab aug", "Ab dim", "Ab dom7", "Ab maj7", "Ab min7",
                    "Ab aug7", "Ab dim7", "Ab add9", "Ab madd9", "Ab 6", "Ab min6", "Ab 5",
                    "Ab dom9", "Ab maj9", "Ab min9", "Ab dom13", "Ab sus4", "Ab sus2",
                    "Ab 7sus4", "Ab 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("A")) {
            final String[] ukulele_chords = {"A maj", "A min", "A aug", "A dim", "A dom7", "A maj7", "A min7",
                    "A aug7", "A dim7", "A add9", "A madd9", "A 6", "A min6", "A 5",
                    "A dom9", "A maj9", "A min9", "A dom13", "A sus4", "A sus2",
                    "A 7sus4", "A 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("A#")) {
            final String[] ukulele_chords = {"A# maj", "A# min", "A# aug", "A# dim", "A# dom7", "A# maj7", "A# min7",
                    "A# aug7", "A# dim7", "A# add9", "A# madd9", "A# 6", "A# min6", "A# 5",
                    "A# dom9", "A# maj9", "A# min9", "A# dom13", "A# sus4", "A# sus2",
                    "A# 7sus4", "A# 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("Bb")) {
            final String[] ukulele_chords = {"Bb maj", "Bb min", "Bb aug", "Bb dim", "Bb dom7", "Bb maj7", "Bb min7",
                    "Bb aug7", "Bb dim7", "Bb add9", "Bb madd9", "Bb 6", "Bb min6", "Bb 5",
                    "Bb dom9", "Bb maj9", "Bb min9", "Bb dom13", "Bb sus4", "Bb sus2",
                    "Bb 7sus4", "Bb 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else if (ukulele_note.equals("B")) {
            final String[] ukulele_chords = {"B maj", "B min", "B aug", "B dim", "B dom7", "B maj7", "B min7",
                    "B aug7", "B dim7", "B add9", "B madd9", "B 6", "B min6", "B 5",
                    "B dom9", "B maj9", "B min9", "B dom13", "B sus4", "B sus2",
                    "B 7sus4", "B 7sus2"};
            ukuleleChordViewTransition(ukulele_chords);
        } else{
            Toast.makeText(UkuleleChordActivity.this, "ERROR: Note not found...", Toast.LENGTH_LONG).show();
        }

    }
}
