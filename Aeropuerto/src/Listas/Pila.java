/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Johan
 */
public class Pila extends ListaSimple {
    public Pila(){
        
    }
    
    public void push(Object dato){
       // super.agregarAlInicio(dato);
    }
    
    public boolean estaVacia(){
        return super.estaVacia();
    }
//    
//    public Object pop(){
//        return super.removerDelInicio();
//    }
    
    public void imprimir(){
        super.mostrarLista();
    }
    
}
