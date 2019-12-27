package Estructuras;

public class ArbolBB {
    public NodoAbb raiz;
    
    public ArbolBB(){
        raiz = null;
    }
    public boolean estaVacia(){return raiz==null;}
    public void insertar(int idCapa){
        if(estaVacia()){
            raiz = new NodoAbb(idCapa);
        }else{
            raiz.insertar(idCapa);
        } 
    }
    public void preOrden(NodoAbb raiz){
        if(raiz == null)return;
        System.out.println("Capa "+raiz.idCapa);
        preOrden(raiz.izq);
        preOrden(raiz.der);
        
    }
    public void inOrden(NodoAbb raiz){
        if(raiz == null)return;
        inOrden(raiz.izq);
        System.out.println("Capa "+raiz.idCapa);
        inOrden(raiz.der);
        
    }
    public NodoAbb buscar(int idCapa){
        NodoAbb aux = raiz;
        while(aux.idCapa != idCapa){
            if(idCapa < aux.idCapa){
                aux = aux.izq;
            }else if(idCapa>aux.idCapa){
                aux = aux.der;
            }else{
                return null;
            }
        }
        return aux;
    }
    
}
