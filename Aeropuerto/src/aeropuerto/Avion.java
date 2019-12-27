package aeropuerto;

import Listas.ListaDoble;
import Listas.*;
import java.util.Random;

public class Avion {
    Pasajero pasajero = new Pasajero();
    int avion;
    String infoAvion = "";
    public static ListaDoble listaAviones = new ListaDoble();
    int navion = 0;
    javax.swing.JTextArea consola;
    public Avion() {
    }
    public void setAvion(int avion){
        this.avion=avion;
    }
    public int getAvion(){
        return avion;
    }
    public void numeroAvion() {
        while (getAvion() > 0) {
            Random ravion = new Random();
            int tipoavion = ravion.nextInt(3) + 1;
            listaAviones.agregarAlFinal(tipoAvion(tipoavion), pasajeros(tipoavion), tipoavion, mantenimiento(tipoavion));
            avion--;
            
        }
        
    }
    public String tipoAvion(int tipoAvion) {
        switch (tipoAvion) {
            case 1:
                return "Pequeño";
                
            case 2:
                return "Mediano";
                
            case 3:
                return "Grande";
                
        }
       return null;
    }
    public int pasajeros(int tipoAvion){
        return pasajero.numeroPasajeros(tipoAvion);
        
    }
    public int mantenimiento(int tipoAvion){
        Random rmantenimiento = new Random();
        int mantenimiento=0;
        switch(tipoAvion){
            case 1:
                mantenimiento = rmantenimiento.nextInt(3)+1;
                return mantenimiento;
            case 2:
                mantenimiento = rmantenimiento.nextInt(2)+2;
                return mantenimiento;
            case 3:
                mantenimiento = rmantenimiento.nextInt(3)+3;
                return mantenimiento;
        }
        return 0; 
        
    }
    public int getNavion() {
        return navion;
    }
    public void setNavion(int avion) {
        this.navion = avion;
    }

}
