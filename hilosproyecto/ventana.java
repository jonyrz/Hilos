
package hilosproyecto;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ventana extends javax.swing.JFrame {
    
     private class HiloTiempo2 extends Thread{
        @Override
        public void run(){
            int cont=0;
            while(true){
                cajero.setText("Tiempo: "+cont);
                try{
                    Thread.sleep(1500);
                }catch(InterruptedException ex){
                    Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                cont++;
            }
        }
    }
     
    //HiloTiempo miHilo;
    Thread miThread;
    HiloTiempo2 miOtroHilo;
    
    public ventana(){
        initComponents();
        
        //miHilo = new HiloTiempo();
        miThread = new Thread(miThread);
        miOtroHilo = new HiloTiempo2();
        
        miThread.start();
        miOtroHilo.start();
  
    } 

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personaje = new javax.swing.JLabel();
        cajero = new javax.swing.JLabel();
        lbltiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/personaje.jpg"))); // NOI18N
        personaje.setText("jLabel2");
        personaje.setMaximumSize(new java.awt.Dimension(558, 750));

        cajero.setText("cajero");

        lbltiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cajero.jpg"))); // NOI18N
        lbltiempo.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(personaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(lbltiempo)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cajero)
                .addGap(392, 392, 392))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personaje, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltiempo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajero)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int x = personaje.getX();
        int y = personaje.getY();
        if(evt.getKeyChar()=='a'){
            x=x-2;
            personaje.setLocation(x, y);
        }
        
        if(evt.getKeyChar()=='d'){
            x=x+10;
            personaje.setLocation(x, y);
        }
    }//GEN-LAST:event_formKeyPressed

    
   public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cajero;
    private javax.swing.JLabel lbltiempo;
    private javax.swing.JLabel personaje;
    // End of variables declaration//GEN-END:variables
}
