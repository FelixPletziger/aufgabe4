/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felixpletziger.aufgabe4;

/**
 *
 * @author Felix
 * Klasse um fehlerhafte Übergebene Städte herauszufiltern
 */
class UnsupportedCountryException extends Exception {
    
    public UnsupportedCountryException() {
    }
    
    public UnsupportedCountryException(String message){
        super(message);
    }
    
    public UnsupportedCountryException(Throwable cause){
        super(cause);
    }

    public UnsupportedCountryException(String message, Throwable cause){
        super(message, cause);
    }

    public UnsupportedCountryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
	 
}
