/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felixpletziger.aufgabe4;

/**
 *
 * @author Felix
 * Klasse dient zur Erzeugung eines Wetterobjektes mit einem Attribut und einer
 * getterMethode
 */
class Weather {
    private String weather;
    
    public Weather(String erg) {
        this.weather = erg;
    }

    public String getWeather() {
        return weather;
    }
    
}
