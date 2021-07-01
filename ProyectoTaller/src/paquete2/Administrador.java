package paquete2;
import java.util.ArrayList;
import paquete3.*;
/**
 *
 * @author josep
 */
public class Administrador {
    
    public void subirRegistro(ArrayList<PasajeInterCantonal> list, String fileName){
        EscrituraArchivoSecuencial escritura = new EscrituraArchivoSecuencial(fileName);
        escritura.establecerNombreArchivo(fileName);
        escritura.establecerSalida();
        escritura.cerrarArchivo();

        for (PasajeInterCantonal i : list){
            escritura.establecerRegistro(i);
        }

        escritura.establecerLista();
    }

    public void leerRegistro(ArrayList<PasajeInterCantonal> list, String fileName){
        EscrituraArchivoSecuencial escritura = new EscrituraArchivoSecuencial(fileName);
        escritura.establecerNombreArchivo(fileName);
        escritura.establecerSalida();
        escritura.cerrarArchivo();

        for (PasajeInterCantonal i : list){
            escritura.establecerRegistro(i);
        }

        escritura.establecerLista();
    }


}
