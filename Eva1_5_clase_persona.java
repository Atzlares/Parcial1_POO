/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_clase_persona;

/**
 *
 * @author rente
 */
public class Eva1_5_clase_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona pers=new Persona();
        pers.setNombre("Jorge Axel");
        System.out.println(pers.getNombre());
        pers.setApellidos("Lares Estrada");
        System.out.println(pers.getApellidos());
        pers.setEdad(23);
        System.out.println(pers.getEdad());
        
        
    }
    
}

class Persona{
    //Atributos --> estado del objeto
    //no deben ser accesibles directamente
    private String nombre;
    private String Apellidos;
    private int edad;
    
    //Metodos
    //publicos --> son la interfaz
    //si son para manipular los atributos hay un estandar en java
    //Metodos set(escritura) y get(lectura)
    
    //Leer nombre:
    public String getNombre(){
        return nombre;
    }
    
    //Escribir nombre:
    public void setNombre(String valor){
        nombre= valor;
    }
    
    //Leer apellido
    
    public String getApellidos(){
        return Apellidos;
    }
    
    //Escribir apellido
    public void setApellidos(String valor){
        Apellidos= valor;
    }
    
    //Leer edad:
    public int getEdad(){
        return edad;
    }
    
    //Escribir edad:
    public void setEdad(int valor){
        edad= valor;
    }
}
