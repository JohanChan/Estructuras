package Estructuras;

public class Nodo {
    Nodo sig;
    private int idCapa;
    public Nodo(int idCapa){
        this.idCapa = idCapa;
        sig = null;
    }

    public int getidCapa() {
        return idCapa;
    }

    public void setidCapa(int idCapa) {
        this.idCapa = idCapa;
    }
    
}
