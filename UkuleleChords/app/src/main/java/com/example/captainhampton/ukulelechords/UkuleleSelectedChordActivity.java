package com.example.captainhampton.ukulelechords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

public class UkuleleSelectedChordActivity extends AppCompatActivity {

    public void ukuleleSelectedChordViewTransition(String[] ukulele_chords) {
        ListAdapter selectedChordAdapter = new UkuleleSelectedChordAdapter(this, ukulele_chords);
        ListView selectedChordsListView = (ListView) findViewById(R.id.ukuleleSelectedChordsListView);
        selectedChordsListView.setAdapter(selectedChordAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ukulele_selected_chord);

        String ukulele_chord = getIntent().getStringExtra("UKULELE_CHORD_ID");
        final String[] ukulele_chords = { ukulele_chord };
        ukuleleSelectedChordViewTransition(ukulele_chords);
    }
}
