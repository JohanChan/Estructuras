/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascolasylistas;

import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Johan
 */
public class Simulador extends javax.swing.JFrame {
    ImageIcon aviones,mante,pasajero;
    int maleta,documentos,turnos;
    ListaDoble listaAviones,listaAviones2;
    ListaDoble listaEscritorios;
    ColaSimple pasajeros;
    ListaSimple listaMantenimiento;
    ListaCircularDoble listaMaletas;
    
    Graficador graf;
    int turnoGlobal,turnoAvion,pj;
    int avion,mantenimiento,escritorios;
    Consola consola;
   
    /**
     * Creates new form Simulador
     */
    public Simulador() {
        initComponents();
        listaAviones=listaAviones2 = new ListaDoble();
        pasajeros = new ColaSimple();
        listaEscritorios = new ListaDoble();
        listaMantenimiento = new ListaSimple();
        listaMaletas = new ListaCircularDoble();
        graf = new Graficador();
        
               
    }
    //metodo para Crear aviones aleatorios y turnos
    public void aviones(){
        System.out.println(avion);
        System.out.println(avion+" aviones");
        while(avion!=0){
            Random avioncito = new Random();
            turnoAvion = 1+avioncito.nextInt(3);
            switch(turnoAvion){
                case 1:
                        System.out.println("avion peque\n"+"turnos "+turnoAvion);
                        listaAviones.agregarAlInicio(turnoAvion);
                        
                        break;
                case 2:
                        System.out.println("avion mediano\n"+"turnos "+turnoAvion);
                        listaAviones.agregarAlInicio(turnoAvion);
                        
                        break;
                case 3:
                        System.out.println("avion grande \n"+"turnos "+turnoAvion);
                        listaAviones.agregarAlInicio(turnoAvion);
                        
                        break;
                default: 
                        System.out.println("ALV");
                    break;
            }
            //turnoGlobal += turnoAvion;
            pasajeros(turnoAvion);
            avion--;
            
        }
        listaAviones.imprimirListaCompleta();
        
        graf.crearDotAviones("listaAviones", listaAviones);
        graf.generarImagenAviones("listaAviones.dot", "listaAviones.png");
        

    }
    public void imagenesListas(){
        aviones = new ImageIcon("listaAviones.png");
        aviones = new ImageIcon(aviones.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        
        mante = new ImageIcon("listaMantenimiento.png");
        mante = new ImageIcon(mante.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight()/2, Image.SCALE_DEFAULT));
        
        pasajero = new ImageIcon("colaPasajeros.png"); 
        pasajero = new ImageIcon(pasajero.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
        
        this.jLabel1.setIcon(aviones);
        this.jLabel4.setIcon(mante); 
        this.jLabel3.setIcon(pasajero); 
        
        
    }
    //metodo para crear pasajeros dependiendo el turno del avion
    public void pasajeros(int pasajero){
        pj=0;
        Random pasaje = new Random();                        
        switch(pasajero){
            case 1:
                pj = pasaje.nextInt(6)+5;
                pasajeros.encolar(pj);
                //asignarPasajeros(pj);
                break;
            case 2:
                pj = pasaje.nextInt(11)+15;
                pasajeros.encolar(pj);
                //asignarPasajeros(pj);
                break;
            case 3:
                pj = pasaje.nextInt(11)+30;
                pasajeros.encolar(pj);
                //asignarPasajeros(pj);
                break;
            default:
                    System.out.println("ALV x2");
                break;
        }
         
        graf.crearDotPasajeros("colaPasajero", pasajeros);
        graf.generarImagenPasajeros("colaPasajero.dot", "colaPasajeros.png");
        maletasPasajeros(pj);
        documentosPasajeros(pj);
        turnosPasajeros(pj);
                
    }

    public int getAvion() {
        return avion;
    }

    public void setAvion(int avion) {
        this.avion = avion;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public int getEscritorios() {
        return escritorios;
    }

    public void setEscritorios(int escritorios) {
        this.escritorios = escritorios;
    }
    //metodo para crear maleta de cada pasajero
    public void maletasPasajeros(int pasajero){
        Random rndmaleta = new Random();
        while(pasajero!=0){
                maleta = rndmaleta.nextInt(4)+1;
                //System.out.println("Pasajero "+pasajero+" No de maletas " +maleta);
                listaMaletas.agregarAlFinal(maleta); 
                pasajero--;
        }
        
    }
    //metodo para crear No de documentos de cada pasajero
    public void documentosPasajeros(int pasajeros){
        Random rndDocumentos = new Random();
        while(pasajeros!=0){
            documentos = rndDocumentos.nextInt(10)+1;
            //System.out.println("Pasajero "+pasajeros+" No documentos "+documentos);
            pasajeros--;
        }
    }
    //metodo para asignar turnos a cada pasajero
    public void turnosPasajeros(int pasajeros){
        Random rndturnos = new Random();
        while(pasajeros!=0){
            turnos = rndturnos.nextInt(3)+1;
            //System.out.println("Pasajeros "+pasajeros+" Turnos "+turnos);
            pasajeros--;
        }
    }
    //metodo para asignar a la cola de pasajeros(solo para pruebas)
    public void asignarPasajeros(){
        
        
    }
    //metodo para crear los Escritorios y ordenarlos 
    public void numeroEscritorios(){
        System.out.println(escritorios);
    }
    //metodo para crear numero de escritorios de Mantenimiento
    public void numeroMantenimiento(){
        System.out.println("Escritorios de Mantenimiento "+mantenimiento);
        while(mantenimiento!=0){
            listaMantenimiento.agregarAlInicio(mantenimiento);
            mantenimiento--;
        }
        listaMantenimiento.mostrarLista();
        System.out.println();
        graf.generarDotEscritorios("listaMantenimiento", listaMantenimiento);
        graf.generarImagenEscritorios("listaMantenimiento.dot", "listaMantenimiento.png");
        
    }
    public void turnos(){
        try{
        int dato;
        NodoDoble aux = new NodoDoble();
        Nodo auxpas = new Nodo();
        aux = listaAviones.inicio;
        auxpas = pasajeros.listasimple.inicio;
        System.out.println(auxpas);
        if(turnoAvion==0){
            turnoAvion=(int) aux.siguiente.dato;
            listaAviones.extraeInicio();
            listaAviones.imprimirListaCompleta();
            //System.out.println(aux);
            //System.out.println(turnoAvion);
                        
        }else{
            System.out.println("Turno primer avion "+turnoAvion+"\n");
            turnoAvion--;
            
        }
        graf.crearDotAviones("listaAviones", listaAviones);
        graf.generarImagenAviones("listaAviones.dot", "listaAviones.png");
        }catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
    public void consola(){
        NodoDoble aux = new NodoDoble();
        Nodo cola = new Nodo();
        cola = pasajeros.listasimple.inicio;
        aux = listaAviones.inicio;
        if(aux == null){
            
        }else{
        jTextArea1.append("Simulador");
        jTextArea1.append("Avion" +aux.dato+"\n");
        jTextArea1.append("pasajeros " +cola.dato+"\n");    
        aux = aux.siguiente;
        }
        
        
        cola = cola.siguiente;
        
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Automatico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("jLabel4");

        jMenu2.setText("Mostrar");

        jMenuItem2.setText("Lista Aviones");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Lista Pasajeros");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Lista Escritorios");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Lista Maletas");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Lista Mantenimiento de Aviones");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jButton1.getText().equals("Empezar")){
            aviones();
            numeroMantenimiento(); 
            asignarPasajeros();
            
            jButton1.setText("Siguiente"); 
        }else if(jButton1.getText().equals("Siguiente")){
            turnos();
            imagenesListas();
            asignarPasajeros();
            consola();
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

