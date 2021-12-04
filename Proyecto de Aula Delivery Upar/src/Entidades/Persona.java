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
public abstract class Persona {
    private String nombre;
    private String apellido;
    private long id;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    

    public Persona(String nombre, String apellido, long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id=id;
    }
    
    public abstract String getDatosPersona();
    
    public String getDatosUsuarios(){
        return "\nNombre: " + this.nombre + "\nApellido: " + this.apellido + "\nID:" + this.id + "\n" + this.getDatosPersona();
    }
}