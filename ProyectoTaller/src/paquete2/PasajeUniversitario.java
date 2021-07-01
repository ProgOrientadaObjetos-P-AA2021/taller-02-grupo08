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
public class PasajeUniversitario extends PasajeInterCantonal {
    protected String nombreUni;

    public PasajeUniversitario(double b, String nom) {
        super(b);
        establecerNombreUni(nom);
    }
    
    public void establecerNombreUni(String n){
        nombreUni=n;
    }
    
    public String obtenerNombreUni(){
        return nombreUni;
    }
    
    public void establecerValorPasaje(){
        valPasaje=tafBase/2;
    }
}
