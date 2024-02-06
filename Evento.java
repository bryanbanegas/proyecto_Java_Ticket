/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Ticket_Proyecto;

import static Java_Ticket_Proyecto.Crear_Evento.eventos;
import static Java_Ticket_Proyecto.Reportes.hoy;
import static Java_Ticket_Proyecto.Reportes.jList1;
import static Java_Ticket_Proyecto.Reportes.modelo;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author adalb
 */
public class Evento {
    private String codigo;
    private String titulo;
    private String descripcion;
    private Date fecha;
    private int cantidad;
    private String clase;
    private double monto;
    
    public Evento(String codigo, String clase, String titulo, String descripcion, Date fecha, double monto, int cantidad) {
        this.codigo=codigo;
        this.clase=clase;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.monto=monto;
        this.cantidad=cantidad;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getClase(){
        return clase;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public double getCantidad(){
        return cantidad;
    }
    
    public void listaDeEventosRealizados(int indice){
        if(indice<eventos.size()){
            if(hoy.before(eventos.get(indice).getFecha())){
                if(eventos.get(indice).getClase().equals("cancelado")){
                    
                }else{
                    modelo.addElement("Codigo: "+eventos.get(indice).getCodigo()+", Tipo: "+eventos.get(indice).getClase()+
                        ", Titulo: "+eventos.get(indice).getTitulo()+", Fecha: "+eventos.get(indice).getFecha()+
                        ", Monto: "+eventos.get(indice).getMonto());
                    jList1.setModel(modelo);
                }
            }else{
                
            }
            listaDeEventosRealizados(indice+1);
        }
    }
    
    public void listaDeEventosFuturos(int indice){
        if(indice<eventos.size()){
            if(hoy.before(eventos.get(indice).getFecha())){
                
            }else{
                if(eventos.get(indice).getClase().equals("cancelado")){
                    
                }else{
                    modelo.addElement("Codigo: "+eventos.get(indice).getCodigo()+", Tipo: "+eventos.get(indice).getClase()+
                        ", Titulo: "+eventos.get(indice).getTitulo()+", Fecha: "+eventos.get(indice).getFecha()+
                        ", Monto: "+eventos.get(indice).getMonto());
                    jList1.setModel(modelo);
                }
            }
            listaDeEventosFuturos(indice+1);
        }
    }
    
    /*
    if(indice<2){
        if(indice<2){
            modelo.addElement("jgvhbjhgfbkjhg");
            jList1.setModel(modelo);
            lista(indice+1);
        }else{

        }
    }
    */
}
