package aeropuerto;

import Listas.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import static aeropuerto.Consola.listaMaletas;

public class Graficador {
    int pasajero=1;
    int aviones,pasajeros,maletas;
    public void crearDot(String nombre, NodoDoble primero) {
        FileWriter wr = null;
        PrintWriter pw = null;

        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);
            pw.println("digraph listadoble{");
            pw.println("node [shape=box color = blue];");
            pw.println("rankdir=LR");
            pw.println(generarDot(primero));
            pw.print("}");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String reemplazar(int posmemoria) {
        String cadena = Integer.toHexString(posmemoria);
        return cadena.replace("-", "_");
    }

    public String generarDot(NodoDoble primero) {
        String cadena = "";
        if (primero == null) {
            System.out.println("vacio");
            return cadena;
        } else {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + "Turno: " + primero.getTurnodesabordaje() + "\"];\n";
            if (primero.getSiguiente() != null) {
                cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().hashCode()) + ";\n";
                cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                cadena += generarDot(primero.getSiguiente());
            }
            return cadena;
        }
    }

    public void gernerarImagen(String archivo, String imagen) {
        String doPath = "C:\\Program Files (x86)\\Graphviz 2.28\\bin\\dot.exe";
        String cmd = doPath + " -Tjpg " + archivo + " -o " + imagen;
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearDotPasajeros(String nombre, Nodo primero) {
        FileWriter wr = null;
        PrintWriter pw = null;

        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);
            pw.println("digraph cola{");
            pw.println("node [shape=box color = red];");
            pw.println("rankdir=LR");
            pw.println(generarDotPasajero(primero));
            pw.print("}");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String generarDotPasajero(Nodo primero) {
        String cadena = "";
        
        if (primero == null) {
            System.out.println("vacio");
            return cadena;
        } else {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + "Pasajero "+primero.pasajero+":"+"Maletas: " + primero.maleta + "\"];\n";
            
            if (primero.siguiente != null) {
                
                cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.siguiente.hashCode()) + ";\n";
                //cadena += "nodo" + reemplazar(primero.siguiente.hashCode()) + "->" + "nodo" + reemplazar(primero.siguiente.hashCode()) + ";\n";
                cadena += generarDotPasajero(primero.siguiente);
            }
            return cadena;
        }
    }
    
    public void crearDotMaletas(String nombre,NodoCircular primero){
            FileWriter wr = null;
        PrintWriter pw = null;
        //NodoCircular primero = listaMaletas.primero;
        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);
            pw.println("digraph listaMaletas{");
            pw.println("node [shape=box];");
            pw.println("rankdir=LR");
            pw.println(generarDotMaletas(primero));
            pw.print("}");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String generarDotMaletas(NodoCircular primero){
        String cadena = "";
        int nmaleta=1;
        int suma=0;
        if (primero == null) {
            System.out.println("vacio");
            return cadena;
        } else {
            do{
                cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + "Maleta: " + primero.getDato() + "\"];\n";
                cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().hashCode()) + ";\n";
                cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                primero = primero.siguiente;
                
            }while(primero != listaMaletas.primero);


            return cadena;
        }
    }
    
    public void crearDotEscritorios(String nombre, NodoDoble primero){
        FileWriter wr = null;
        PrintWriter pw = null;
        //NodoCircular primero = listaMaletas.primero;
        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);
            pw.println("digraph listaEscritorios{");
            pw.println("node [shape=box];");
            pw.println("rankdir=LR");
            pw.println(generarDorEscritorios(primero));
            pw.print("}");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String generarDorEscritorios(NodoDoble primero){
        String cadena = "";
        if (primero == null) {
            System.out.println("vacio");
            return cadena;
        } else {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + "Escritorio: " + primero.escritorio + "\"];\n";

            if (primero.getSiguiente() != null) {
                cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().hashCode()) + ";\n";
                cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                cadena += generarDorEscritorios(primero.getSiguiente());
            }
            return cadena;
        }
    }

    public int getAviones() {
        return aviones;
    }

    public void setAviones(int aviones) {
        this.aviones = aviones;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }
    
    
    
}
