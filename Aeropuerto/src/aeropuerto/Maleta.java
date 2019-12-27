package aeropuerto;
import java.util.Random;
import Listas.*;

public class Maleta {
    String infoMaleta="";
    int nmaleta=0,suma;
    public Maleta(){}
    public int numeroMaletas(){
        Random rmaletas = new Random();
        int maleta = rmaletas.nextInt(4)+1;
        return maleta;
    }

}
