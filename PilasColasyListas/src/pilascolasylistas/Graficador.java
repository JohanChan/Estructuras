package pilascolasylistas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graficador {
    public void crearDotAviones(String nombre, ListaDoble listaAviones){
        FileWriter writer = null;
        PrintWriter pw = null;
        
        try {
            writer = new FileWriter(nombre+".dot");
            pw = new PrintWriter(writer);
            pw.println("digraph listaAviones{");
            pw.println("rankdir=DU");
            pw.println("node [margin=0 fontcolor=blue fontsize=15 width=1 shape=oval style=filled");
            pw.println(listaAviones.generarDot());
            pw.println("\n }");
            pw.close();
        } catch (IOException ex) {
        }finally{
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        }
    }
    
    public void generarImagenAviones(String direccionDot,String direccionPng){
        try{
            String dotPath = "C:\\Program Files (x86)\\Graphviz 2.28\\bin\\dot.exe";
            String cmd = dotPath +" -Tjpg " + direccionDot+" -o " +direccionPng;
            Runtime.getRuntime().exec(cmd);
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public String Reemplazar(int nombre){
        String cad=Integer.toString(nombre);
        return cad.replaceAll("-","_");
    }
    
    public void generarDotEscritorios(String nombre, ListaSimple listaMantenimiento){
        FileWriter writer = null;
        PrintWriter pw = null;
        
        try {
            writer = new FileWriter(nombre+".dot");
            pw = new PrintWriter(writer);
            pw.println("digraph listaAviones{");
            pw.println("rankdir=LR");
            pw.println("node [margin=0 fontcolor=blue fontsize=15 width=1 shape=box style=filled");
            pw.println(listaMantenimiento.generarDot());
            pw.println("\n }");
            pw.close();
        } catch (IOException ex) {
            //Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public void generarImagenEscritorios(String direccionDot, String direccionPng){
        try {
            String dotPath = "C:\\Program Files (x86)\\Graphviz 2.28\\bin\\dot.exe";
            String cmd = dotPath + " -Tjpg "+direccionDot+" -o "+direccionPng;
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public void crearDotPasajeros(String nombre, ColaSimple listapasajeros){
        FileWriter writer = null;
        PrintWriter pw = null;
        
        try {
            writer = new FileWriter(nombre+".dot");
            pw = new PrintWriter(writer);
            pw.println("digraph listapasajeros{");
            pw.println("rankdir=UD");
            pw.println("node [margin=0 fontcolor=blue fontsize=15 width=1 shape=oval style=filled");
            pw.println(listapasajeros.generarDotPasajeros());
            pw.println("\n }");
            pw.close();
        } catch (IOException ex) {
        }finally{
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        }
    }
     public void generarImagenPasajeros(String direccionDot, String direccionPng){
        try {
            String dotPath = "C:\\Program Files (x86)\\Graphviz 2.28\\bin\\dot.exe";
            String cmd = dotPath + " -Tjpg "+direccionDot+" -o "+direccionPng;
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

