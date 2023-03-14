/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Triangulo {
    float base;
    float altura;

    public Triangulo() {}

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    float calculaArea(){
        return (base*altura)/2;
    }
    
    String imprimeDados(){
        return "Base: "+base+"\nAltura: "+altura+"\nArea: "+calculaArea();
        }
    
    
    
    

}
