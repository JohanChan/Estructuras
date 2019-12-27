package Estructuras;

public class ListaSimple {

    Nodo inicio;
    Nodo fin;

    public ListaSimple() {
        inicio = fin = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertar(int idCapa) {
        Nodo nuevo = new Nodo(idCapa);
        if (estaVacia()) {
            inicio = fin = nuevo;
        } else {
            fin.sig = nuevo;
            fin = nuevo;
        }
    }

    public void print() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("Id capa: " + aux.getidCapa());
            aux = aux.sig;
        }
    }
}
