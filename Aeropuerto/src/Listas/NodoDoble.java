package Listas;
public class NodoDoble {
    
    private String tipo;
    private int pasajero,turnodesabordaje,turnomantenimiento;
    NodoDoble siguiente;
    NodoDoble anterior;
    public String escritorio;
    
    //constructor cuando hayan Nodos
    public NodoDoble(String tipo,int pasajero,int turnodesabordaje,int turnomantenimiento,NodoDoble siguiente, NodoDoble anterior){
        this.tipo=tipo;
        this.pasajero=pasajero;
        this.turnodesabordaje=turnodesabordaje;
        this.turnomantenimiento=turnomantenimiento;
        this.siguiente=siguiente;
        this.anterior=anterior;
        
    }
    public NodoDoble(String escritorio,NodoDoble siguiente, NodoDoble anterior){
        this.escritorio=escritorio;
        this.siguiente=siguiente;
        this.anterior=anterior;
    }
    public NodoDoble(String escritorio){
        this(escritorio,null,null);
    }
    //constructor cuando no hayan Dobles
    public NodoDoble(String tipo,int pasajero,int turnodesabordaje,int turnomantenimiento){
        this(tipo,pasajero,turnodesabordaje,turnomantenimiento,null,null);
        
    }
    public NodoDoble(){
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }

    public int getTurnodesabordaje() {
        return turnodesabordaje;
    }

    public void setTurnodesabordaje(int turnodesabordaje) {
        this.turnodesabordaje = turnodesabordaje;
    }

    public int getTurnomantenimiento() {
        return turnomantenimiento;
    }

    public void setTurnomantenimiento(int turnomantenimiento) {
        this.turnomantenimiento = turnomantenimiento;
    }
    
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }


    
}
