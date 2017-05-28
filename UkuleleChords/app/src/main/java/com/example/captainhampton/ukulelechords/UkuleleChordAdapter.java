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
        TextView ukuleleChordTextView = (TextView) chordView.findViewById(R.id.ukuleleChordTextView);
        TextView ukuleleVerboseChordTextView = (TextView) chordView.findViewById(R.id.ukuleleVerboseChordTextView);
        ImageView chordDiagramImageView = (ImageView) chordView.findViewById(R.id.chordDiagramImageView);

        ukuleleChordTextView.setText(chord);
        ukuleleVerboseChordTextView.setText(getVerboseChord(chord));

        if (chord.equals("A maj")) {
            chordDiagramImageView.setImageResource(R.drawable.a_maj);
        } else if (chord.equals("A min")) {
            chordDiagramImageView.setImageResource(R.drawable.a_min);
        } else if (chord.equals("A aug")) {
            chordDiagramImageView.setImageResource(R.drawable.a_aug);
        }

        return chordView;
    }

    public String getVerboseChord(String chord) {
        String[] chord_parts = chord.split(" ");

        String root_type = chord_parts[0];
        String chord_type = chord_parts[1];

        if (chord_type.equals("maj")) {
            return root_type + " " + "Major";
        } else if (chord_type.equals("min")) {
            return root_type + " " + "Minor";
        } else if (chord_type.equals("aug")) {
            return root_type + " " + "Augmented";
        } else if (chord_type.equals("dim")) {
            return root_type + " " + "Diminished";
        } else if (chord_type.equals("dom7")) {
            return root_type + " " + "Dominant 7";
        } else if (chord_type.equals("maj7")) {
            return root_type + " " + "Major 7";
        } else if (chord_type.equals("min7")) {
            return root_type + " " + "Minor 7";
        } else if (chord_type.equals("aug7")) {
            return root_type + " " + "Augmented 7";
        } else if (chord_type.equals("dim7")) {
            return root_type + " " + "Diminished 7";
        } else if (chord_type.equals("add9")) {
            return root_type + " " + "Add 9";
        } else if (chord_type.equals("madd9")) {
            return root_type + " " + "Major Add 9";
        } else if (chord_type.equals("6")) {
            return root_type + " " + "6";
        } else if (chord_type.equals("min6")) {
            return root_type + " " + "Minor 6";
        } else if (chord_type.equals("5")) {
            return root_type + " " + "5";
        } else if (chord_type.equals("dom9")) {
            return root_type + " " + "Dominant 9";
        } else if (chord_type.equals("maj9")) {
            return root_type + " " + "Major 9";
        } else if (chord_type.equals("min9")) {
            return root_type + " " + "Minor 9";
        } else if (chord_type.equals("dom13")) {
            return root_type + " " + "Dominant 13";
        } else if (chord_type.equals("sus4")) {
            return root_type + " " + "Suspended 4";
        } else if (chord_type.equals("sus2")) {
            return root_type + " " + "Suspended 2";
        } else if (chord_type.equals("7sus4")) {
            return root_type + " " + "7 Suspended 4";
        } else if (chord_type.equals("7sus2")) {
            return root_type + " " + "7 Suspended 2";
        } else {
            return "";
        }
    }

}
