/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_vehiculo;

/**
 *
 * @author rente
 */
public class Vehiculo {
    /*
    Marca
    Modelo
    Año
    Color
    Valor
    */
    
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private double precio;
    
      public String getMarca(){
        return marca;
    }
    
    //Escribir nombre:
    public void setMarca(String valor){
        marca= valor;
    }
    
    
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo=valor;
    }
    
    public int getAnnio(){
        return annio;
    }
    public void setAnnio(int valor){
        annio=valor;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String valor){
        color=valor;
    }
    
    public Double getValor(){
        return precio;
    }
    public void setValor(Double valor){
        precio=valor;
    }

    
}
