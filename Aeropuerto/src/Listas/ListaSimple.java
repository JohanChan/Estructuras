/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

public class ListaSimple {
    //punteros para saber donde esta el inicio y fin
    public Nodo inicio,fin;
    //inicializacion de inicio y fin
    public ListaSimple(){
        inicio=fin=null;
    }
    //metodo para saber si la lista esta vacia o no
    public boolean estaVacia(){
        return inicio==null;
    }
    
    //metodo agregar al inicio
    public void agregarAlInicio(int pasajero,int docs,int maleta,int turnoEscritorio){
        //creando al Nodo
        inicio= new Nodo(pasajero,docs,maleta,turnoEscritorio,inicio);
        if(fin==null){
            fin=inicio;
            
        }
    }
    
    public void agregarAlInicio(int nmanteniemiento){
        inicio=new Nodo(nmanteniemiento,inicio);
        if(fin==null){
            fin=inicio;
            
        }
    }
    
    public void agregarAlFinal(int pasajero, int docs,int maleta,int turnoEscritorio){
            if(!estaVacia()){
                fin=fin.siguiente=new Nodo(pasajero,docs,maleta,turnoEscritorio);
            }else{
                inicio=fin=new Nodo(pasajero,docs,maleta,turnoEscritorio);
            }
        
    }
    //metodo para mostrar Lista
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer!=null){
            System.out.print("["+"Pasajero "+recorrer.pasajero+","+"Maleta "+recorrer.maleta+"]"+"---");
            recorrer = recorrer.siguiente;
            
        }
        
    }
    public int getSumaMaletas(){
        int suma=0;
        Nodo recorrer = new Nodo();
        recorrer = inicio;
        while(recorrer != null){
            int numero = recorrer.maleta;
            suma += numero;
            recorrer = recorrer.siguiente;
        }
        return suma;
    }
    public boolean buscar(int i){
        Nodo recorrer = inicio;
        while(recorrer != null){
            if(i == recorrer.pasajero){
                return true;
                               
            }else{
                return false;
            }
        }
        return false;
    }
    //metodo para eliminar nodo del inicio
//    public Object removerDelInicio(){
//        Object dato= inicio.dato;
//        if(inicio==fin){
//            inicio=fin=null;
//        }else{
//            inicio=inicio.siguiente;
//        }
//        return dato;
//    }
//    public Object removerDelFinal(){
//        Object dato = fin.dato;
//        if(inicio==fin){
//            inicio=fin=null;
//        }else{
//            Nodo temporal = inicio;
//            while(temporal.siguiente!=fin){
//                temporal=temporal.siguiente;
//            }
//            fin=temporal;
//            fin.siguiente=null;
//        }
//        return dato;
//    }
//    public String generarDot(){
//        String cadena="";
//        if(!estaVacia()){
//            Nodo aux=inicio;
//            cadena+="nodo"+inicio.hashCode()+"[label=\""+inicio.dato+"\"];\n";
//            String anterior ="nodo"+inicio.hashCode();
//            aux = aux.siguiente;
//            while(aux!=null){
//                cadena+="nodo"+aux.hashCode()+"[label=\""+aux.dato+"\"];\t";
//                cadena+=anterior+"->"+"nodo"+aux.hashCode()+";\t";
//                anterior ="nodo"+aux.hashCode();
//                
//                aux=aux.siguiente;
//            }
//        }
//        return cadena;
//    }
}
