/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_modificadores_accesos;

import Othepackage.OtherClass;

/**
 *
 * @author rente
 */
public class Eva1_3_modificadores_accesos {
    public int x;
    protected int y;
    private int z;
    int w;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestA objA=new TestA();
        //objA--> puedo ver x (public)
        //se puede ver y (protected)
        //se puede ver w (default)
        
        OtherClass objB=new OtherClass();
        //objB.x--> se ve x por que es public
        //los demas no son visibles
        //TestB objc=new TestB();--> esta clase no es visible en este paquete
    }
    
}

class TestA{
    public int x;
    protected int y;
    private int z;
    int w;
}
