/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_triangulo;

/**
 *
 * @author rente
 */
public class Triangulo {
    private double altura;
    private double base;
    
    public Triangulo(){
        base=-1;
        altura=-1;
    }
    
    //base
    public double getBase(){
        return base;
    }
    
    public void setBase(double valor){
        base=valor;
    }
    
    //altura
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double valor){
        altura=valor;
    }
    
    private double calcularArea(){
        return (base*altura)/2;
    }
    
    private double calcularPerimetro(){
        double peri;
        //suma de los tres lados, falta el lado mayor (hipotenusa)
        
        peri=base+altura+(Math.sqrt((Math.pow((base*altura), (altura*altura)))));
        
        return peri;
    }
    
    public void imprimirDatos(){
        System.out.println("Base: "+getBase());
        System.out.println("Altura "+getAltura());
        System.out.println("El area del triangulo es: "+calcularArea());
        System.out.println("El perimetro del triangulo es: "+calcularPerimetro());
    }
}
