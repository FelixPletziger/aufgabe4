/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felixpletziger.aufgabe4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Felix
 */
public class Main {
    private static final Logger LOG = LogManager.getLogger("WeatherLogger"); 
    public static void main(String[] args) {
        /**
         * Erzeugen eines Objektes zur Abfrage von Wetterdaten
         */
        WeatherRetriever retriever = new WeatherRetriever();
        LOG.info(retriever);        
        try {
            /**
             * Versuch Wetterdaten über vorher erstelltes Objekt für eine Stadt 
             * abzurufen und in einem Weather Objekt abzulegen
             * Abgerufenene Daten werden als Info im WeatherLogger ausgegeben
             */
            Weather weather = retriever.retrieve(new City("Bochum", "Germany"));
            LOG.info(weather.getWeather());
        }
        catch (UnsupportedCountryException e) {
            LOG.error("This country is not supported", e);
        }

        try {
            /**
             * Versuch Wetterdaten über vorher erstelltes Objekt für eine Stadt 
             * abzurufen und in einem Weather Objekt abzulegen
             * Abgerufenene Daten werden als Info im WeatherLogger ausgegeben
             */
            Weather weather = retriever.retrieve(new City("Sydney", "Australia"));
            LOG.info(weather.getWeather());
        }
        catch (UnsupportedCountryException e) {
            LOG.error("This country is not supported", e);
        }
    }
    
}
