package paquete2;

import java.io.Serializable;

/**
 *
 * @author Joseph
 */

public abstract class PasajeInterCantonal implements Serializable{
    protected String nombrePasajero;
    protected String identificacion;
    protected String origen;
    protected String destino;
    protected double distancia;
    protected double tarifaBase;
    protected double valorPasaje;

    public PasajeInterCantonal(String nombrePasajero, String identificacion, String origen, String destino,
                               double distancia, double tarifaBase) {
        this.nombrePasajero = nombrePasajero;
        this.identificacion = identificacion;
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tarifaBase = tarifaBase;
    }

    public abstract void calcularValorPasaje();

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    @Override
    public String toString(){
        return String.format("<Pasaje intercantonal>" +
                "\n Identificación: %s"+
                "\n Nombre pasajero: %s"+
                "\n Origen: %s"+
                "\n Destino: %s"+
                "\n Distancia: %s"+
                "\n Tarifa base: %.2f"+
                "\n Valor pasaje: %.2f", identificacion, nombrePasajero, origen,
                destino, distancia, tarifaBase, valorPasaje);
    }

}
