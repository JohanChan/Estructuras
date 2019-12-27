package Estructuras;

public class NodoAbb {
    NodoAbb izq;
    NodoAbb der;
    int idCapa;
    public NodoAbb(int idCapa){
        this(idCapa,null,null);
    }
    public NodoAbb(int idCapa,NodoAbb izq,NodoAbb der){
        this.idCapa=idCapa;
        this.der=der;
        this.izq=izq;
    }
    public void insertar(int idCapa){
        if(idCapa<this.idCapa){
            if(izq==null){
                izq = new NodoAbb(idCapa);
            }else{
                izq.insertar(idCapa);
            }
        }else if(idCapa>this.idCapa){
            if(der ==null){
                der = new NodoAbb(idCapa);
            }else{
                der.insertar(idCapa);
            }
        }else{
            System.out.println("Datos duplicado");
        }
    }
}
