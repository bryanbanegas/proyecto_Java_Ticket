/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_Ticket_Proyecto;

import static Java_Ticket_Proyecto.Crear_Evento.hayEventos;
import static Java_Ticket_Proyecto.Crear_Usuario.users;
import static Java_Ticket_Proyecto.Login.pos;
import javax.swing.JOptionPane;

/**
 *
 * @author adalb
 */
public class Administracion_de_eventos extends javax.swing.JFrame {

    /**
     * Creates new form Administracion_de_eventos
     */
    public Administracion_de_eventos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }
    public static String claseCrear="";
    public static int tipo=0;
    public static int irA=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearEvento = new javax.swing.JButton();
        EliminarEvento = new javax.swing.JButton();
        EditarEvento = new javax.swing.JButton();
        VerEvento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CrearEvento.setText("Crear evento");
        CrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEventoActionPerformed(evt);
            }
        });

        EliminarEvento.setText("Eliminar evento");
        EliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEventoActionPerformed(evt);
            }
        });

        EditarEvento.setText("Editar un evento");
        EditarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEventoActionPerformed(evt);
            }
        });

        VerEvento.setText("Ver evento");
        VerEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEventoActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar al Menu principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(VerEvento)
                    .addComponent(EditarEvento)
                    .addComponent(EliminarEvento)
                    .addComponent(CrearEvento))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(CrearEvento)
                .addGap(18, 18, 18)
                .addComponent(EliminarEvento)
                .addGap(18, 18, 18)
                .addComponent(EditarEvento)
                .addGap(18, 18, 18)
                .addComponent(VerEvento)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEventoActionPerformed
        // TODO add your handling code here:
        if(users.get(pos).getTipo()==3){
            JOptionPane.showMessageDialog(null, "No tienes acceso a esta opcion.");
        }else{
            Object[] opciones={"Deportivo", "Musical","Religioso"};
            int error=0;
            while(error==0){
            try{
                int seleccion=JOptionPane.showOptionDialog(null,
                "Elige el tipo de evento:",
                "Elegir Opción",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,                    
                opciones[1]); 
                if(opciones[seleccion].equals("Deportivo")){
                    error=1;
                    tipo=1;
                    claseCrear="Deportivo";
                }else if(opciones[seleccion].equals("Musical")){
                    error=2;
                    tipo=2;
                    claseCrear="Musical";
                }else if(opciones[seleccion].equals("Religioso")){
                    error=3;
                    tipo=3;
                    claseCrear="Religioso";
                }
            }catch(ArrayIndexOutOfBoundsException e){
                        error=0;
            }
            }
            Crear_Evento pasar=new Crear_Evento();
            pasar.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_CrearEventoActionPerformed

    private void EliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEventoActionPerformed
        // TODO add your handling code here:
        if(hayEventos>0){
            confirmar_evento pasar=new confirmar_evento();
            pasar.setVisible(true);
            this.setVisible(false);
            irA=1;
        }else{
            JOptionPane.showMessageDialog(null, "No hay eventos para eliminar.");
        }
    }//GEN-LAST:event_EliminarEventoActionPerformed

    private void VerEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEventoActionPerformed
        // TODO add your handling code here:
        if(hayEventos>0){
            confirmar_evento pasar=new confirmar_evento();
            pasar.setVisible(true);
            this.setVisible(false);
            irA=3;
        }else{
            JOptionPane.showMessageDialog(null, "No hay eventos para ver.");
        }
    }//GEN-LAST:event_VerEventoActionPerformed

    private void EditarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEventoActionPerformed
        // TODO add your handling code here:
        if(users.get(pos).getTipo()==3){
            JOptionPane.showMessageDialog(null, "No tienes acceso a esta opcion.");
        }else{
            if(hayEventos>0){
                confirmar_evento pasar=new confirmar_evento();
                pasar.setVisible(true);
                this.setVisible(false);
                irA=2;
            }else{
                JOptionPane.showMessageDialog(null, "No hay eventos para editar.");
            }
        }
    }//GEN-LAST:event_EditarEventoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Sistema pasar=new Sistema();
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Administracion_de_eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion_de_eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion_de_eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion_de_eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion_de_eventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearEvento;
    private javax.swing.JButton EditarEvento;
    private javax.swing.JButton EliminarEvento;
    private javax.swing.JButton VerEvento;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
