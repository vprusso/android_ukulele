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

    public void setSelectedChordImageButton(final MediaPlayer selectedChordSound, ImageButton selectedChordImageButton) {
        selectedChordImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedChordSound.start();
            }
        });
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
            selectedChordDiagramImageView.setImageResource(R.drawable.a_maj);
            final MediaPlayer selectedChordSound = MediaPlayer.create(UkuleleSelectedChordAdapter.this.getContext(), R.raw.a_maj);
            setSelectedChordImageButton(selectedChordSound, selectedChordImageButton);

        } else if (selected_chord.equals("A min")) {
            selectedChordDiagramImageView.setImageResource(R.drawable.a_min);
            final MediaPlayer selectedChordSound = MediaPlayer.create(UkuleleSelectedChordAdapter.this.getContext(), R.raw.a_min);
            setSelectedChordImageButton(selectedChordSound, selectedChordImageButton);

        } else if (selected_chord.equals("A aug")) {
            selectedChordDiagramImageView.setImageResource(R.drawable.a_aug);
            final MediaPlayer selectedChordSound = MediaPlayer.create(UkuleleSelectedChordAdapter.this.getContext(), R.raw.a_aug);
            setSelectedChordImageButton(selectedChordSound, selectedChordImageButton);
        }


        return selectedChordView;
    }

}
