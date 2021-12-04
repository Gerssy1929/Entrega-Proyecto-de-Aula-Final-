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
public class Remitente extends Persona {

private String calle_carrera;
private String numcasa;
private String pais;
private String ciudad;
private long telefono;

    public Remitente(String nombre, String apellido, long id, String calle_carrera, String numcasa, String pais, String ciudad, long telefono) {
        super(nombre, apellido, id);
        this.calle_carrera = calle_carrera;
        this.numcasa = numcasa;
        this.pais = pais;
        this.ciudad = ciudad;
        this.telefono = telefono;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    

    @Override
    public String getDatosPersona() {
        return "País: " + this.pais
                +"\nCiudad: " + this.ciudad
                +"\nDirección: " + this.calle_carrera + " " + this.numcasa
                +"\nTeléfono: " + this.telefono;
    }
}
