package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {
    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     *  Constructor for a new {@link Earthquake} object
     *
     * @param mMagnitude
     * @param mLocation
     * @param mTimeInMilliseconds
     * @param mUrl
     */
    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl = mUrl;
    }

    /**
     *  Returns the magnitude of the earthquake
     * @return
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     *  Returns the location of the earthquake
     * @return
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     *  Returns the time in milliseconds of the earthquake
     * @return
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     *  Returns the url of the earthquake
     * @return
     */
    public String getUrl() {
        return mUrl;
    }
}
