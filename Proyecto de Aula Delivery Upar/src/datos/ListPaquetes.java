/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author German
 */
public class ListPaquetes implements IArchivoRegistroPaquete, Serializable {
    private List<Paquete> lista;

    public ListPaquetes() {
        this.lista = new ArrayList();
    }
    
    
    
    @Override
    public Paquete eliminar(String id) throws IOException {
        
        Iterator<Paquete> i = this.lista.iterator();
        while(i.hasNext()){
            Paquete c = i.next();
            if(c.getId().equals(id)){
                i.remove();
                return c;
            }
        }
        return null;
    }

    @Override
    public Paquete buscar(String id) throws IOException {
        
        for(Paquete t : this.lista){
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }

    @Override
    public List<Paquete> leer() throws IOException {
        return this.lista;
    }

    @Override
    public boolean escribir(Paquete P) throws IOException {
        
        return this.lista.add(P);
    }

        
}

