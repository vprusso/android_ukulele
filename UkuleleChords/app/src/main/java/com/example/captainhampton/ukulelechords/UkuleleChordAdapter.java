package com.example.captainhampton.ukulelechords;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;


public class UkuleleChordAdapter extends ArrayAdapter<String> {

    private UkuleleChordUtil ukuleleChordUtil = new UkuleleChordUtil();

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
        ukuleleVerboseChordTextView.setText(ukuleleChordUtil.getVerboseChord(chord));

        UkuleleChordUtil ukuleleChordUtil = new UkuleleChordUtil();
        HashMap<String, Integer> chordDrawableHashMap = ukuleleChordUtil.getSelectedChordDrawableHashMap();
        chordDiagramImageView.setImageResource(chordDrawableHashMap.get(chord));

        return chordView;
    }



}
