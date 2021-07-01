/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public abstract class PasajeInterCantonal implements Serializable{
    protected double tafBase;
    protected double valPasaje;
    
    public PasajeInterCantonal(double b){
        tafBase=b;
    }
    
    public void establecertafBase(double n){
        tafBase=n;
    }
    
    public abstract void establecerValorPasaje();
    
    public double obtenertafBase(){
        return tafBase;
    }
    
    public double obtenerValorPasaje(){
        return valPasaje; 
    }
    
    @Override
    public String toString(){
        return String.format("Pasaje.");
    }
    
    
}
