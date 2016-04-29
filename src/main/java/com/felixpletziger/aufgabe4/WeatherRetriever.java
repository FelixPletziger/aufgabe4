/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felixpletziger.aufgabe4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bitpipeline.lib.owm.OwmClient;
import org.bitpipeline.lib.owm.WeatherStatusResponse;
import org.bitpipeline.lib.owm.WeatherData;
import org.bitpipeline.lib.owm.WeatherData.WeatherCondition;
import org.json.JSONException;

/**
 *
 * @author Felix
 */
class WeatherRetriever {
    /**
     * Methode retrieve ruft Wetterdaten von OnlineService ab und gibt sie als 
     * Weatherobjekt zurück
     * @param city
     * @return
     * @throws UnsupportedCountryException 
     */
    public Weather retrieve(City city) throws UnsupportedCountryException {
        String erg = new String();
        OwmClient owm = new OwmClient ();
        WeatherStatusResponse currentWeather = null;
	//Prüfung ob Stadt einem bestimmten Fall entspricht und entsprechende 
        //Fehlerschmeißung
        try {
            if(city.getCountry().equals("Australia")){
                throw new UnsupportedCountryException();
            }
            currentWeather = owm.currentWeatherAtCity (city.getCity() , city.getCountry());
        } catch (JSONException e) {
            e.printStackTrace();
	} catch (IOException ex) {
            ex.printStackTrace();
        }
        if (currentWeather.hasWeatherStatus ()) {
            //Auslesen der Wetterdaten aus der Response des Services und Erzeu-
            //gung eines entsprechenden Strings
            WeatherData weather = currentWeather.getWeatherStatus ().get (0);
            
            if (weather.getPrecipitation () == Integer.MIN_VALUE) {
                WeatherCondition weatherCondition = weather.getWeatherConditions ().get (0);
                String description = weatherCondition.getDescription ();
                if (description.contains ("rain") || description.contains ("shower"))
                	erg = "No rain measures in "+ city.getCity() +" but reports of " + description;
                else
                	erg = "No rain measures in "+ city.getCity() +": " + description;
            } else
            	erg = "It's raining in "+ city.getCity() +": " + weather.getPrecipitation () + " mm/h";
        }
        return new Weather(erg);
    }
}
