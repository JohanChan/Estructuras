package Listas;

public class ListaCircularDoble {
    public NodoCircular primero;
    public NodoCircular ultimo;
    public ListaCircularDoble(){
        primero=ultimo=null;
    }
    public boolean estaVacia(){
        return primero == null;
    }
    public void agregarAlFinal(Object dato){
        if(!estaVacia()){
            NodoCircular nuevo = new NodoCircular(dato);
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
            primero.setAnterior(ultimo); 
        }else{
            primero=ultimo= new NodoCircular(dato);
        }
    }
    public void agregarAlInicio(Object dato){
        if(!estaVacia()){
            NodoCircular nuevo = new NodoCircular(dato);
            primero.setAnterior(nuevo);
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            primero = nuevo;
            ultimo.setSiguiente(primero);
            
        }else{ 
            primero=ultimo=new NodoCircular(dato);
        }
        
    }
    public void removerDelFrente(Object dato){
        NodoCircular actual = new NodoCircular();
        NodoCircular anterior = new NodoCircular();
        
        actual = primero;
        anterior = ultimo;
        do{
            if(actual.dato == dato){
                if(actual == primero){
                       primero = primero.siguiente;
                       ultimo.siguiente=primero;
                       primero.anterior=ultimo;
                }else if(actual == ultimo){
                    ultimo = anterior;
                    primero.anterior=ultimo;
                    ultimo.siguiente=primero;
                }else{
                    anterior.siguiente=actual.siguiente;
                    actual.siguiente.anterior=anterior;
                    
                }
            }
            anterior=actual;
            actual = actual.siguiente;
        }while(actual != primero);
    }
    public void imprimirListaCircular(){
        NodoCircular auxiliar=ultimo.siguiente;
        do{
            System.out.print(auxiliar.getDato()+"<----->");
            auxiliar = auxiliar.getSiguiente();
            
        }while(auxiliar != ultimo.siguiente);
    }
    
    public String generarDot(){
        String cadena="";
        if(!estaVacia()){
            NodoCircular aux = primero;
            int i=0;
            System.out.println(".[ "+aux.getDato() +" ] " + "->");
            cadena += "nodo" +primero.hashCode()+"[label=\""+primero.getDato()+"\"];\t";
            String anterior = "nodo"+primero.hashCode();
            aux=aux.getSiguiente();
            
            while(aux!=null){
                cadena+="nodo"+aux.hashCode()+"[label=\""+aux.getDato()+"\"];\t";
                cadena+=anterior+"->"+"nodo"+aux.hashCode()+";\t";
                anterior ="nodo"+aux.hashCode();
                aux=aux.getSiguiente();
                
            }
        }
        return cadena;
    }
    
    public int getSuma(){
        NodoCircular auxiliar = new NodoCircular();
        auxiliar = primero;
        int suma=0;
        do{
            int dato = (int)auxiliar.dato;
            suma += dato;
            auxiliar = auxiliar.siguiente;
        }while(auxiliar != primero);
        return suma;
    }
    
}   
