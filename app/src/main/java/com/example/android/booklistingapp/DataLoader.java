package com.example.android.booklistingapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by mhesah on 2017-07-06. LOADER FOR MANAGING INSTANCES
 */

public class DataLoader extends AsyncTaskLoader<List<Data>> {

    // tag for log messages
    private static final String LOG_TAG = DataLoader.class.getName();

    // url query
    private String mUrl;

    public DataLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Data> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // network request, response, list extract
        List<Data> data = DataUtils.fetchData(mUrl);
        return data;
    }
}
