package pilascolasylistas;

public class ListaDoble {
    NodoDoble inicio,fin;
    int contador=1;
    public ListaDoble(){
        inicio=fin=null;
        
    }
    //metodo para saber si la lista esta vacia o no
    public boolean estaVacia(){
        return inicio==null;
    }
    //metodo para agregar Nodos al final
    public void agregarAlFinal(Object dato){
        if(!estaVacia()){
            NodoDoble nuevo = new NodoDoble(dato);
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }else{
            inicio=fin=new NodoDoble(dato);
        }
    }
    //metodo para agregar al Inicio
    public void agregarAlInicio(Object dato){
        if(!estaVacia()){
             NodoDoble nuevo = new NodoDoble(dato);
             nuevo.setSiguiente(inicio);
             inicio.setAnterior(nuevo);
             inicio = nuevo;
            
        }else{
            inicio=fin= new NodoDoble(dato);
        }
    }
    //metodo para mostrar la Lista Doble inicio a fin
    public Object extraeInicio(){
        Object dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if(!estaVacia()){
            inicio.setAnterior(null);
            
        }else{
            fin = null;
        }
        return dato;
    }
    public Object extraerFin(){
        Object dato = fin.getDato();
        fin = fin.getSiguiente();
        if(!estaVacia()){
            fin.setSiguiente(null);
        }else{
            inicio=null;
        }
        return dato;
    }
    public void imprimirListaCompleta(){
        NodoDoble auxiliar = inicio;
        while(auxiliar != null){
            System.out.print(auxiliar.getDato()+"<----->");
            auxiliar = auxiliar.getSiguiente();
        }
    }
    public String generarDot(){
        String cadena="";
        if(!estaVacia()){
            NodoDoble aux = inicio;
            int i=0;
            System.out.println(".[ "+aux.getDato() +" ] " + "->");
            cadena += "nodo" +inicio.hashCode()+"[label=\""+"Avion "+inicio.getDato()+"\"];\t";
            String anterior = "nodo"+inicio.hashCode();
            aux=aux.getSiguiente();
            contador++;
            while(aux!=null){
                cadena+="nodo"+aux.hashCode()+"[label=\""+"Avion "+aux.getDato()+"\"];\t";
                cadena+=anterior+"->"+"nodo"+aux.hashCode()+";\t";
                anterior ="nodo"+aux.hashCode();
                aux=aux.getSiguiente();
                contador++;
            }
        }
        return cadena;
    }

    public NodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    public NodoDoble getFin() {
        return fin;
    }

    public void setFin(NodoDoble fin) {
        this.fin = fin;
    }
    
}
