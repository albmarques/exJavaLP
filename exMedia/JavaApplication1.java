/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author dti
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] altura = new double[50];
        Random RandomN = new Random();
        for (int i = 0; i < altura.length-1; i++) {
            altura[i]=RandomN.nextDouble()+1;
        }
        
        
        double maior = 0;
        double media =0;
        double soma =0;
        int contador = 0;
        for (int i = 0; i <= altura.length-1; i++) {// Maior altura
            if (altura[i]>maior) {
                maior =  altura[i];
            }
            soma +=altura[i];//soma dos valores
        }
        
        media = soma/altura.length;//média da altura
        
        for (int i = 0; i <= altura.length-1; i++) {// 
            if (altura[i]>media) {
                contador+=1;
            }
        }        
        System.err.println("Maior altura: "+maior+"\nMédia: "+(media)+"\n Acima da Média: "+contador);
    }
    
}
