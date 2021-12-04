package Entidades;

import java.io.Serializable;


public class Paquete implements Serializable {
    
  private long num;
  private String tipoPaq;
  private double largo;
  private double ancho;
  private double alto;
  private String descri;
  private double peso;
  private long precio;
  private String id;

    public Paquete(long num, String tipoPaq, double largo, double ancho, double alto, String descri, double peso, long precio, String id) {
        this.num = num;
        this.tipoPaq = tipoPaq;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.descri = descri;
        this.peso = peso;
        this.precio = precio;
        this.id = id;
    }

    

    public Paquete() {
    }
 

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getTipoPaq() {
        return tipoPaq;
    }

    public void setTipoPaq(String tipoPaq) {
        this.tipoPaq = tipoPaq;
    }

   
    
    public String DatosPaquete(){
        return this.num+";"+
               this.tipoPaq+";"+ 
               this.largo+";"+ 
               this.ancho+";"+
               this.alto+";"+
               this.descri+";"+
               this.peso+";"+ 
               this.precio+";"+
               this.id+";";
    }
}
