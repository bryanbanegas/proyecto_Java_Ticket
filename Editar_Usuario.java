/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_Ticket_Proyecto;

import static Java_Ticket_Proyecto.Crear_Usuario.users;
import static Java_Ticket_Proyecto.confirmar_usuario.pos;
import static Java_Ticket_Proyecto.confirmar_usuario.usuarioLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author adalb
 */
public class Editar_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Editar_Usuario
     */
    public Editar_Usuario() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public static int cantidadeusuarios=1;
    public static int edadCrear=0;
    public static boolean puedeAvanzar=false,puedeAvanzar1=false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuarioTextbox = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        NombreTextbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EdadTextbox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Crear_usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PasswordTextbox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsuarioTextbox.setText(users.get(pos).getUser());

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        NombreTextbox.setText(users.get(pos).getName());

        jLabel3.setText("Nombre Completo:");

        String e=String.valueOf(users.get(pos).getEdad());
        EdadTextbox.setText(e);

        jLabel4.setText("Edad");

        Crear_usuario.setText("Editar Usuario");
        Crear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_usuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuraio:");

        jLabel2.setText("Contraseña:");

        PasswordTextbox.setText(users.get(pos).getPassword());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Crear_usuario)
                        .addGap(186, 186, 186)
                        .addComponent(cancelar)
                        .addGap(0, 161, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EdadTextbox)
                                .addGap(287, 287, 287))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PasswordTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsuarioTextbox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                                .addGap(0, 69, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PasswordTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EdadTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crear_usuario)
                    .addComponent(cancelar))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        Administracion_de_usuarios pasar=new Administracion_de_usuarios();
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void Crear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_usuarioActionPerformed
        // TODO add your handling code here:
        String usuarioCrear=UsuarioTextbox.getText();
        String nombreCrear=NombreTextbox.getText();
        String contraseñaCrear=PasswordTextbox.getText();
        String edad=EdadTextbox.getText();
        if(usuarioCrear.isEmpty()||nombreCrear.isEmpty()||contraseñaCrear.isEmpty()||edad.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
        }else{
            try{
            edadCrear=Integer.parseInt(edad);
            puedeAvanzar=true;
        }catch(NumberFormatException e){
            puedeAvanzar=false;
        }
        if(puedeAvanzar==true){
            for(int indice=0;indice<users.size();indice++){
                if(users.get(indice)!=null){
                    if(usuarioCrear.equals(usuarioLogin)){
                        puedeAvanzar1=true;
                        break;
                    }else if(users.get(indice).getUser().equals(usuarioCrear)){
                        puedeAvanzar1=false;
                        JOptionPane.showMessageDialog(null, "Usuario ya existe.");
                        break;
                    }else{
                        puedeAvanzar1=true;
                    }
                }
            }
            if(puedeAvanzar1==true){
                int error=0;
                while(error==0){
                try{
                    Object[] opciones={"Administrativo", "Contenido", "Limitado"};
                    int seleccion=JOptionPane.showOptionDialog(null,
                            "Elige el tipo de usuario:",
                            "Elegir Opción",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opciones,                    
                            opciones[1]); 
                    if(opciones[seleccion].equals("Administrativo")){
                        error=1;
                    }else if(opciones[seleccion].equals("Contenido")){
                        error=2;
                    }else if(opciones[seleccion].equals("Limitado")){
                        error=3;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    error=0;
                }
                }
                Usuarios editarUsuario=new Usuarios(nombreCrear,usuarioCrear,contraseñaCrear,edadCrear,error);
                users.set(pos,editarUsuario);
                JOptionPane.showMessageDialog(null, "Ha editado exitosamente su cuenta.");
                Administracion_de_usuarios pasar=new Administracion_de_usuarios();
                pasar.setVisible(true);
                this.setVisible(false);
                }
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese su edad en numeros enteros");
        }
        }
        
    }//GEN-LAST:event_Crear_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear_usuario;
    public static javax.swing.JTextField EdadTextbox;
    public static javax.swing.JTextField NombreTextbox;
    public static javax.swing.JTextField PasswordTextbox;
    public static javax.swing.JTextField UsuarioTextbox;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
