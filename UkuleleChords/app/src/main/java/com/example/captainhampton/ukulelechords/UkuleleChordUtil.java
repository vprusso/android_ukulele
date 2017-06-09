package com.example.captainhampton.ukulelechords;

import java.util.HashMap;


public class UkuleleChordUtil {

    public String[] createUkuleleChords(String ukulele_note) {
        final String[] chord_types = {"maj", "min", "aug", "dim", "dom7", "maj7", "min7",
                "aug7", "dim7", "add9", "madd9", "6", "min6", "5",
                "dom9", "maj9", "min9", "dom13", "sus4", "sus2",
                "7sus4", "7sus2"};

        String[] ukulele_chords = new String[chord_types.length];
        for (int i = 0; i < chord_types.length; i++) {
            ukulele_chords[i] = ukulele_note + " " + chord_types[i];
        }
        return ukulele_chords;

    }

    public HashMap<String, Integer> getSelectedChordDrawableHashMap() {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        /* CHORD : A */
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

        /* CHORD : A# */
        hmap.put("A# maj", R.drawable.ashp_maj);
        hmap.put("A# min", R.drawable.ashp_min);
        hmap.put("A# aug", R.drawable.ashp_aug);
        hmap.put("A# dim", R.drawable.ashp_dim);
        hmap.put("A# dom7", R.drawable.ashp_dom7);
        hmap.put("A# maj7", R.drawable.ashp_maj7);
        hmap.put("A# min7", R.drawable.ashp_min7);
        hmap.put("A# aug7", R.drawable.ashp_aug7);
        hmap.put("A# dim7", R.drawable.ashp_dim7);
        hmap.put("A# add9", R.drawable.ashp_add9);
        hmap.put("A# madd9", R.drawable.ashp_madd9);
        hmap.put("A# 6", R.drawable.ashp_6);
        hmap.put("A# min6", R.drawable.ashp_min6);
        hmap.put("A# 5", R.drawable.ashp_5);
        hmap.put("A# dom9", R.drawable.ashp_dom9);
        hmap.put("A# maj9", R.drawable.ashp_maj9);
        hmap.put("A# min9", R.drawable.ashp_min9);
        hmap.put("A# dom13", R.drawable.ashp_dom13);
        hmap.put("A# sus4", R.drawable.ashp_sus4);
        hmap.put("A# sus2", R.drawable.ashp_sus2);
        hmap.put("A# 7sus4", R.drawable.ashp_7sus4);
        hmap.put("A# 7sus2", R.drawable.ashp_7sus2);

        /* CHORD : B */
        hmap.put("B maj", R.drawable.b_maj);
        hmap.put("B min", R.drawable.b_min);
        hmap.put("B aug", R.drawable.b_aug);
        hmap.put("B dim", R.drawable.b_dim);
        hmap.put("B dom7", R.drawable.b_dom7);
        hmap.put("B maj7", R.drawable.b_maj7);
        hmap.put("B min7", R.drawable.b_min7);
        hmap.put("B aug7", R.drawable.b_aug7);
        hmap.put("B dim7", R.drawable.b_dim7);
        hmap.put("B add9", R.drawable.b_add9);
        hmap.put("B madd9", R.drawable.b_madd9);
        hmap.put("B 6", R.drawable.b_6);
        hmap.put("B min6", R.drawable.b_min6);
        hmap.put("B 5", R.drawable.b_5);
        hmap.put("B dom9", R.drawable.b_dom9);
        hmap.put("B maj9", R.drawable.b_maj9);
        hmap.put("B min9", R.drawable.b_min9);
        hmap.put("B dom13", R.drawable.b_dom13);
        hmap.put("B sus4", R.drawable.b_sus4);
        hmap.put("B sus2", R.drawable.b_sus2);
        hmap.put("B 7sus4", R.drawable.b_7sus4);
        hmap.put("B 7sus2", R.drawable.b_7sus2);

        /* CHORD : C */
        hmap.put("C maj", R.drawable.c_maj);
        hmap.put("C min", R.drawable.c_min);
        hmap.put("C aug", R.drawable.c_aug);
        hmap.put("C dim", R.drawable.c_dim);
        hmap.put("C dom7", R.drawable.c_dom7);
        hmap.put("C maj7", R.drawable.c_maj7);
        hmap.put("C min7", R.drawable.c_min7);
        hmap.put("C aug7", R.drawable.c_aug7);
        hmap.put("C dim7", R.drawable.c_dim7);
        hmap.put("C add9", R.drawable.c_add9);
        hmap.put("C madd9", R.drawable.c_madd9);
        hmap.put("C 6", R.drawable.c_6);
        hmap.put("C min6", R.drawable.c_min6);
        hmap.put("C 5", R.drawable.c_5);
        hmap.put("C dom9", R.drawable.c_dom9);
        hmap.put("C maj9", R.drawable.c_maj9);
        hmap.put("C min9", R.drawable.c_min9);
        hmap.put("C dom13", R.drawable.c_dom13);
        hmap.put("C sus4", R.drawable.c_sus4);
        hmap.put("C sus2", R.drawable.c_sus2);
        hmap.put("C 7sus4", R.drawable.c_7sus4);
        hmap.put("C 7sus2", R.drawable.c_7sus2);

        /* CHORD : C# */
        hmap.put("C# maj", R.drawable.cshp_maj);
        hmap.put("C# min", R.drawable.cshp_min);
        hmap.put("C# aug", R.drawable.cshp_aug);
        hmap.put("C# dim", R.drawable.cshp_dim);
        hmap.put("C# dom7", R.drawable.cshp_dom7);
        hmap.put("C# maj7", R.drawable.cshp_maj7);
        hmap.put("C# min7", R.drawable.cshp_min7);
        hmap.put("C# aug7", R.drawable.cshp_aug7);
        hmap.put("C# dim7", R.drawable.cshp_dim7);
        hmap.put("C# add9", R.drawable.cshp_add9);
        hmap.put("C# madd9", R.drawable.cshp_madd9);
        hmap.put("C# 6", R.drawable.cshp_6);
        hmap.put("C# min6", R.drawable.cshp_min6);
        hmap.put("C# 5", R.drawable.cshp_5);
        hmap.put("C# dom9", R.drawable.cshp_dom9);
        hmap.put("C# maj9", R.drawable.cshp_maj9);
        hmap.put("C# min9", R.drawable.cshp_min9);
        hmap.put("C# dom13", R.drawable.cshp_dom13);
        hmap.put("C# sus4", R.drawable.cshp_sus4);
        hmap.put("C# sus2", R.drawable.cshp_sus2);
        hmap.put("C# 7sus4", R.drawable.cshp_7sus4);
        hmap.put("C# 7sus2", R.drawable.cshp_7sus2);

        /* CHORD : D */
        hmap.put("D maj", R.drawable.d_maj);
        hmap.put("D min", R.drawable.d_min);
        hmap.put("D aug", R.drawable.d_aug);
        hmap.put("D dim", R.drawable.d_dim);
        hmap.put("D dom7", R.drawable.d_dom7);
        hmap.put("D maj7", R.drawable.d_maj7);
        hmap.put("D min7", R.drawable.d_min7);
        hmap.put("D aug7", R.drawable.d_aug7);
        hmap.put("D dim7", R.drawable.d_dim7);
        hmap.put("D add9", R.drawable.d_add9);
        hmap.put("D madd9", R.drawable.d_madd9);
        hmap.put("D 6", R.drawable.d_6);
        hmap.put("D min6", R.drawable.d_min6);
        hmap.put("D 5", R.drawable.d_5);
        hmap.put("D dom9", R.drawable.d_dom9);
        hmap.put("D maj9", R.drawable.d_maj9);
        hmap.put("D min9", R.drawable.d_min9);
        hmap.put("D dom13", R.drawable.d_dom13);
        hmap.put("D sus4", R.drawable.d_sus4);
        hmap.put("D sus2", R.drawable.d_sus2);
        hmap.put("D 7sus4", R.drawable.d_7sus4);
        hmap.put("D 7sus2", R.drawable.d_7sus2);

        /* CHORD : D# */
        hmap.put("D# maj", R.drawable.dshp_maj);
        hmap.put("D# min", R.drawable.dshp_min);
        hmap.put("D# aug", R.drawable.dshp_aug);
        hmap.put("D# dim", R.drawable.dshp_dim);
        hmap.put("D# dom7", R.drawable.dshp_dom7);
        hmap.put("D# maj7", R.drawable.dshp_maj7);
        hmap.put("D# min7", R.drawable.dshp_min7);
        hmap.put("D# aug7", R.drawable.dshp_aug7);
        hmap.put("D# dim7", R.drawable.dshp_dim7);
        hmap.put("D# add9", R.drawable.dshp_add9);
        hmap.put("D# madd9", R.drawable.dshp_madd9);
        hmap.put("D# 6", R.drawable.dshp_6);
        hmap.put("D# min6", R.drawable.dshp_min6);
        hmap.put("D# 5", R.drawable.dshp_5);
        hmap.put("D# dom9", R.drawable.dshp_dom9);
        hmap.put("D# maj9", R.drawable.dshp_maj9);
        hmap.put("D# min9", R.drawable.dshp_min9);
        hmap.put("D# dom13", R.drawable.dshp_dom13);
        hmap.put("D# sus4", R.drawable.dshp_sus4);
        hmap.put("D# sus2", R.drawable.dshp_sus2);
        hmap.put("D# 7sus4", R.drawable.dshp_7sus4);
        hmap.put("D# 7sus2", R.drawable.dshp_7sus2);

        /* CHORD : E */
        hmap.put("E maj", R.drawable.e_maj);
        hmap.put("E min", R.drawable.e_min);
        hmap.put("E aug", R.drawable.e_aug);
        hmap.put("E dim", R.drawable.e_dim);
        hmap.put("E dom7", R.drawable.e_dom7);
        hmap.put("E maj7", R.drawable.e_maj7);
        hmap.put("E min7", R.drawable.e_min7);
        hmap.put("E aug7", R.drawable.e_aug7);
        hmap.put("E dim7", R.drawable.e_dim7);
        hmap.put("E add9", R.drawable.e_add9);
        hmap.put("E madd9", R.drawable.e_madd9);
        hmap.put("E 6", R.drawable.e_6);
        hmap.put("E min6", R.drawable.e_min6);
        hmap.put("E 5", R.drawable.e_5);
        hmap.put("E dom9", R.drawable.e_dom9);
        hmap.put("E maj9", R.drawable.e_maj9);
        hmap.put("E min9", R.drawable.e_min9);
        hmap.put("E dom13", R.drawable.e_dom13);
        hmap.put("E sus4", R.drawable.e_sus4);
        hmap.put("E sus2", R.drawable.e_sus2);
        hmap.put("E 7sus4", R.drawable.e_7sus4);
        hmap.put("E 7sus2", R.drawable.e_7sus2);

        /* CHORD : F */
        hmap.put("F maj", R.drawable.f_maj);
        hmap.put("F min", R.drawable.f_min);
        hmap.put("F aug", R.drawable.f_aug);
        hmap.put("F dim", R.drawable.f_dim);
        hmap.put("F dom7", R.drawable.f_dom7);
        hmap.put("F maj7", R.drawable.f_maj7);
        hmap.put("F min7", R.drawable.f_min7);
        hmap.put("F aug7", R.drawable.f_aug7);
        hmap.put("F dim7", R.drawable.f_dim7);
        hmap.put("F add9", R.drawable.f_add9);
        hmap.put("F madd9", R.drawable.f_madd9);
        hmap.put("F 6", R.drawable.f_6);
        hmap.put("F min6", R.drawable.f_min6);
        hmap.put("F 5", R.drawable.f_5);
        hmap.put("F dom9", R.drawable.f_dom9);
        hmap.put("F maj9", R.drawable.f_maj9);
        hmap.put("F min9", R.drawable.f_min9);
        hmap.put("F dom13", R.drawable.f_dom13);
        hmap.put("F sus4", R.drawable.f_sus4);
        hmap.put("F sus2", R.drawable.f_sus2);
        hmap.put("F 7sus4", R.drawable.f_7sus4);
        hmap.put("F 7sus2", R.drawable.f_7sus2);

        /* CHORD : F# */
        hmap.put("F# maj", R.drawable.fshp_maj);
        hmap.put("F# min", R.drawable.fshp_min);
        hmap.put("F# aug", R.drawable.fshp_aug);
        hmap.put("F# dim", R.drawable.fshp_dim);
        hmap.put("F# dom7", R.drawable.fshp_dom7);
        hmap.put("F# maj7", R.drawable.fshp_maj7);
        hmap.put("F# min7", R.drawable.fshp_min7);
        hmap.put("F# aug7", R.drawable.fshp_aug7);
        hmap.put("F# dim7", R.drawable.fshp_dim7);
        hmap.put("F# add9", R.drawable.fshp_add9);
        hmap.put("F# madd9", R.drawable.fshp_madd9);
        hmap.put("F# 6", R.drawable.fshp_6);
        hmap.put("F# min6", R.drawable.fshp_min6);
        hmap.put("F# 5", R.drawable.fshp_5);
        hmap.put("F# dom9", R.drawable.fshp_dom9);
        hmap.put("F# maj9", R.drawable.fshp_maj9);
        hmap.put("F# min9", R.drawable.fshp_min9);
        hmap.put("F# dom13", R.drawable.fshp_dom13);
        hmap.put("F# sus4", R.drawable.fshp_sus4);
        hmap.put("F# sus2", R.drawable.fshp_sus2);
        hmap.put("F# 7sus4", R.drawable.fshp_7sus4);
        hmap.put("F# 7sus2", R.drawable.fshp_7sus2);

        /* CHORD : G */
        hmap.put("G maj", R.drawable.g_maj);
        hmap.put("G min", R.drawable.g_min);
        hmap.put("G aug", R.drawable.g_aug);
        hmap.put("G dim", R.drawable.g_dim);
        hmap.put("G dom7", R.drawable.g_dom7);
        hmap.put("G maj7", R.drawable.g_maj7);
        hmap.put("G min7", R.drawable.g_min7);
        hmap.put("G aug7", R.drawable.g_aug7);
        hmap.put("G dim7", R.drawable.g_dim7);
        hmap.put("G add9", R.drawable.g_add9);
        hmap.put("G madd9", R.drawable.g_madd9);
        hmap.put("G 6", R.drawable.g_6);
        hmap.put("G min6", R.drawable.g_min6);
        hmap.put("G 5", R.drawable.g_5);
        hmap.put("G dom9", R.drawable.g_dom9);
        hmap.put("G maj9", R.drawable.g_maj9);
        hmap.put("G min9", R.drawable.g_min9);
        hmap.put("G dom13", R.drawable.g_dom13);
        hmap.put("G sus4", R.drawable.g_sus4);
        hmap.put("G sus2", R.drawable.g_sus2);
        hmap.put("G 7sus4", R.drawable.g_7sus4);
        hmap.put("G 7sus2", R.drawable.g_7sus2);

        /* CHORD : G# */
        hmap.put("G# maj", R.drawable.gshp_maj);
        hmap.put("G# min", R.drawable.gshp_min);
        hmap.put("G# aug", R.drawable.gshp_aug);
        hmap.put("G# dim", R.drawable.gshp_dim);
        hmap.put("G# dom7", R.drawable.gshp_dom7);
        hmap.put("G# maj7", R.drawable.gshp_maj7);
        hmap.put("G# min7", R.drawable.gshp_min7);
        hmap.put("G# aug7", R.drawable.gshp_aug7);
        hmap.put("G# dim7", R.drawable.gshp_dim7);
        hmap.put("G# add9", R.drawable.gshp_add9);
        hmap.put("G# madd9", R.drawable.gshp_madd9);
        hmap.put("G# 6", R.drawable.gshp_6);
        hmap.put("G# min6", R.drawable.gshp_min6);
        hmap.put("G# 5", R.drawable.gshp_5);
        hmap.put("G# dom9", R.drawable.gshp_dom9);
        hmap.put("G# maj9", R.drawable.gshp_maj9);
        hmap.put("G# min9", R.drawable.gshp_min9);
        hmap.put("G# dom13", R.drawable.gshp_dom13);
        hmap.put("G# sus4", R.drawable.gshp_sus4);
        hmap.put("G# sus2", R.drawable.gshp_sus2);
        hmap.put("G# 7sus4", R.drawable.gshp_7sus4);
        hmap.put("G# 7sus2", R.drawable.gshp_7sus2);


        return hmap;
    }

