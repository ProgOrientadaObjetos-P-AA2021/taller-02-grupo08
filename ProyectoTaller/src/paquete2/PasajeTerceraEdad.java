package paquete2;

import java.io.Serializable;

/**
 *
 * @author Joseph
 */

public class PasajeTerceraEdad extends PasajeInterCantonal {
    public PasajeTerceraEdad(String n, String c, String o, String d,
            double nkm, double tb, String nu) {
        super(n, c, o, d, nkm, tb);
    }

    @Override
    public void calcularValorPasaje() {

    }

    @Override
    public String toString() {
        String cadena = String.format("Pasaje Universitario\n"
                + "Nombre-Pasajero: %s\n"
                + "Cedula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Km de distancia: %.2f\n"
                + "Tarifa Base: %.2f\n"
                + "Valor Pasaje: %.2f\n");

        return cadena;
    }


    
}
