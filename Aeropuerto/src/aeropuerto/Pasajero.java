package aeropuerto;

import java.util.Random;
import Listas.*;

public class Pasajero {
    Maleta maleta = new Maleta();
    int pasajeros = 0, npasajero = 0;
    String infopasajero = "";
    String infog = "";
    int indice=1;
    public static ColaSimple colaPasajero = new ColaSimple();

    public Pasajero() {
    }

    public int numeroPasajeros(int tipoAvion) {
        Random rpasajero = new Random();
        switch (tipoAvion) {
            case 1:
                pasajeros = rpasajero.nextInt(11) + 5;
                return pasajeros;
            case 2:
                pasajeros = rpasajero.nextInt(11) + 15;
                return pasajeros;
            case 3:
                pasajeros = rpasajero.nextInt(11) + 30;
                return pasajeros;

        }
        return 0;

    }

    public void colaPasajeros(int tpasajeros) {
        
        while(indice != tpasajeros){
            
            colaPasajero.encolar(indice, documentos(), maletas(), turnoEscritorio());
            indice++;
        }
        
    }
    
    public int documentos() {
        Random rdocs = new Random();
        int documento = rdocs.nextInt(10) + 1;
        return documento;

    }

    public int maletas() {
        int nmaleta = maleta.numeroMaletas();
        return nmaleta;
        
    }
    
    public int turnoEscritorio(){
        Random rturno = new Random();
        int turno = rturno.nextInt(3)+1;
        return turno;
    }
}
