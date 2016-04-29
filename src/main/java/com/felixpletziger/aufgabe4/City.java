/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felixpletziger.aufgabe4;

/**
 *
 * @author Felix
 */
class City {
    /**
     * Attribute:
     * city beinhaltet den Namen der Stadt
     * country beinhaltet das Land in der die Stadt liegt
     */
    private String city;
    private String country;
    
    /**
     * Konstruktor für das Objekt vom Typ City
     * @param city
     * @param country 
     */
    public City(String city, String country) {
        this.city=city;
        this.country=country;
    }

    /**
     * @return the city as String
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the country as String
     */
    public String getCountry() {
        return country;
    }
  
}
