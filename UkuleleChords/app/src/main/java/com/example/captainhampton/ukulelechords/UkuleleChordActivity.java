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

    private UkuleleChordUtil ukuleleChordUtil = new UkuleleChordUtil();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ukulele_list_chords);

        String ukulele_note = getIntent().getStringExtra("UKULELE_NOTE_ID");
        //Toast.makeText(UkuleleChordActivity.this, ukulele_note, Toast.LENGTH_LONG).show();

        final String[] ukulele_chords = ukuleleChordUtil.createUkuleleChords(ukulele_note);
        ukuleleChordViewTransition(ukulele_chords);

    }

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

}
