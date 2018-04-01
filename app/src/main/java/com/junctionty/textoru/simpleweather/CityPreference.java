package com.junctionty.textoru.simpleweather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by mathias on 30/03/2018.
 */

public class CityPreference {
    SharedPreferences preferences;

    public CityPreference(Activity activity){
        preferences = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity(){
        return preferences.getString("city", "Aarhus, DK");
    }

    void setCity(String city){
        preferences.edit().putString("city", city).commit();
    }
}
