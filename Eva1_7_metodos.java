/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_metodos;

import java.util.Scanner;

/**
 *
 * @author rente
 */
public class Eva1_7_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per=new Persona();
        per.setNombre("Jorge");
        per.setApellido("Lares");
        per.setEdad(23);
        
        System.out.println("El nombre es: "+per.generarNombreCon());
        System.out.println("Nacio en el año: "+per.generarEdad());
        
        Persona[]grupo=new Persona[5];
        //hay que crear cada objeto
        for (int i = 0; i < grupo.length; i++) {
            grupo[i]=new Persona();
            Scanner leer= new Scanner(System.in);
            //una vez creado hay que llenarlo:
            System.out.println("Introduce nombre: ");
            String nombre=leer.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce apellido:" );
            String ape=leer.nextLine();
            grupo[i].setApellido(ape);
            
            System.out.println("Introduce la edad: ");
            int ed=leer.nextInt();
            grupo[i].setEdad(ed);
            
        }
        
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("El nombre es: "+grupo[i].generarNombreCon());
            System.out.println("Nacio en el año: "+grupo[i].generarEdad());
        
        }
    }
    
}
