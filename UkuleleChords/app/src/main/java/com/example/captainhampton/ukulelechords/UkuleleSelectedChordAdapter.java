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

import java.util.HashMap;

public class UkuleleSelectedChordAdapter extends ArrayAdapter<String>{

    private UkuleleChordUtil ukuleleChordUtil = new UkuleleChordUtil();
    private HashMap<String, Integer> chordDrawableHashMap = ukuleleChordUtil.getSelectedChordDrawableHashMap();
    private HashMap<String, Integer> chordRawHashMap = ukuleleChordUtil.getSelectedChordRawHashMap();

    private UkuleleSelectedChordActivity ukuleleSelectedChordActivity = new UkuleleSelectedChordActivity();

    public UkuleleSelectedChordAdapter(Context context, String[] guitar_chord) {
        super(context, R.layout.ukulele_selected_chord_row, guitar_chord);
    }


    private void stopPlaying() {
        if (ukuleleSelectedChordActivity.mediaPlayer != null) {
            ukuleleSelectedChordActivity.mediaPlayer.stop();
            ukuleleSelectedChordActivity.mediaPlayer.release();
            ukuleleSelectedChordActivity.mediaPlayer = null;
        }
    }


    public void setSelectedChordImageButton(final String selectedChord, ImageButton selectedChordImageButton) {
        selectedChordImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                ukuleleSelectedChordActivity.mediaPlayer = MediaPlayer.create(UkuleleSelectedChordAdapter.this.getContext(), chordRawHashMap.get(selectedChord));
                ukuleleSelectedChordActivity.mediaPlayer.start();
            }
        });
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater selectedChordInflator = LayoutInflater.from(getContext());
        View selectedChordView = selectedChordInflator.inflate(R.layout.ukulele_selected_chord_row, parent, false);

        final String selectedChord = getItem(position);
        TextView selectedChordTextView = (TextView) selectedChordView.findViewById(R.id.selectedUkuleleChordTextView);
        ImageView selectedChordDiagramImageView = (ImageView) selectedChordView.findViewById(R.id.selectedChordDiagramImageView);
        ImageButton selectedChordImageButton = (ImageButton) selectedChordView.findViewById(R.id.playChordImageButton);

        final String verboseSelectedChord = ukuleleChordUtil.getVerboseChord(selectedChord);
        selectedChordTextView.setText(verboseSelectedChord);
        selectedChordDiagramImageView.setImageResource(chordDrawableHashMap.get(selectedChord));

        setSelectedChordImageButton(selectedChord, selectedChordImageButton);


        return selectedChordView;
    }

}