    public HashMap<String, Integer> getSelectedChordRawHashMap() {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        /* CHORD SOUND: A */
        hmap.put("A maj", R.raw.a_maj);
        hmap.put("A min", R.raw.a_min);
        hmap.put("A aug", R.raw.a_aug);
        hmap.put("A dim", R.raw.a_dim);
        hmap.put("A dom7", R.raw.a_dom7);
        hmap.put("A maj7", R.raw.a_maj7);
        hmap.put("A min7", R.raw.a_min7);
        hmap.put("A aug7", R.raw.a_aug7);
        hmap.put("A dim7", R.raw.a_dim7);
        hmap.put("A add9", R.raw.a_add9);
        hmap.put("A madd9", R.raw.a_madd9);
        hmap.put("A 6", R.raw.a_6);
        hmap.put("A min6", R.raw.a_min6);
        hmap.put("A 5", R.raw.a_5);
        hmap.put("A dom9", R.drawable.a_dom9);
        hmap.put("A maj9", R.raw.a_maj9);
        hmap.put("A min9", R.raw.a_min9);
        hmap.put("A dom13", R.raw.a_dom13);
        hmap.put("A sus4", R.raw.a_sus4);
        hmap.put("A sus2", R.raw.a_sus2);
        hmap.put("A 7sus4", R.raw.a_7sus4);
        hmap.put("A 7sus2", R.raw.a_7sus2);

        /* CHORD SOUND: A# */
        hmap.put("A# maj", R.raw.ashp_maj);
        hmap.put("A# min", R.raw.ashp_min);
        hmap.put("A# aug", R.raw.ashp_aug);
        hmap.put("A# dim", R.raw.ashp_dim);
        hmap.put("A# dom7", R.raw.ashp_dom7);
        hmap.put("A# maj7", R.raw.ashp_maj7);
        hmap.put("A# min7", R.raw.ashp_min7);
        hmap.put("A# aug7", R.raw.ashp_aug7);
        hmap.put("A# dim7", R.raw.ashp_dim7);
        hmap.put("A# add9", R.raw.ashp_add9);
        hmap.put("A# madd9", R.raw.ashp_madd9);
        hmap.put("A# 6", R.raw.ashp_6);
        hmap.put("A# min6", R.raw.ashp_min6);
        hmap.put("A# 5", R.raw.ashp_5);
        hmap.put("A# dom9", R.drawable.ashp_dom9);
        hmap.put("A# maj9", R.raw.ashp_maj9);
        hmap.put("A# min9", R.raw.ashp_min9);
        hmap.put("A# dom13", R.raw.ashp_dom13);
        hmap.put("A# sus4", R.raw.ashp_sus4);
        hmap.put("A# sus2", R.raw.ashp_sus2);
        hmap.put("A# 7sus4", R.raw.ashp_7sus4);
        hmap.put("A# 7sus2", R.raw.ashp_7sus2);

        /* CHORD : B */
        hmap.put("B maj", R.raw.b_maj);
        hmap.put("B min", R.raw.b_min);
        hmap.put("B aug", R.raw.b_aug);
        hmap.put("B dim", R.raw.b_dim);
        hmap.put("B dom7", R.raw.b_dom7);
        hmap.put("B maj7", R.raw.b_maj7);
        hmap.put("B min7", R.raw.b_min7);
        hmap.put("B aug7", R.raw.b_aug7);
        hmap.put("B dim7", R.raw.b_dim7);
        hmap.put("B add9", R.raw.b_add9);
        hmap.put("B madd9", R.raw.b_madd9);
        hmap.put("B 6", R.raw.b_6);
        hmap.put("B min6", R.raw.b_min6);
        hmap.put("B 5", R.raw.b_5);
        hmap.put("B dom9", R.raw.b_dom9);
        hmap.put("B maj9", R.raw.b_maj9);
        hmap.put("B min9", R.raw.b_min9);
        hmap.put("B dom13", R.raw.b_dom13);
        hmap.put("B sus4", R.raw.b_sus4);
        hmap.put("B sus2", R.raw.b_sus2);
        hmap.put("B 7sus4", R.raw.b_7sus4);
        hmap.put("B 7sus2", R.raw.b_7sus2);

        /* CHORD : C */
        hmap.put("C maj", R.raw.c_maj);
        hmap.put("C min", R.raw.c_min);
        hmap.put("C aug", R.raw.c_aug);
        hmap.put("C dim", R.raw.c_dim);
        hmap.put("C dom7", R.raw.c_dom7);
        hmap.put("C maj7", R.raw.c_maj7);
        hmap.put("C min7", R.raw.c_min7);
        hmap.put("C aug7", R.raw.c_aug7);
        hmap.put("C dim7", R.raw.c_dim7);
        hmap.put("C add9", R.raw.c_add9);
        hmap.put("C madd9", R.raw.c_madd9);
        hmap.put("C 6", R.raw.c_6);
        hmap.put("C min6", R.raw.c_min6);
        hmap.put("C 5", R.raw.c_5);
        hmap.put("C dom9", R.raw.c_dom9);
        hmap.put("C maj9", R.raw.c_maj9);
        hmap.put("C min9", R.raw.c_min9);
        hmap.put("C dom13", R.raw.c_dom13);
        hmap.put("C sus4", R.raw.c_sus4);
        hmap.put("C sus2", R.raw.c_sus2);
        hmap.put("C 7sus4", R.raw.c_7sus4);
        hmap.put("C 7sus2", R.raw.c_7sus2);

        /* CHORD : C# */
        hmap.put("C# maj", R.raw.cshp_maj);
        hmap.put("C# min", R.raw.cshp_min);
        hmap.put("C# aug", R.raw.cshp_aug);
        hmap.put("C# dim", R.raw.cshp_dim);
        hmap.put("C# dom7", R.raw.cshp_dom7);
        hmap.put("C# maj7", R.raw.cshp_maj7);
        hmap.put("C# min7", R.raw.cshp_min7);
        hmap.put("C# aug7", R.raw.cshp_aug7);
        hmap.put("C# dim7", R.raw.cshp_dim7);
        hmap.put("C# add9", R.raw.cshp_add9);
        hmap.put("C# madd9", R.raw.cshp_madd9);
        hmap.put("C# 6", R.raw.cshp_6);
        hmap.put("C# min6", R.raw.cshp_min6);
        hmap.put("C# 5", R.raw.cshp_5);
        hmap.put("C# dom9", R.raw.cshp_dom9);
        hmap.put("C# maj9", R.raw.cshp_maj9);
        hmap.put("C# min9", R.raw.cshp_min9);
        hmap.put("C# dom13", R.raw.cshp_dom13);
        hmap.put("C# sus4", R.raw.cshp_sus4);
        hmap.put("C# sus2", R.raw.cshp_sus2);
        hmap.put("C# 7sus4", R.raw.cshp_7sus4);
        hmap.put("C# 7sus2", R.raw.cshp_7sus2);

        /* CHORD : D */
        hmap.put("D maj", R.raw.d_maj);
        hmap.put("D min", R.raw.d_min);
        hmap.put("D aug", R.raw.d_aug);
        hmap.put("D dim", R.raw.d_dim);
        hmap.put("D dom7", R.raw.d_dom7);
        hmap.put("D maj7", R.raw.d_maj7);
        hmap.put("D min7", R.raw.d_min7);
        hmap.put("D aug7", R.raw.d_aug7);
        hmap.put("D dim7", R.raw.d_dim7);
        hmap.put("D add9", R.raw.d_add9);
        hmap.put("D madd9", R.raw.d_madd9);
        hmap.put("D 6", R.raw.d_6);
        hmap.put("D min6", R.raw.d_min6);
        hmap.put("D 5", R.raw.d_5);
        hmap.put("D dom9", R.raw.d_dom9);
        hmap.put("D maj9", R.raw.d_maj9);
        hmap.put("D min9", R.raw.d_min9);
        hmap.put("D dom13", R.raw.d_dom13);
        hmap.put("D sus4", R.raw.d_sus4);
        hmap.put("D sus2", R.raw.d_sus2);
        hmap.put("D 7sus4", R.raw.d_7sus4);
        hmap.put("D 7sus2", R.raw.d_7sus2);

        /* CHORD : D# */
        hmap.put("D# maj", R.raw.dshp_maj);
        hmap.put("D# min", R.raw.dshp_min);
        hmap.put("D# aug", R.raw.dshp_aug);
        hmap.put("D# dim", R.raw.dshp_dim);
        hmap.put("D# dom7", R.raw.dshp_dom7);
        hmap.put("D# maj7", R.raw.dshp_maj7);
        hmap.put("D# min7", R.raw.dshp_min7);
        hmap.put("D# aug7", R.raw.dshp_aug7);
        hmap.put("D# dim7", R.raw.dshp_dim7);
        hmap.put("D# add9", R.raw.dshp_add9);
        hmap.put("D# madd9", R.raw.dshp_madd9);
        hmap.put("D# 6", R.raw.dshp_6);
        hmap.put("D# min6", R.raw.dshp_min6);
        hmap.put("D# 5", R.raw.dshp_5);
        hmap.put("D# dom9", R.raw.dshp_dom9);
        hmap.put("D# maj9", R.raw.dshp_maj9);
        hmap.put("D# min9", R.raw.dshp_min9);
        hmap.put("D# dom13", R.raw.dshp_dom13);
        hmap.put("D# sus4", R.raw.dshp_sus4);
        hmap.put("D# sus2", R.raw.dshp_sus2);
        hmap.put("D# 7sus4", R.raw.dshp_7sus4);
        hmap.put("D# 7sus2", R.raw.dshp_7sus2);

        /* CHORD : E */
        hmap.put("E maj", R.raw.e_maj);
        hmap.put("E min", R.raw.e_min);
        hmap.put("E aug", R.raw.e_aug);
        hmap.put("E dim", R.raw.e_dim);
        hmap.put("E dom7", R.raw.e_dom7);
        hmap.put("E maj7", R.raw.e_maj7);
        hmap.put("E min7", R.raw.e_min7);
        hmap.put("E aug7", R.raw.e_aug7);
        hmap.put("E dim7", R.raw.e_dim7);
        hmap.put("E add9", R.raw.e_add9);
        hmap.put("E madd9", R.raw.e_madd9);
        hmap.put("E 6", R.raw.e_6);
        hmap.put("E min6", R.raw.e_min6);
        hmap.put("E 5", R.raw.e_5);
        hmap.put("E dom9", R.raw.e_dom9);
        hmap.put("E maj9", R.raw.e_maj9);
        hmap.put("E min9", R.raw.e_min9);
        hmap.put("E dom13", R.raw.e_dom13);
        hmap.put("E sus4", R.raw.e_sus4);
        hmap.put("E sus2", R.raw.e_sus2);
        hmap.put("E 7sus4", R.raw.e_7sus4);
        hmap.put("E 7sus2", R.raw.e_7sus2);

        /* CHORD : F */
        hmap.put("F maj", R.raw.f_maj);
        hmap.put("F min", R.raw.f_min);
        hmap.put("F aug", R.raw.f_aug);
        hmap.put("F dim", R.raw.f_dim);
        hmap.put("F dom7", R.raw.f_dom7);
        hmap.put("F maj7", R.raw.f_maj7);
        hmap.put("F min7", R.raw.f_min7);
        hmap.put("F aug7", R.raw.f_aug7);
        hmap.put("F dim7", R.raw.f_dim7);
        hmap.put("F add9", R.raw.f_add9);
        hmap.put("F madd9", R.raw.f_madd9);
        hmap.put("F 6", R.raw.f_6);
        hmap.put("F min6", R.raw.f_min6);
        hmap.put("F 5", R.raw.f_5);
        hmap.put("F dom9", R.raw.f_dom9);
        hmap.put("F maj9", R.raw.f_maj9);
        hmap.put("F min9", R.raw.f_min9);
        hmap.put("F dom13", R.raw.f_dom13);
        hmap.put("F sus4", R.raw.f_sus4);
        hmap.put("F sus2", R.raw.f_sus2);
        hmap.put("F 7sus4", R.raw.f_7sus4);
        hmap.put("F 7sus2", R.raw.f_7sus2);

        /* CHORD : F# */
        hmap.put("F# maj", R.raw.fshp_maj);
        hmap.put("F# min", R.raw.fshp_min);
        hmap.put("F# aug", R.raw.fshp_aug);
        hmap.put("F# dim", R.raw.fshp_dim);
        hmap.put("F# dom7", R.raw.fshp_dom7);
        hmap.put("F# maj7", R.raw.fshp_maj7);
        hmap.put("F# min7", R.raw.fshp_min7);
        hmap.put("F# aug7", R.raw.fshp_aug7);
        hmap.put("F# dim7", R.raw.fshp_dim7);
        hmap.put("F# add9", R.raw.fshp_add9);
        hmap.put("F# madd9", R.raw.fshp_madd9);
        hmap.put("F# 6", R.raw.fshp_6);
        hmap.put("F# min6", R.raw.fshp_min6);
        hmap.put("F# 5", R.raw.fshp_5);
        hmap.put("F# dom9", R.raw.fshp_dom9);
        hmap.put("F# maj9", R.raw.fshp_maj9);
        hmap.put("F# min9", R.raw.fshp_min9);
        hmap.put("F# dom13", R.raw.fshp_dom13);
        hmap.put("F# sus4", R.raw.fshp_sus4);
        hmap.put("F# sus2", R.raw.fshp_sus2);
        hmap.put("F# 7sus4", R.raw.fshp_7sus4);
        hmap.put("F# 7sus2", R.raw.fshp_7sus2);

        /* CHORD : G */
        hmap.put("G maj", R.raw.g_maj);
        hmap.put("G min", R.raw.g_min);
        hmap.put("G aug", R.raw.g_aug);
        hmap.put("G dim", R.raw.g_dim);
        hmap.put("G dom7", R.raw.g_dom7);
        hmap.put("G maj7", R.raw.g_maj7);
        hmap.put("G min7", R.raw.g_min7);
        hmap.put("G aug7", R.raw.g_aug7);
        hmap.put("G dim7", R.raw.g_dim7);
        hmap.put("G add9", R.raw.g_add9);
        hmap.put("G madd9", R.raw.g_madd9);
        hmap.put("G 6", R.raw.g_6);
        hmap.put("G min6", R.raw.g_min6);
        hmap.put("G 5", R.raw.g_5);
        hmap.put("G dom9", R.raw.g_dom9);
        hmap.put("G maj9", R.raw.g_maj9);
        hmap.put("G min9", R.raw.g_min9);
        hmap.put("G dom13", R.raw.g_dom13);
        hmap.put("G sus4", R.raw.g_sus4);
        hmap.put("G sus2", R.raw.g_sus2);
        hmap.put("G 7sus4", R.raw.g_7sus4);
        hmap.put("G 7sus2", R.raw.g_7sus2);

        /* CHORD : G# */
        hmap.put("G# maj", R.raw.gshp_maj);
        hmap.put("G# min", R.raw.gshp_min);
        hmap.put("G# aug", R.raw.gshp_aug);
        hmap.put("G# dim", R.raw.gshp_dim);
        hmap.put("G# dom7", R.raw.gshp_dom7);
        hmap.put("G# maj7", R.raw.gshp_maj7);
        hmap.put("G# min7", R.raw.gshp_min7);
        hmap.put("G# aug7", R.raw.gshp_aug7);
        hmap.put("G# dim7", R.raw.gshp_dim7);
        hmap.put("G# add9", R.raw.gshp_add9);
        hmap.put("G# madd9", R.raw.gshp_madd9);
        hmap.put("G# 6", R.raw.gshp_6);
        hmap.put("G# min6", R.raw.gshp_min6);
        hmap.put("G# 5", R.raw.gshp_5);
        hmap.put("G# dom9", R.raw.gshp_dom9);
        hmap.put("G# maj9", R.raw.gshp_maj9);
        hmap.put("G# min9", R.raw.gshp_min9);
        hmap.put("G# dom13", R.raw.gshp_dom13);
        hmap.put("G# sus4", R.raw.gshp_sus4);
        hmap.put("G# sus2", R.raw.gshp_sus2);
        hmap.put("G# 7sus4", R.raw.gshp_7sus4);
        hmap.put("G# 7sus2", R.raw.gshp_7sus2);

        return hmap;
    }

}
