/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_metodos;

/**
 *
 * @author rente
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    //nombre 
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre= valor;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String valor){
        apellido=valor;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int valor){
        edad=valor;
    }
    
    public int generarEdad(){
        return 2024-getEdad();
    }
    
    public String generarNombreCon(){
        return nombre+" "+apellido;
    }
    
}
