package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    // tag for log
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    // Query Url
    private String mUrl;

    public EarthquakeLoader(Context context, String mUrl) {
        super(context);
        this.mUrl = mUrl;
    }

    @Override
    protected void onStartLoading() {
        Log.v(LOG_TAG, "EarthquakeLoader onStartLoading()");
        forceLoad();
    }

    public List<Earthquake> loadInBackground() {
        Log.v(LOG_TAG, "EarthquakeLoader loadInBackground()");
        if (mUrl == null) {
            return null;
        }

        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
