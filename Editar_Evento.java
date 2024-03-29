/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_Ticket_Proyecto;

import javax.swing.JOptionPane;
import static Java_Ticket_Proyecto.confirmar_evento.tipo;
import static Java_Ticket_Proyecto.Crear_Evento.eventos;
import static Java_Ticket_Proyecto.confirmar_evento.codigoLogin;
import static Java_Ticket_Proyecto.confirmar_evento.pos;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author adalb
 */
public class Editar_Evento extends javax.swing.JFrame {

    /**
     Creates new form Editar_Evento
     */
    public Editar_Evento() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public static Date fechaCrear;
    public static Evento llamar=new Evento("","","","",fechaCrear,0,0);
    public static String codigoCrear,tituloCrear,descripcionCrear,equipo1Crear,equipo2Crear,tipoCrear,montoprueba;
    public static String equipo1miembor1,equipo1miembor2,equipo1miembor3,equipo1miembor4,equipo1miembor5;
    public static String equipo2miembor1,equipo2miembor2,equipo2miembor3,equipo2miembor4,equipo2miembor5;
    public static String bandamiembro1,bandamiembro2,bandamiembro3,rolbanda1,rolbanda2,rolbanda3;
    public static ArrayList miembrosDeEquipos=new ArrayList<>();
    public static ArrayList miembrosDeBandas=new ArrayList<>();
    public static ArrayList personasConvertidas=new ArrayList<>();
    public static int cantidadCrear,cantidadConvertidos;
    public static int hayEventos=0;
    public static double montoCrear;
    public static boolean puedeAvanzar=false,puedeAvanzar1=false,puedeAvanzar2=false,puedeAvanzar3=false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MontoTextbox = new javax.swing.JTextField();
        CantidadTextbox = new javax.swing.JTextField();
        CrearEvento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Equipo2Textbox = new javax.swing.JTextField();
        TituloTextbox = new javax.swing.JTextField();
        CodigoTextbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DescripcionTextbox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipoComboBox = new javax.swing.JComboBox<>();
        FechaTextbox = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        equipo2Label = new javax.swing.JLabel();
        equipo1Label = new javax.swing.JLabel();
        Equipo1Textbox = new javax.swing.JTextField();
        nombreMiembro1 = new javax.swing.JTextField();
        nombreMiembro2 = new javax.swing.JTextField();
        nombreMiembro3 = new javax.swing.JTextField();
        nombreMiembro4 = new javax.swing.JTextField();
        nombreMiembro5 = new javax.swing.JTextField();
        nombreMiembro6 = new javax.swing.JTextField();
        nombreMiembro7 = new javax.swing.JTextField();
        nombreMiembro8 = new javax.swing.JTextField();
        nombreMiembro9 = new javax.swing.JTextField();
        nombreMiembro10 = new javax.swing.JTextField();
        rolBanda3 = new javax.swing.JComboBox<>();
        rolBanda2 = new javax.swing.JComboBox<>();
        rolBanda1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Descripcion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 156, -1, 24));

        jLabel1.setText("Titulo de evento:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 32, -1, 24));

        jLabel10.setText("Monto:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 201, -1, -1));

        jLabel5.setText("Cantidad de personas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 116, -1, -1));

        if(tipo==3){
            MontoTextbox.setVisible(false);
        }else{
            int Int=(int)eventos.get(pos).getMonto();
            String montotext=String.valueOf(Int);
            MontoTextbox.setText(montotext);
        }
        getContentPane().add(MontoTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 198, 185, -1));

        int Ints=(int)eventos.get(pos).getCantidad();
        String montotexto=String.valueOf(Ints);
        CantidadTextbox.setText(montotexto);
        getContentPane().add(CantidadTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 116, 180, -1));

        CrearEvento.setText("Editar");
        CrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEventoActionPerformed(evt);
            }
        });
        getContentPane().add(CrearEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jButton1.setText("Cancelar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        if(tipo==3){
            Equipo2Textbox.setVisible(false);
        }else if(tipo==2){
            Equipo2Textbox.setVisible(false);
        }
        getContentPane().add(Equipo2Textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 281, 133, -1));

        TituloTextbox.setText(eventos.get(pos).getTitulo());
        getContentPane().add(TituloTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 33, 345, -1));

        CodigoTextbox.setText(eventos.get(pos).getCodigo());
        getContentPane().add(CodigoTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 75, 345, -1));

        jLabel3.setText("Codigo de evento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 74, -1, 24));

        jLabel7.setText("Equipo 1:");
        if(tipo==3){
            jLabel7.setVisible(false);
        }else if(tipo==2){
            jLabel7.setVisible(false);
        }
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 280, -1, 24));

        DescripcionTextbox.setText(eventos.get(pos).getDescripcion());
        getContentPane().add(DescripcionTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 157, 345, -1));

        jLabel8.setText("Equipo 2:");
        if(tipo==3){
            jLabel8.setVisible(false);
        }else if(tipo==2){
            jLabel8.setVisible(false);
        }
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 280, -1, 24));

        jLabel6.setText("Fecha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 236, -1, 24));

        if(tipo==3){
            tipoComboBox.setVisible(false);
        }else if(tipo==2){
            tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Pop","Rock","Rap","Clasica","Reggeaton","Otro" }));
        }else if(tipo==1){
            tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Futbol","Tenis","Rugby","Baseball" }));
        }
        tipoComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(tipoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        FechaTextbox.setDate(eventos.get(pos).getFecha());
        getContentPane().add(FechaTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 238, 185, -1));

        jLabel11.setText("Tipo:");
        if(tipo==3){
            jLabel11.setVisible(false);
        }else if(tipo==2){
            jLabel11.setText("Tipo de musica:");
        }else if(tipo==1){
            jLabel11.setText("Tipo de deporte:");
        }
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, 24));

        equipo2Label.setText("Titulo de evento:");
        if(tipo==3){
            equipo2Label.setVisible(false);
        }else if(tipo==2){
            equipo2Label.setVisible(false);
        }
        getContentPane().add(equipo2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, 24));

        equipo1Label.setText("Titulo de evento:");
        if(tipo==3){
            equipo1Label.setText("Cantidad de personas convertidas:");
        }
        getContentPane().add(equipo1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, 24));

        if(tipo==3){
            Equipo1Textbox.setVisible(false);
        }else if(tipo==2){
            Equipo1Textbox.setVisible(false);
        }else{

        }
        getContentPane().add(Equipo1Textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 281, 133, -1));
        getContentPane().add(nombreMiembro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 110, -1));

        if(tipo==3){
            nombreMiembro2.setVisible(false);
        }
        getContentPane().add(nombreMiembro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 110, -1));

        if(tipo==3){
            nombreMiembro3.setVisible(false);
        }
        getContentPane().add(nombreMiembro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 110, -1));

        if(tipo==3){
            nombreMiembro4.setVisible(false);
        }else if(tipo==2){
            nombreMiembro4.setVisible(false);
        }
        getContentPane().add(nombreMiembro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 110, -1));

        if(tipo==3){
            nombreMiembro5.setVisible(false);
        }else if(tipo==2){
            nombreMiembro5.setVisible(false);
        }
        getContentPane().add(nombreMiembro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 110, -1));

        if(tipo==3){
            nombreMiembro6.setVisible(false);
        }else if(tipo==2){
            nombreMiembro6.setVisible(false);
        }
        getContentPane().add(nombreMiembro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 110, -1));

        if(tipo==3){
            nombreMiembro7.setVisible(false);
        }else if(tipo==2){
            nombreMiembro7.setVisible(false);
        }
        getContentPane().add(nombreMiembro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 110, -1));

        if(tipo==3){
            nombreMiembro8.setVisible(false);
        }else if(tipo==2){
            nombreMiembro8.setVisible(false);
        }
        getContentPane().add(nombreMiembro8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 110, -1));

        if(tipo==3){
            nombreMiembro9.setVisible(false);
        }else if(tipo==2){
            nombreMiembro9.setVisible(false);
        }
        getContentPane().add(nombreMiembro9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 110, -1));

        if(tipo==3){
            nombreMiembro10.setVisible(false);
        }else if(tipo==2){
            nombreMiembro10.setVisible(false);
        }
        getContentPane().add(nombreMiembro10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 110, -1));

        rolBanda3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Baterista", "Guitarrista", "Vocalista" }));
        rolBanda3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rolBanda3ItemStateChanged(evt);
            }
        });
        if(tipo==2){
            rolBanda3.setVisible(true);
        }else{
            rolBanda3.setVisible(false);
        }
        getContentPane().add(rolBanda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 90, -1));

        rolBanda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Baterista", "Guitarrista", "Vocalista" }));
        rolBanda2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rolBanda2ItemStateChanged(evt);
            }
        });
        if(tipo==2){
            rolBanda2.setVisible(true);
        }else{
            rolBanda2.setVisible(false);
        }
        getContentPane().add(rolBanda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 90, -1));

        rolBanda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Baterista", "Guitarrista", "Vocalista" }));
        rolBanda1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rolBanda1ItemStateChanged(evt);
            }
        });
        if(tipo==2){
            rolBanda1.setVisible(true);
        }else{
            rolBanda1.setVisible(false);
        }
        getContentPane().add(rolBanda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEventoActionPerformed
        // TODO add your handling code here:
        if(tipo==3){
            tipoCrear="";
            montoprueba="2000";
        }else{
            montoprueba=MontoTextbox.getText();
        }
        codigoCrear=CodigoTextbox.getText();
        tituloCrear=TituloTextbox.getText();
        descripcionCrear=DescripcionTextbox.getText();
        fechaCrear=FechaTextbox.getDate();
        String cantidadprueba=CantidadTextbox.getText();
        if(codigoCrear.isEmpty()||tituloCrear.isEmpty()||descripcionCrear.isEmpty()||montoprueba.isEmpty()||cantidadprueba.isEmpty()||fechaCrear==null||tipoCrear==null){
            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
        }else{
        try{
            montoCrear=Integer.parseInt(montoprueba);
            cantidadCrear=Integer.parseInt(cantidadprueba);
            puedeAvanzar=true;
        }catch(NumberFormatException e){
            puedeAvanzar=false;
        }
        if(puedeAvanzar==true){
            if(tipo==1){
                equipo1miembor1=nombreMiembro1.getText();
                equipo1miembor2=nombreMiembro2.getText();
                equipo1miembor3=nombreMiembro3.getText();
                equipo1miembor4=nombreMiembro4.getText();
                equipo1miembor5=nombreMiembro5.getText();
                equipo2miembor1=nombreMiembro6.getText();
                equipo2miembor2=nombreMiembro7.getText();
                equipo2miembor3=nombreMiembro8.getText();
                equipo2miembor4=nombreMiembro9.getText();
                equipo2miembor5=nombreMiembro10.getText();
                equipo1Crear=Equipo1Textbox.getText();
                equipo2Crear=Equipo2Textbox.getText();
                if(equipo1Crear.isEmpty()||equipo2Crear.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
                }else{
                    if(tipoCrear.equals("")){
                        JOptionPane.showMessageDialog(null, "Tiene que escoger un tipo de deporte");
                    }else if(tipoCrear.equals("Futbol")){
                        if(equipo1miembor1.isEmpty()||equipo1miembor2.isEmpty()||equipo1miembor3.isEmpty()
                                ||equipo1miembor4.isEmpty()||equipo1miembor5.isEmpty()||equipo2miembor1.isEmpty()
                                ||equipo2miembor2.isEmpty()||equipo2miembor3.isEmpty()||equipo2miembor4.isEmpty()
                                ||equipo2miembor5.isEmpty()){
                            puedeAvanzar2=false;
                            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
                        }else{
                            puedeAvanzar2=true;
                        }
                    }else if(tipoCrear.equals("Tenis")){
                        if(equipo1miembor1.isEmpty()||equipo1miembor2.isEmpty()||equipo2miembor1.isEmpty()
                                ||equipo2miembor2.isEmpty()){
                            puedeAvanzar2=false;
                            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
                        }else{
                            puedeAvanzar2=true;
                        }
                    }else if(tipoCrear.equals("Rugby")){
                        if(equipo1miembor1.isEmpty()||equipo1miembor2.isEmpty()||equipo1miembor3.isEmpty()
                                ||equipo1miembor4.isEmpty()||equipo1miembor5.isEmpty()||equipo2miembor1.isEmpty()
                                ||equipo2miembor2.isEmpty()||equipo2miembor3.isEmpty()||equipo2miembor4.isEmpty()
                                ||equipo2miembor5.isEmpty()){
                            puedeAvanzar2=false;
                            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
                        }else{
                            puedeAvanzar2=true;
                        }
                    }else if(tipoCrear.equals("Baseball")){
                        if(equipo1miembor1.isEmpty()||equipo1miembor2.isEmpty()||equipo1miembor3.isEmpty()
                                ||equipo1miembor4.isEmpty()||equipo2miembor1.isEmpty()||equipo2miembor2.isEmpty()
                                ||equipo2miembor3.isEmpty()||equipo2miembor4.isEmpty()){
                            puedeAvanzar2=false;
                            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
                        }else{
                            puedeAvanzar2=true;
                        }
                    }
                    if(puedeAvanzar2==true){
                        for(int indice=0;indice<eventos.size();indice++){
                            if(eventos.get(indice)!=null){
                                if(codigoCrear.equals(codigoLogin)){
                                    puedeAvanzar1=true;
                                    break;
                                }else if(eventos.get(indice).getCodigo().equals(codigoCrear)){
                                    puedeAvanzar1=false;
                                    JOptionPane.showMessageDialog(null, "Codigo Existente");
                                    break;
                                }else{
                                    puedeAvanzar1=true;
                                }
                            }
                        }
                        if(puedeAvanzar1==true){
                            Evento_Deportivo editarEvento=new Evento_Deportivo(codigoCrear,"Deportivo",tituloCrear,descripcionCrear,
                                fechaCrear,montoCrear,cantidadCrear,equipo1Crear,equipo2Crear,tipoCrear);
                                    eventos.set(pos,editarEvento);
                            if(tipoCrear.equals("Futbol")){
                                miembrosDeEquipos.add("Miembro de Equipo 1: "+equipo1miembor1+", "+equipo1miembor2+", "+equipo1miembor3+", "+equipo1miembor4+", "+equipo1miembor5+
                                        "\n"+"Miembro de Equipo 2: "+equipo2miembor1+", "+equipo2miembor2+", "+equipo2miembor3+", "+equipo2miembor4+", "+equipo2miembor5);
                            }else if(tipoCrear.equals("Tenis")){
                                miembrosDeEquipos.add("Miembro de Equipo 1: "+equipo1miembor1+", "+equipo1miembor2+
                                        "\n"+"Miembro de Equipo 2: "+equipo2miembor1+", "+equipo2miembor2);
                            }else if(tipoCrear.equals("Rugby")){
                                miembrosDeEquipos.add("Miembro de Equipo 1: "+equipo1miembor1+", "+equipo1miembor2+", "+equipo1miembor3+", "+equipo1miembor4+", "+equipo1miembor5+
                                        "\n"+"Miembro de Equipo 2: "+equipo2miembor1+", "+equipo2miembor2+", "+equipo2miembor3+", "+equipo2miembor4+", "+equipo2miembor5);
                            }else if(tipoCrear.equals("Baseball")){
                                miembrosDeEquipos.add("Miembro de Equipo 1: "+equipo1miembor1+", "+equipo1miembor2+", "+equipo1miembor3+", "+equipo1miembor4+
                                        "\n"+"Miembro de Equipo 2: "+equipo2miembor1+", "+equipo2miembor2+", "+equipo2miembor3+", "+equipo2miembor4);
                            }
                            JOptionPane.showMessageDialog(null, "Ha editado su evento con exito.");
                            puedeAvanzar=false;
                            puedeAvanzar1=false;
                            Administracion_de_eventos pasar=new Administracion_de_eventos();
                            pasar.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
            }else if(tipo==2){
                bandamiembro1=nombreMiembro1.getText();
                bandamiembro2=nombreMiembro2.getText();
                bandamiembro3=nombreMiembro3.getText();
                if(tipoCrear==null){
                    JOptionPane.showMessageDialog(null, "Tiene que escoger un tipo de musica");
                }else if(tipoCrear.equals("")){
                    JOptionPane.showMessageDialog(null, "Tiene que escoger un tipo de musica");
                }else{
                    if(bandamiembro1.isEmpty()||bandamiembro2.isEmpty()||bandamiembro3.isEmpty()){
                        puedeAvanzar2=false;
                        JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
                    }else{
                        puedeAvanzar2=true;
                    }
                }
                if(rolbanda1.equals(rolbanda2)||rolbanda1.equals(rolbanda3)){
                    puedeAvanzar3=false;
                }else if(rolbanda2.equals(rolbanda1)||rolbanda2.equals(rolbanda3)){
                    puedeAvanzar3=false;
                }else if(rolbanda3.equals(rolbanda1)||rolbanda3.equals(rolbanda2)){
                    puedeAvanzar3=false;
                }else{
                    puedeAvanzar3=true;
                }
                if(puedeAvanzar3==false){
                    JOptionPane.showMessageDialog(null, "Por favor, seleccionar un rol unico para cada musico.");
                }else{
                if(puedeAvanzar2==true){
                    for(int indice=0;indice<eventos.size();indice++){
                        if(eventos.get(indice)!=null){
                            if(codigoCrear.equals(codigoLogin)){
                                puedeAvanzar1=true;
                                break;
                            }else if(eventos.get(indice).getCodigo().equals(codigoCrear)){
                                puedeAvanzar1=false;
                                JOptionPane.showMessageDialog(null, "Codigo Existente");
                                break;
                            }else{
                                puedeAvanzar1=true;
                            }
                        }
                    }
                    if(puedeAvanzar1==true){
                        Evento_Musical editarEvento=new Evento_Musical(codigoCrear,"Musical",tituloCrear,descripcionCrear,
                            fechaCrear,montoCrear,cantidadCrear,tipoCrear);
                            eventos.set(pos,editarEvento);
                        miembrosDeBandas.add(rolbanda1+": "+bandamiembro1+", "+rolbanda2+": "+bandamiembro2+", "+rolbanda3+": "+bandamiembro3);
                        JOptionPane.showMessageDialog(null, "Ha editado su evento con exito.");
                        puedeAvanzar=false;
                        puedeAvanzar1=false;
                        Administracion_de_eventos pasar=new Administracion_de_eventos();
                        pasar.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            }else if(tipo==3){
                String cantidadConvertidosPrueba=nombreMiembro1.getText();
                try{
                    cantidadConvertidos=Integer.parseInt(cantidadConvertidosPrueba);
                    puedeAvanzar3=true;
                }catch(NumberFormatException e){
                    puedeAvanzar3=false;
                    JOptionPane.showMessageDialog(null, "Ingrese numeros enteros para cantidad de convertidos");
                }
                if(puedeAvanzar3==true){
                    for(int indice=0;indice<eventos.size();indice++){
                        if(eventos.get(indice)!=null){
                            if(codigoCrear.equals(codigoLogin)){
                                puedeAvanzar1=true;
                                break;
                            }else if(eventos.get(indice).getCodigo().equals(codigoCrear)){
                                puedeAvanzar1=false;
                                JOptionPane.showMessageDialog(null, "Codigo Existente");
                                break;
                            }else{
                                puedeAvanzar1=true;
                            }
                        }
                    }
                    if(puedeAvanzar1==true){
                        Evento_Religioso editarEvento=new Evento_Religioso(codigoCrear,"Religioso",tituloCrear,descripcionCrear,
                                fechaCrear,montoCrear,cantidadCrear);
                            eventos.set(pos,editarEvento);
                        personasConvertidas.add("Personas convertidas: "+cantidadConvertidos);
                        JOptionPane.showMessageDialog(null, "Ha editado su evento con exito.");
                        puedeAvanzar=false;
                        puedeAvanzar1=false;
                        Administracion_de_eventos pasar=new Administracion_de_eventos();
                        pasar.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            
            }else{
                JOptionPane.showMessageDialog(null, "Asegurese de ingresar numero enteros para Monto y Cantidad.");
            }
        }
    }//GEN-LAST:event_CrearEventoActionPerformed

    private void tipoComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoComboBoxItemStateChanged
        // TODO add your handling code here:
        tipoCrear=(String) tipoComboBox.getSelectedItem();
        switch(tipoCrear){
            case "Futbol":
                equipo1Label.setText("Miembros de Equipo 1:");
                equipo2Label.setText("Miembros de Equipo 2:");
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(true);
                nombreMiembro4.setVisible(true);
                nombreMiembro5.setVisible(true);
                nombreMiembro6.setVisible(true);
                nombreMiembro7.setVisible(true);
                nombreMiembro8.setVisible(true);
                nombreMiembro9.setVisible(true);
                nombreMiembro10.setVisible(true);
                rolBanda1.setVisible(false);
                rolBanda2.setVisible(false);
                rolBanda3.setVisible(false);
                break;
            case "Tenis":
                equipo1Label.setText("Miembros de Equipo 1:");
                equipo2Label.setText("Miembros de Equipo 2:");
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(false);
                nombreMiembro4.setVisible(false);
                nombreMiembro5.setVisible(false);
                nombreMiembro6.setVisible(true);
                nombreMiembro7.setVisible(true);
                nombreMiembro8.setVisible(false);
                nombreMiembro9.setVisible(false);
                nombreMiembro10.setVisible(false);
                rolBanda1.setVisible(false);
                rolBanda2.setVisible(false);
                rolBanda3.setVisible(false);
                break;
            case "Rugby":
                equipo1Label.setText("Miembros de Equipo 1:");
                equipo2Label.setText("Miembros de Equipo 2:");
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(true);
                nombreMiembro4.setVisible(true);
                nombreMiembro5.setVisible(true);
                nombreMiembro6.setVisible(true);
                nombreMiembro7.setVisible(true);
                nombreMiembro8.setVisible(true);
                nombreMiembro9.setVisible(true);
                nombreMiembro10.setVisible(true);
                rolBanda1.setVisible(false);
                rolBanda2.setVisible(false);
                rolBanda3.setVisible(false);
                break;
            case "Baseball":
                equipo1Label.setText("Miembros de Equipo 1:");
                equipo2Label.setText("Miembros de Equipo 2:");
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(true);
                nombreMiembro4.setVisible(true);
                nombreMiembro5.setVisible(false);
                nombreMiembro6.setVisible(true);
                nombreMiembro7.setVisible(true);
                nombreMiembro8.setVisible(true);
                nombreMiembro9.setVisible(true);
                nombreMiembro10.setVisible(false);
                rolBanda1.setVisible(false);
                rolBanda2.setVisible(false);
                rolBanda3.setVisible(false);
                break;
            case "Pop":
                equipo1Label.setText("Miembors de banda:");
                equipo2Label.setVisible(false);
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(true);
                nombreMiembro4.setVisible(false);
                nombreMiembro5.setVisible(false);
                nombreMiembro6.setVisible(false);
                nombreMiembro7.setVisible(false);
                nombreMiembro8.setVisible(false);
                nombreMiembro9.setVisible(false);
                nombreMiembro10.setVisible(false);
                rolBanda1.setVisible(true);
                rolBanda2.setVisible(true);
                rolBanda3.setVisible(true);
                break;
            case "Rock":
                equipo1Label.setText("Miembors de banda:");
                equipo2Label.setVisible(false);
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(true);
                nombreMiembro4.setVisible(false);
                nombreMiembro5.setVisible(false);
                nombreMiembro6.setVisible(false);
                nombreMiembro7.setVisible(false);
                nombreMiembro8.setVisible(false);
                nombreMiembro9.setVisible(false);
                nombreMiembro10.setVisible(false);
                rolBanda1.setVisible(true);
                rolBanda2.setVisible(true);
                rolBanda3.setVisible(true);
                break;
            case "Rap":
                equipo1Label.setText("Miembors de banda:");
                equipo2Label.setVisible(false);
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(true);
                nombreMiembro4.setVisible(false);
                nombreMiembro5.setVisible(false);
                nombreMiembro6.setVisible(false);
                nombreMiembro7.setVisible(false);
                nombreMiembro8.setVisible(false);
                nombreMiembro9.setVisible(false);
                nombreMiembro10.setVisible(false);
                rolBanda1.setVisible(true);
                rolBanda2.setVisible(true);
                rolBanda3.setVisible(true);
                break;
            case "Reggeaton":
                equipo1Label.setText("Miembors de banda:");
                equipo2Label.setVisible(false);
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(true);
                nombreMiembro4.setVisible(false);
                nombreMiembro5.setVisible(false);
                nombreMiembro6.setVisible(false);
                nombreMiembro7.setVisible(false);
                nombreMiembro8.setVisible(false);
                nombreMiembro9.setVisible(false);
                nombreMiembro10.setVisible(false);
                rolBanda1.setVisible(true);
                rolBanda2.setVisible(true);
                rolBanda3.setVisible(true);
                break;
            case "Otro":
                equipo1Label.setText("Miembors de banda:");
                equipo2Label.setVisible(false);
                nombreMiembro1.setVisible(true);
                nombreMiembro2.setVisible(true);
                nombreMiembro3.setVisible(true);
                nombreMiembro4.setVisible(false);
                nombreMiembro5.setVisible(false);
                nombreMiembro6.setVisible(false);
                nombreMiembro7.setVisible(false);
                nombreMiembro8.setVisible(false);
                nombreMiembro9.setVisible(false);
                nombreMiembro10.setVisible(false);
                rolBanda1.setVisible(true);
                rolBanda2.setVisible(true);
                rolBanda3.setVisible(true);
                break;    
            default:
                break;
                
        }
    }//GEN-LAST:event_tipoComboBoxItemStateChanged

    private void rolBanda1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rolBanda1ItemStateChanged
        // TODO add your handling code here:
        rolbanda1=(String) rolBanda1.getSelectedItem();
    }//GEN-LAST:event_rolBanda1ItemStateChanged

    private void rolBanda2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rolBanda2ItemStateChanged
        // TODO add your handling code here:
        rolbanda2=(String) rolBanda2.getSelectedItem();
    }//GEN-LAST:event_rolBanda2ItemStateChanged

    private void rolBanda3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rolBanda3ItemStateChanged
        // TODO add your handling code here:
        rolbanda3=(String) rolBanda3.getSelectedItem();
    }//GEN-LAST:event_rolBanda3ItemStateChanged

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
            java.util.logging.Logger.getLogger(Editar_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField CantidadTextbox;
    public static javax.swing.JTextField CodigoTextbox;
    private javax.swing.JButton CrearEvento;
    public static javax.swing.JTextField DescripcionTextbox;
    public static javax.swing.JTextField Equipo1Textbox;
    public static javax.swing.JTextField Equipo2Textbox;
    public static com.toedter.calendar.JDateChooser FechaTextbox;
    public static javax.swing.JTextField MontoTextbox;
    public static javax.swing.JTextField TituloTextbox;
    public static javax.swing.JLabel equipo1Label;
    public static javax.swing.JLabel equipo2Label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JTextField nombreMiembro1;
    public static javax.swing.JTextField nombreMiembro10;
    public static javax.swing.JTextField nombreMiembro2;
    public static javax.swing.JTextField nombreMiembro3;
    public static javax.swing.JTextField nombreMiembro4;
    public static javax.swing.JTextField nombreMiembro5;
    public static javax.swing.JTextField nombreMiembro6;
    public static javax.swing.JTextField nombreMiembro7;
    public static javax.swing.JTextField nombreMiembro8;
    public static javax.swing.JTextField nombreMiembro9;
    public static javax.swing.JComboBox<String> rolBanda1;
    public static javax.swing.JComboBox<String> rolBanda2;
    public static javax.swing.JComboBox<String> rolBanda3;
    public static javax.swing.JComboBox<String> tipoComboBox;
    // End of variables declaration//GEN-END:variables
}
