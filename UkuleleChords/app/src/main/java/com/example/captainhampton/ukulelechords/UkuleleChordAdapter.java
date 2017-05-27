package com.example.captainhampton.ukulelechords;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class UkuleleChordAdapter extends ArrayAdapter<String> {

    public UkuleleChordAdapter(Context context, String[] ukulele_notes) {
        super(context, R.layout.ukulele_chord_row, ukulele_notes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater chordInflator = LayoutInflater.from(getContext());
        View chordView = chordInflator.inflate(R.layout.ukulele_chord_row, parent, false);

        String chord = getItem(position);
        TextView guitarChordTextView = (TextView) chordView.findViewById(R.id.ukuleleChordTextView);
        ImageView chordDiagramImageView = (ImageView) chordView.findViewById(R.id.chordDiagramImageView);

        guitarChordTextView.setText(chord);

        if (chord.equals("A Major")) {
            chordDiagramImageView.setImageResource(R.drawable.ukulele_a_major);
        } else {
            chordDiagramImageView.setImageResource(R.drawable.ukulele_a_major);
        }

        return chordView;
    }

}
