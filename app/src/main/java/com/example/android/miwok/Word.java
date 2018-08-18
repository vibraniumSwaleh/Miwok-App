package com.example.android.miwok;

public class Word {

    //class states/variables
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    //word constructor
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //return english translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //return miwok translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
