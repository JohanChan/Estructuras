/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import static aeropuerto.Avion.listaAviones;
import static aeropuerto.Pasajero.colaPasajero;
import static aeropuerto.Mantenimiento.listaEstaciones;
import Listas.*;
import static aeropuerto.Escritorio.listaEscritorios;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Johan
 */
public class Consola extends javax.swing.JFrame {

    Graficador graph = new Graficador();
    //public static ListaSimple listaMantenimiento = new ListaSimple();
    public static ListaCircularDoble listaMaletas = new ListaCircularDoble();
    int tavion, suma;
    public static ColaSimple colaMantenimiento = new ColaSimple();
    int turnoglobal = 1;
    Escritorio escritorio;
    Mantenimiento mantenimiento;
    Pasajero pasajero;
    NodoDoble nodoAviones, nodoturno;
    Nodo nodoPasajeros, nodoMantenimiento;
    NodoCircular nodomal;
    String infog = "";
    Avion avion;
    Maleta maleta;
    int i = 1;
    int turnoAvion;

    /**
     * Creates new form Consola
     */
    public Consola() {
        nodoturno = new NodoDoble();
        nodoPasajeros = new Nodo();
        nodoAviones = new NodoDoble();
        nodomal = new NodoCircular();
        escritorio = new Escritorio();
        mantenimiento = new Mantenimiento();
        pasajero = new Pasajero();
        avion = new Avion();
        maleta = new Maleta();
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void inicio() {
        avion.setAvion(Integer.parseInt(jTextField1.getText()));
        escritorio.nombreEscritorios(Integer.parseInt(jTextField3.getText()));
        mantenimiento.numeroEstaciones(Integer.parseInt(jTextField2.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelAviones = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        colaPasajeros = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        maletas = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        desk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 255));
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("Aviones");

        jTextField2.setToolTipText("Estaciones");

        jTextField3.setToolTipText("Escritorios");

        jButton3.setText("Cargar Imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2)))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton3)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        labelAviones.setToolTipText("ListaAviones");
        labelAviones.setAutoscrolls(true);
        jScrollPane2.setViewportView(labelAviones);

        colaPasajeros.setToolTipText("Cola de Pasajeros");
        jScrollPane3.setViewportView(colaPasajeros);

        maletas.setToolTipText("Lista Maletas");
        jScrollPane4.setViewportView(maletas);

        desk.setToolTipText("Lista de Escritorios");
        jScrollPane5.setViewportView(desk);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inicio();
        listaAviones();
        colaPasajeros();
        listaMaletas();
        
        graph.setAviones(turnoglobal);
        infog += "*********** TURNO " + turnoglobal + " ***********" + "\n\n";
        infog += "******** AVIONES ********" + "\n";
        nodoAviones = listaAviones.getInicio();
        imprimirAvion(nodoAviones);
        imagenAviones();
        infog += "******** PASAJEROS ********" + "\n";
        imprimirPasajero();
        imagenPasajeros();
        infog += "******** MALETAS ********" + "\n";
        nodomal = listaMaletas.primero;
        imprimirMaletas(nodomal);
        imagenMaletas();
        infog += "******** ESTACIONES ********" + "\n";
        nodoMantenimiento = listaEstaciones.inicio;
        listaMantenimiento();
        infog += "******** ESCRITORIOS ********" + "\n";
        nodoPasajeros = colaPasajero.listasimple.inicio;
        imprimirEscritoriosInicio();
        imagenEscritorios();
        infog += "********** FIN TURNO " + turnoglobal + " **********" + "\n";
        turnoglobal++;
        botonEmpezar();
        jTextArea1.append(infog);


    }//GEN-LAST:event_jButton1ActionPerformed
    public void imprimirAvion(NodoDoble nodoDoble) {
        try {
            int todo = turnoglobal;
            while (todo != 0) {
                tavion += nodoDoble.getPasajero();
                
                turnoAvion = nodoDoble.getTurnodesabordaje();
                if (turnoAvion == 0) {
                    turnoAvion = nodoturno.getSiguiente().getTurnodesabordaje();
                } else {
                    
                    turnoAvion--;
                    infog += "Tipo: " + nodoDoble.getTipo() + "\n" + "      Pasajeros: " + nodoDoble.getPasajero() + "\n"
                            + "      Turno Desabordaje: " + turnoAvion + "\n"
                            + "      Turno Mantenimiento: " + nodoDoble.getTurnomantenimiento() + "\n";

                    
                }
                nodoDoble = nodoDoble.getSiguiente();
                todo--;
            }
        } catch (Exception e) {

        }

    }

    public void imagenAviones() {
        graph.crearDot("ListAviones", listaAviones.getInicio());
        graph.gernerarImagen("ListAviones.dot", "ListaAviones.png");

    }

    public void listaMaletas() {
        int totalmaletas = colaPasajero.listasimple.getSumaMaletas();
        for (int j = 1; j <= totalmaletas; j++) {
            listaMaletas.agregarAlFinal(j);
        }
        System.out.println("MALETAS");
        listaMaletas.imprimirListaCircular();
        System.out.println("");

    }

    public void imprimirMaletas(NodoCircular nodo) {
        infog += "      INICIO: " + 1 + "\n";
        infog += "      FIN: " + listaMaletas.ultimo.getDato() + "\n";
    }

    public void imagenMaletas() {
        graph.crearDotMaletas("listaMaletas", listaMaletas.primero);
        graph.gernerarImagen("listaMaletas.dot", "ListaMaletas.png");

    }

    public void listaAviones() {
        avion.numeroAvion();
        //listaAviones.imprimirListaCompleta();
    }

    public void colaPasajeros() {
        int suma = 0;
        NodoDoble pasaje = new NodoDoble();
        pasaje = listaAviones.getInicio();
        while (pasaje != null) {
            int tpasajero = (int) pasaje.getPasajero();
            suma += tpasajero;
            pasaje = pasaje.getSiguiente();

        }

        pasajero.colaPasajeros(suma);

    }
    
    public void listaMantenimiento(){
        Nodo estaciones=new Nodo();
        estaciones = listaEstaciones.inicio;
        while(estaciones != null){
       //     infoEstaciones += "Estacion: "+estacion.dato+"\n";
            if(estado()){
                infog += "      Estado: Libre"+"\n";
            }else{
                infog += "      Estado: Ocupado"+"\n";
            }
            
            estaciones = estaciones.siguiente;
            
        }
        
        //consola.append(infog+"\n"); 
        
    }
    
    public void listaMantenimiento(Nodo auxiliar){
         Nodo estaciones=new Nodo();
        estaciones = listaEstaciones.inicio;
        while(estaciones != null){
       //     infoEstaciones += "Estacion: "+estacion.dato+"\n";
            if(estado()){
                infog += "      Estado: Libre"+"\n";
            }else{
                infog += "      Estado: Ocupado"+"\n";
            }
            auxiliar= auxiliar.siguiente;
            estaciones = estaciones.siguiente;
            
        }
    }
    
    public boolean estado(){
        colaMantenimiento.listasimple.inicio=colaMantenimiento.listasimple.fin=null;
        return true;
    }

    public void imprimirPasajero() {
        System.out.println("");
        System.out.println("Tavion "+tavion);
        while (i <= tavion) {
            infog += "Pasajero " + i + "\n";
            nodoPasajeros = colaPasajero.listasimple.inicio;
            while (nodoPasajeros != null) {
                if (i == nodoPasajeros.pasajero) {

                    infog += "      Documentos: " + nodoPasajeros.docs + "\n"
                            + "      No. Maletas: " + nodoPasajeros.maleta + "\n";
                    
                }
                
                nodoPasajeros = nodoPasajeros.siguiente;
            }
            i++;
            
        }
        System.out.println("Pasajeros");
        colaPasajero.imprimirCola();

    }

    public void imagenPasajeros() {
        nodoPasajeros = colaPasajero.listasimple.inicio;
        graph.crearDotPasajeros("ColaPasajeros", nodoPasajeros);
        graph.gernerarImagen("ColaPasajeros.dot", "ColaPasajeros.png");

    }

    public void botonEmpezar() {
        jTextField1.setText("");
        jTextField1.setEnabled(false);
        jTextField2.setText("");
        jTextField2.setEnabled(false);
        jTextField3.setText("");
        jTextField3.setEnabled(false);
    }

    public void imprimirEscritorios(Nodo nodopasajero) {
        NodoDoble recorrer = new NodoDoble();
        recorrer = listaEscritorios.getInicio();
        while (recorrer != null) {
            infog += "Escritorio: " + recorrer.escritorio + "\n";
            infog += "      Estado: Ocupado" + "\n";
            infog += "      Pasajero: " + nodopasajero.pasajero + "\n";
            infog += "      Documentos: " + nodopasajero.docs + "\n";
            infog += "      Turno: " + nodopasajero.turnoEscritorio + "\n";
            nodopasajero = nodopasajero.siguiente;
            recorrer = recorrer.getSiguiente();
        }
    }

    public void imprimirEscritoriosInicio() {
        NodoDoble recorrer = new NodoDoble();
        recorrer = listaEscritorios.getInicio();
        while (recorrer != null) {
            infog += "Escritorio: " + recorrer.escritorio + "\n";
            infog += "      Estado: Libre" + "\n";
            infog += "      Pasajero: " + "\n";
            infog += "      Documentos: " + "\n";
            recorrer = recorrer.getSiguiente();
        }

    }

    public void imagenEscritorios() {
        graph.crearDotEscritorios("ListaEscritorio", listaEscritorios.getInicio());
        graph.gernerarImagen("ListaEscritorio.dot", "ListaEscritorios.png");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try { 
            graph.setAviones(turnoglobal);
            infog += "*********** TURNO " + turnoglobal + " ***********" + "\n\n";
            nodoAviones = nodoAviones.getSiguiente();
            imprimirAvion(nodoAviones);
            imagenAviones();
            infog += "******** PASAJEROS ********" + "\n";
            imprimirPasajero();
            imagenPasajeros();
            infog += "******** MALETAS ********" + "\n";
            nodomal = nodomal.siguiente;
            imprimirMaletas(nodomal);
            imagenMaletas();
            infog += "******** ESTACIONES ********"+"/n";
            nodoMantenimiento = nodoMantenimiento.siguiente;
            //listaMantenimiento(nodoMantenimiento);
            infog += "******** ESCRITORIOS ********" + "\n";
            nodoPasajeros = nodoPasajeros.siguiente;
            imprimirEscritorios(nodoPasajeros);
            imagenEscritorios();
            infog += "********** FIN TURNO " + turnoglobal + " **********" + "\n";
            turnoglobal++;
            jTextArea1.append(infog);
        } catch (Exception e) {
            

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cargarImagenes();

    }//GEN-LAST:event_jButton3ActionPerformed
    public void cargarImagenes() {
        labelAviones.repaint();
        ImageIcon airplane = new ImageIcon("ListaAviones.png");
        labelAviones.setIcon(airplane);
        
        this.desk.repaint();
        ImageIcon desk = new ImageIcon("ListaEscritorios.png");
        this.desk.setIcon(desk);
        
        colaPasajeros.repaint();
        ImageIcon pasajero = new ImageIcon("ColaPasajeros.png");
        colaPasajeros.setIcon(pasajero);
        
        maletas.repaint();
        ImageIcon male = new ImageIcon("ListaMaletas.png");
        maletas.setIcon(male);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colaPasajeros;
    private javax.swing.JLabel desk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelAviones;
    private javax.swing.JLabel maletas;
    // End of variables declaration//GEN-END:variables
}
