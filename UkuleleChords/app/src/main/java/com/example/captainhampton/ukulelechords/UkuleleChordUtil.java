package com.example.captainhampton.ukulelechords;

import java.util.HashMap;


public class UkuleleChordUtil {
    public HashMap<String, Integer> getSelectedChordDrawableHashMap() {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        hmap.put("A maj", R.drawable.a_maj);
        hmap.put("A min", R.drawable.a_min);
        hmap.put("A aug", R.drawable.a_aug);
        hmap.put("A dim", R.drawable.a_dim);
        hmap.put("A dom7", R.drawable.a_dom7);
        hmap.put("A maj7", R.drawable.a_maj7);
        hmap.put("A min7", R.drawable.a_min7);
        hmap.put("A aug7", R.drawable.a_aug7);
        hmap.put("A dim7", R.drawable.a_dim7);
        hmap.put("A add9", R.drawable.a_add9);
        hmap.put("A madd9", R.drawable.a_madd9);
        hmap.put("A 6", R.drawable.a_6);
        hmap.put("A min6", R.drawable.a_min6);
        hmap.put("A 5", R.drawable.a_5);
        hmap.put("A dom9", R.drawable.a_dom9);
        hmap.put("A maj9", R.drawable.a_maj9);
        hmap.put("A min9", R.drawable.a_min9);
        hmap.put("A dom13", R.drawable.a_dom13);
        hmap.put("A sus4", R.drawable.a_sus4);
        hmap.put("A sus2", R.drawable.a_sus2);
        hmap.put("A 7sus4", R.drawable.a_7sus4);
        hmap.put("A 7sus2", R.drawable.a_7sus2);



        return hmap;
    }

    public HashMap<String, Integer> getSelectedChordRawHashMap() {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        hmap.put("A maj", R.raw.a_maj);
        hmap.put("A min", R.raw.a_min);

        // TODO CHANGE THESE:
        hmap.put("A aug", R.raw.a_aug);
        hmap.put("A dim", R.raw.a_dim);
        hmap.put("A dom7", R.raw.a_dom7);
        hmap.put("A maj7", R.raw.a_maj);
        hmap.put("A min7", R.raw.a_maj);
        hmap.put("A aug7", R.raw.a_maj);
        hmap.put("A dim7", R.raw.a_maj);
        hmap.put("A add9", R.raw.a_maj);
        hmap.put("A madd9", R.raw.a_maj);
        hmap.put("A 6", R.raw.a_maj);
        hmap.put("A min6", R.raw.a_maj);
        hmap.put("A 5", R.raw.a_maj);
        hmap.put("A dom9", R.drawable.a_dom9);
        hmap.put("A maj9", R.raw.a_maj);
        hmap.put("A min9", R.raw.a_maj);
        hmap.put("A dom13", R.raw.a_maj);
        hmap.put("A sus4", R.raw.a_maj);
        hmap.put("A sus2", R.raw.a_maj);
        hmap.put("A 7sus4", R.raw.a_maj);
        hmap.put("A 7sus2", R.raw.a_maj);

        return hmap;
    }

}
