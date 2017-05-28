package com.example.captainhampton.ukulelechords;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class UkuleleSelectedChordAdapter extends ArrayAdapter<String>{

    public UkuleleSelectedChordAdapter(Context context, String[] guitar_chord) {
        super(context, R.layout.ukulele_selected_chord_row, guitar_chord);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater selectedChordInflator = LayoutInflater.from(getContext());
        View selectedChordView = selectedChordInflator.inflate(R.layout.ukulele_selected_chord_row, parent, false);

        final String selected_chord = getItem(position);
        TextView selectedChordTextView = (TextView) selectedChordView.findViewById(R.id.selectedUkuleleChordTextView);
        ImageView selectedChordDiagramImageView = (ImageView) selectedChordView.findViewById(R.id.selectedChordDiagramImageView);
        ImageButton selectedChordImageButton = (ImageButton) selectedChordView.findViewById(R.id.playChordImageButton);

        selectedChordTextView.setText(selected_chord);

        if (selected_chord.equals("A maj")) {
            selectedChordDiagramImageView.setImageResource(R.drawable.ukulele_a_maj);

            final MediaPlayer mp = MediaPlayer.create(UkuleleSelectedChordAdapter.this.getContext(), R.raw.color_black);
            selectedChordImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Toast.makeText(UkuleleSelectedChordAdapter.this.getContext(), selected_chord, Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if (selected_chord.equals("A min")) {
            selectedChordDiagramImageView.setImageResource(R.drawable.ukulele_a_min);

            final MediaPlayer mp = MediaPlayer.create(UkuleleSelectedChordAdapter.this.getContext(), R.raw.color_black);
            selectedChordImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Toast.makeText(UkuleleSelectedChordAdapter.this.getContext(), selected_chord, Toast.LENGTH_SHORT).show();
                }
            });
        }

        return selectedChordView;
    }

}
