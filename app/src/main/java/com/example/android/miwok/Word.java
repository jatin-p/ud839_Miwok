package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    private int mAudioResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mAudioResourceID=audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceID=imageResourceID;
        mAudioResourceID=audioResourceID;
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
    public int getAudioResourceID(){return mAudioResourceID;}

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {return mImageResourceID != NO_IMAGE;}

    /**
     * @return Sting representation of word object to print to logs
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
