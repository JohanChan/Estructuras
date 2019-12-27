package aeropuerto;
import Listas.*;
import java.util.Random;

public class Escritorio {
    String infoEscritorio="";
    public static ListaDoble listaEscritorios = new ListaDoble(); 
    String abecedario[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    public Escritorio(){}
    public void nombreEscritorios(int nEscritorios){
        Random desk = new Random();
        for (int i = 0; i < nEscritorios; i++) {
            int escritorio = desk.nextInt(26);
            listaEscritorios.agregarAlFinalEscritorios(abecedario[escritorio]);
        }
    }

}
