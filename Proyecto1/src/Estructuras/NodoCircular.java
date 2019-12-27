package Estructuras;

public class NodoCircular {
    private int idImagen;
    NodoCircular sig;
    NodoCircular ant;
    
    public NodoCircular(int idImagen){
        this.idImagen=idImagen;
        this.sig=null;
        this.ant=null;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }
    
}
