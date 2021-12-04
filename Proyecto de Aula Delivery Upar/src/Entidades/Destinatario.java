/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author German
 */
public class Destinatario extends Persona {
private String calle_carrera;
private String numcasa;
private long codpostal;
private long telefono;


public Destinatario(String nombre, String apellido, long id, String calle_carrera, String numcasa, long codpostal, long telefono ){
   super(nombre, apellido, id);
  
   this.calle_carrera=calle_carrera;
   this.numcasa=numcasa;
   this.codpostal=codpostal;
   this.telefono=telefono;

}


    public String getCalle_carrera() {
        return calle_carrera;
    }

    public void setCalle_carrera(String calle_carrera) {
        this.calle_carrera = calle_carrera;
    }

    public String getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(String numcasa) {
        this.numcasa = numcasa;
    }

    public long getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(long codpostal) {
        this.codpostal = codpostal;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getDatosPersona() {
       return "Dirección: " + this.calle_carrera +
               " " + this.numcasa
               +"\nCódigo Postal: " +this.codpostal 
               +"\nTeléfono: "+this.telefono;          
    }
  
}
