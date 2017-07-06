package com.example.android.booklistingapp;

/**
 * Created by mhesah on 2017-07-06. DATA OBJECT
 */

public class Data {
    String mAuthor;
    String mTitle;
    String mUrl;
    String mDescription;

    public Data(String mAuthor, String mTitle, String mUrl, String mDescription) {
        this.mAuthor = mAuthor;
        this.mTitle = mTitle;
        this.mUrl = mUrl;
        this.mDescription = mDescription;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
