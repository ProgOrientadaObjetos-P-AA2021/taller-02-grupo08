package paquete2;

import java.io.Serializable;

/**
 *
 * @author Joseph
 */

public class PasajeMenorEdad extends PasajeInterCantonal
        implements Serializable{
    private double porcentajeDescuento;

    public PasajeMenorEdad(String nombrePasajero, String identificacion, String origen, String destino, double distancia, double tarifaBase) {
        super(nombrePasajero, identificacion, origen, destino, distancia, tarifaBase);
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void calcularValorPasaje() {
        this.valorPasaje = (distancia * 0.10) + (tarifaBase -(tarifaBase * porcentajeDescuento/100));
    }

    @Override
    public String toString() {
        return  String.format(" %s \n Porcentaje descuento: %.2f ", super.toString(), porcentajeDescuento);
    }
}

