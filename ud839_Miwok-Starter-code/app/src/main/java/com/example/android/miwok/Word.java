package com.example.android.miwok;

/**
 * Created by wasif on 24-03-2017.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private final int NO_IMAGE_PROVIDED= -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int img, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = img;
        mAudioResourceId = audioResourceId;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }
}
