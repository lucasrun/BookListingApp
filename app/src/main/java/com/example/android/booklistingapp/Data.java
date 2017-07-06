package com.example.android.booklistingapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mhesah on 2017-07-06. DATA OBJECT
 */

public class Data implements Parcelable {
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

    private Data(Parcel in) {
        mAuthor = in.readString();
        mTitle = in.readString();
        mUrl = in.readString();
        mDescription = in.readString();
    }

    public void writeToParcel(Parcel in, int flags) {
        in.writeString(mAuthor);
        in.writeString(mTitle);
        in.writeString(mUrl);
        in.writeString(mDescription);
    }

    public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() {
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public int describeContents() {
        return 0;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmDescription() {
        return mDescription;
    }
}
