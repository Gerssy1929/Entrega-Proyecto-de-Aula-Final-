/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.*;
import java.io.IOException;
import java.util.List;


/**
 *
 * @author German
 */
public interface IArchivoRegistroPaquete {
    public Paquete eliminar(String id) throws IOException;
    public Paquete buscar(String id) throws IOException;
    public List<Paquete> leer() throws IOException;
    public boolean escribir(Paquete P) throws IOException;
}
