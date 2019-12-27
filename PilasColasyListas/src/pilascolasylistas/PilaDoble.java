/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascolasylistas;

/**
 *
 * @author Johan
 */
public class PilaDoble extends ListaDoble{
    
    public PilaDoble(){
        
    }
    public void push(Object dato){
        this.agregarAlInicio(dato);
    }
    public void pop(){
        this.extraerFin();
    }
}
