package com.example.android.miwok;

import android.media.Image;

public class WordArrayElement {
    String defTranslation;
    String miwTranslation;
    int iconId;

    public WordArrayElement(String d, String m,int i) {
        defTranslation = d;
        miwTranslation = m;
        iconId = i;
    }

    public String getDefTranslation()
    {
        return defTranslation;
    }

    public String getMiwTranslation()
    {
        return miwTranslation;
    }

    public int getIconId() { return iconId;}
}
