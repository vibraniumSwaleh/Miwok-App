package com.example.android.miwok;

public class Word {

    //class states/variables
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private int mRawResourceId;

//    //Word constructor with two parameters
    public Word(String defaultTranslation, String miwokTranslation, int rawResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mRawResourceId = rawResourceId;
    }

    //word constructor with three parameters
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int rawResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mRawResourceId = rawResourceId;
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

    //return audio sound
    public int getRawAudioSound(){
        return mRawResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mRawResourceId=" + mRawResourceId +
                '}';
    }
}
