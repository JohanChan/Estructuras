/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

public class Nodo {
    public int docs, maleta,pasajero, turnoEscritorio,nmantenimiento;
    public Nodo siguiente;
    //constructor insertar al final
    public Nodo(int pasajero,int docs,int maleta,int turnoEscritorio){
        this.pasajero=pasajero;
        this.docs=docs;
        this.maleta=maleta;
        this.turnoEscritorio=turnoEscritorio;
        this.siguiente=null;
    }
    //constructor insertar al inicio
    public Nodo(int pasajero, int docs,int maleta,int turnoEscritorio, Nodo siguiente){
        this.pasajero=pasajero;
        this.docs=docs;
        this.maleta=maleta;
        this.turnoEscritorio=turnoEscritorio;
        this.siguiente=siguiente;
    }
    public Nodo(int nmantenimiento,Nodo siguiente){
        this.nmantenimiento=nmantenimiento;
        this.siguiente=siguiente;
    }
    
    public Nodo(){}
}
