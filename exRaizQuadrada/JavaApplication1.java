/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n  = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Diigite o valor de uma raiz: ");
        double raiz = scan.nextDouble();
        
        boolean flag;
        flag = true;
        while(raiz!=(n*n)){
           n++;
           if(raiz<(n*n)){
             flag = false;  
           break;
           }
        }
        if(flag){
        System.err.println("A raiz é "+n);
        }
        else{
            n = n - 1;
            
            while (n*n<raiz) {
                n = n + 0.10;
                System.err.print(""+n);
                if((n+0.1)*(n+0.1)>raiz){
                    break;
                }
            }
            
            while (n*n<raiz) {
                n = n + 0.010;
                System.err.println(n);
                if((n+0.01)*(n+0.01)>raiz){
                    break;
                }
            }
            
            while (n*n<raiz) {
                n = n + 0.001;
                System.err.println(n);
                if((n+0.001)*(n+0.001)>raiz){
                    break;
                }
            }
            
            
        }
    }
    
}
