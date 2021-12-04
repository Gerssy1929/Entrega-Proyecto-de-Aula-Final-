/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidades.*;
import datos.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author German
 */
public class CentralCarga {
    
    private IArchivoRegistroPaquete data;

    public CentralCarga() { 
        this.data = new ArchivoPaquetesBin();
        //this.data = new ArchivoPaquetesTexto();
        
    }

    
    
    public IArchivoRegistroPaquete getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(IArchivoRegistroPaquete data) {
        this.data = data;
    }

  
    public Paquete eliminar(String id) throws IOException{
        return this.data.eliminar(id);
    }
    
    public Paquete buscar(String id) throws IOException{
        return this.data.buscar(id);
    }
    public List<Paquete> leer() throws IOException{
        return this.data.leer();
    }
    
    public boolean escribir(Paquete p) throws IOException{
       
        return this.data.escribir(p);
    }
}

