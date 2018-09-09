package com.example.android.miwok;

public class Word {

    //class states/variables
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    //Word constructor with two parameters
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //word constructor with three parameters
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //return english translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //return miwok translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //return image
    public int getImageResourceId() { return mImageResourceId; }

    //return true if Image is present and false if image is absent
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }
}
