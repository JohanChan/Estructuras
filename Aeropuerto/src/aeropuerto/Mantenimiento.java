package aeropuerto;
import Listas.*;
import static aeropuerto.Consola.colaMantenimiento;

public class Mantenimiento {
    public static ListaSimple listaEstaciones = new ListaSimple();
    String infoEstaciones="";
    int estaciones;
    public Mantenimiento(){}
    public void numeroEstaciones(int nestaciones){
        while(nestaciones>0){
            listaEstaciones.agregarAlInicio(nestaciones);
            nestaciones--;
        }
    }
    public void mostrarEstaciones(javax.swing.JTextArea consola){
        infoEstaciones="";
        Nodo estacion = new Nodo();
        estacion = listaEstaciones.inicio;
        while(estacion != null){
       //     infoEstaciones += "Estacion: "+estacion.dato+"\n";
            if(estado()){
                infoEstaciones += "      Estado: Libre"+"\n";
            }else{
                infoEstaciones += "      Estado: Ocupado"+"\n";
            }
            
            estacion = estacion.siguiente;
            
        }
        
        consola.append(infoEstaciones+"\n"); 
        
    }
    
    public boolean estado(){
        colaMantenimiento.listasimple.inicio=colaMantenimiento.listasimple.fin=null;
        return true;
    }
}
