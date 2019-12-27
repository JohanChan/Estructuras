package pilascolasylistas;

public class ColaSimple {
    ListaSimple listasimple;
    public ColaSimple(){
        listasimple = new ListaSimple();
    }
    public void encolar(Object dato){
        listasimple.agregarAlFinal(dato);
        
    }
    public Object descolar() throws EmptyListException{
        return listasimple.removerDelInicio();
    }
    public void imprimirCola(){
        listasimple.mostrarLista();
    }
    
        public String generarDotPasajeros(){
        String cadena="";
        if(!(listasimple.inicio==null)){
            Nodo aux = listasimple.inicio;
            int i=0;
            System.out.println(".[ "+aux.dato +" ] " + "->");
            cadena += "nodo" +listasimple.inicio.hashCode()+"[label=\""+"Pasajeros "+listasimple.inicio.dato+"\"];\t";
            String anterior = "nodo"+listasimple.inicio.hashCode();
            aux=aux.siguiente;
            while(aux!=null){
                cadena+="nodo"+aux.hashCode()+"[label=\""+"Pasajeros "+aux.dato+"\"];\t";
                cadena+=anterior+"->"+"nodo"+aux.hashCode()+";\t";
                anterior ="nodo"+aux.hashCode();
                aux=aux.siguiente;
                
            }
        }
        return cadena;
    }
    
}
class EmptyListException extends RuntimeException{
    public EmptyListException(){
            
    }
}