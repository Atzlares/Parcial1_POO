/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2insta;

/**
 *
 * @author invitado
 */
public class EVA1_2INSTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int VALOR = 100;
        //INSTANCIACION: Crear el objeto--> darle memoria
        //CLASE IDENTIFICADOR = new Constructor();
        //constructor --> Metodo con el mismo nombre que la clase.
        Persona perso1=new Persona();//instanciacion
        System.out.println(perso1);
        //perso1 --> referencia --> direccion de memoria
        Vehiculo nave=new Vehiculo();
        //IMPRIMIR ATRIBUTOS
        
        //IMPRIMIR LA CLASE DEL VEHICULO
        System.out.println(nave);
        //DARLES ATRIBUTO A CADA OBJETO
        nave.marca="Honda";
        nave.modelo="Civic";
        nave.año=2001;
        System.out.println("Marca: "+nave.marca);
        System.out.println("Modelo: "+nave.modelo);
        System.out.println("Año: "+nave.año);
        
    }
    
}

//tipo de dato abstracto
class Persona{
    
}

class Vehiculo{
    //atributos
     String marca;
     int año;
     String modelo;
     
}
