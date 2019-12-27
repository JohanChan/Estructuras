package Estructuras;

public class ListaCircular {

    NodoCircular inicio;
    NodoCircular fin;

    public ListaCircular() {
        inicio = null;
        fin = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertar(int idImagen) {
        NodoCircular nuevo = new NodoCircular(idImagen);
        if (estaVacia()) {
            inicio = fin = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            fin.sig = nuevo;
            nuevo.ant=fin;
            fin = nuevo;
        }
    }
    public void print(){
       NodoCircular aux = inicio;
       do{
           System.out.println("Id img: "+aux.getIdImagen());
           aux = aux.sig;
       }while(aux!=inicio);
    }
}
