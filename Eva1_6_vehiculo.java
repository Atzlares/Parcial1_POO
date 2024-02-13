/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

/**
 *
 * @author rente
 */
public class Eva1_6_vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo micarro=new Vehiculo();
         micarro.setMarca("Honda");
         micarro.setModelo("Civic");
         micarro.setAnnio(2001);
         micarro.setColor("Verde");
         micarro.setValor(50.000);
         
         System.out.println("Marca: "+micarro.getMarca());
         System.out.println("Modelo: "+micarro.getModelo());
         System.out.println("Año: "+micarro.getAnnio());
         System.out.println("Color: "+micarro.getColor());
         System.out.println("Precio: "+micarro.getValor());
        
        
    }
    
}
