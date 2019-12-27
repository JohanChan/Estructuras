package Listas;

public class NodoCircular {
    Object dato;
    public NodoCircular siguiente;
    public NodoCircular anterior;
    

    public NodoCircular(Object dato, NodoCircular siguiente, NodoCircular anterior){
        setDato(dato); 
        setSiguiente(siguiente); 
        setAnterior(anterior);
               
    }
    public NodoCircular(Object dato){
           this(dato,null,null);
    }

    public NodoCircular() {
        
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCircular getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCircular anterior) {
        this.anterior = anterior;
    }
}
