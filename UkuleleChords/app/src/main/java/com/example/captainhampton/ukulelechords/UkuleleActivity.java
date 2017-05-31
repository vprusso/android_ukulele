package com.example.captainhampton.ukulelechords;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class UkuleleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ukulele_list_notes);

        final String[] ukulele_notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E",
                                        "F", "F#", "G", "G#"};

        ListAdapter ukuleleAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                ukulele_notes);

        ListView ukuleleNotesListView = (ListView) findViewById(R.id.ukuleleNotesListView);
        ukuleleNotesListView.setAdapter(ukuleleAdapter);

        ukuleleNotesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String note = String.valueOf(parent.getItemAtPosition(position));

                        Intent noteIntent = new Intent(UkuleleActivity.this, UkuleleChordActivity.class);
                        noteIntent.putExtra("UKULELE_NOTE_ID", note);
                        startActivity(noteIntent);
                    }
                }
        );
    }

}