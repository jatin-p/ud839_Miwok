package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceID=imageResourceID;
    }

    public String getDefaultTranslation (){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {return mImageResourceID != NO_IMAGE;}
}
