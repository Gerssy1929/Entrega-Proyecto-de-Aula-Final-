/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author German
 */
public class Repartidor extends Persona {
private long [] zonas_entrega;
private String categoria;
private String username;
private String password;

    public Repartidor(String nombre, String apellido, long id, String categoria, String username, String password, long [] zonas_entrega) {
        super(nombre, apellido, id);
        this.zonas_entrega=zonas_entrega;
        this.categoria = categoria;
        this.username = username;
        this.password = password;
    }


    public long[] getZonas_entrega() {
        return zonas_entrega;
    }

    public void setZonas_entrega(long [] zonas_entrega) {
        this.zonas_entrega = zonas_entrega;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getDatosPersona() {
        return "\nZonas de Entrega: " + Arrays.toString(this.zonas_entrega)
               +"\nCategoría:" + this.categoria;
    }
    
}
