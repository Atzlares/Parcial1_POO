/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete1;

import Paquete2.B;
import Paquete2.C;

/**
 *
 * @author rente
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One obj1=new One();
        System.out.println(obj1);
        
        //clase b del paquete 2
        B objb=new B();
        //Two obj2=new Two();--> no es accesible por que su clase esta por default
        
        
        //clase c del paquete 2
        C objc=new C();
        //Thre obj3=new Three();-->no es accesible por que su clase esta por default
        
        //imprimir objetos de la clases publicas
        System.out.println(objb);
        System.out.println(objc);
    }
    
}

class One{ //default class
    
}
