/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.Paquete;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author German
 */
public class ArchivoPaquetesTexto implements IArchivoRegistroPaquete {
    private File archivo;
    private FileWriter aEscritura;
    private Scanner aLectura;

    public ArchivoPaquetesTexto() {
        this.archivo = new File("Paqueteria.dat");
    }
    
    public ArchivoPaquetesTexto(String name){
        this.archivo = new File(name);
    }

    /**
     * @return the archivo
     */
    public File getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the aEscritura
     */
    public FileWriter getaEscritura() {
        return aEscritura;
    }

    /**
     * @param aEscritura the aEscritura to set
     */
    public void setaEscritura(FileWriter aEscritura) {
        this.aEscritura = aEscritura;
    }

    /**
     * @return the aLectura
     */
    public Scanner getaLectura() {
        return aLectura;
    }

    /**
     * @param aLectura the aLectura to set
     */
    public void setaLectura(Scanner aLectura) {
        this.aLectura = aLectura;
    }
    
    public Paquete leerCompetidor(String linea[]){
        Paquete c = new Paquete();
        c.setNum(Long.valueOf(linea[0]));
        c.setPeso(Double.valueOf(linea[1]));
        c.setPrecio(Long.valueOf(linea[2]));
        c.setLargo(Double.valueOf(linea[3]));
        c.setAncho(Double.valueOf(linea[4]));
        c.setAlto(Double.valueOf(linea[5]));
        c.setDescri(linea[6]);
        c.setId(linea[7]);
        
        return c;
    }
    
    @Override
    public Paquete eliminar(String id) throws IOException {
        
        List<Paquete> listadoInicial =  this.leer();
        ArchivoPaquetesTexto archivoAux = new ArchivoPaquetesTexto("PaqueteriaTmp.dat");
        Paquete eliminado = null;
        for(Paquete f: listadoInicial){
            if(f.getId().equals(id)){ // elemento a eliminar
                eliminado = f;
            }
            else{
                archivoAux.escribir(f);
            }
        }
        
        if(this.archivo.delete()){
            if(archivoAux.getArchivo().exists()){
                if(!archivoAux.getArchivo().renameTo(this.archivo)){
                    throw new IOException("El archivo temporal no pudo ser renombrado");
                }

            }
            else
               this.archivo.createNewFile();
        }
        else{
            throw new IOException("El archivo original no pudo ser elimiando");
        }
            
        
        
        return eliminado;
    }
    
    @Override
    public Paquete buscar(String id) throws IOException{
        Paquete buscado = null;
        try {
            this.aLectura = new Scanner(this.archivo);
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Paquete p = this.leerCompetidor(linea);
                if(p.getId().equals(id)){
                    buscado = p;
                    break;
                }
            }
            return buscado;
            
        } catch (FileNotFoundException ex) {
                throw new IOException("EL archivo no se encuentra o no pueder ser leido");
        }
        finally{
            if(this.aLectura!=null)
                this.aLectura.close();
        }
    }
    
    @Override
    public List<Paquete> leer() throws IOException{
       List<Paquete> lista = null;
        try {
            
            this.aLectura = new Scanner(this.archivo);
            lista = new ArrayList();
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Paquete p = this.leerCompetidor(linea);
                lista.add(p);
            }
            
            return lista;
            
        } catch (FileNotFoundException ex) {
                throw new IOException("EL archivo no se encuentra o no pueder ser leido");
        }
        finally{
            if(this.aLectura!=null)
                this.aLectura.close();
        }
        
    }
    
    @Override
    public boolean escribir(Paquete p) throws IOException{
        PrintWriter escritor = null;
        try{
            this.aEscritura = new FileWriter(this.archivo,true); // edicio
            escritor = new PrintWriter(this.aEscritura);
            escritor.println(p.DatosPaquete());
            return true;
        }catch(IOException ioe){
            throw new IOException("Error al abrir el archivo para escritura...");
           
        }
        finally{
            if(escritor!=null)
                escritor.close();
            
            if(this.aEscritura!=null){
                 this.aEscritura.close();
            }    
        }
    }
}
