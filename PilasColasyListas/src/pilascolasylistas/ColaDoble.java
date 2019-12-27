package pilascolasylistas;

public class ColaDoble {
    ListaDoble listadoble;
    public ColaDoble(){
        listadoble = new ListaDoble();
        
    }
    public void encolar(Object dato){
        listadoble.agregarAlFinal(dato);
    }
    public Object descolar(){
        return listadoble.extraeInicio();
        
    }
}
