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
public class PasajeTerceraEdad extends PasajeInterCantonal {
    protected double numKm;

    public PasajeTerceraEdad(double b, double num) {
        super(b);
        establecerNumeroKm(num);
    }
    
    public void establecerNumeroKm(double n){
        numKm = n;
    }
    
    public double obtenerNumeroKm(){
        return numKm;
    }
    
    public void establecerValorPasaje(){
        valPasaje=(numKm*0.5)+(tafBase/2);
    }
}
