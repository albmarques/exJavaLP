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
        int[] num = {90,62,78,65,23,12,15};
        boolean flag = false;
        while(!flag){
        flag = true;     
        for (int i = 0; i < num.length; i++) {
            if(num.length-1 == i)break;
            if (num[i]<num[i+1]) {
                
                num[i]=num[i]+num[i+1];/*inverte os valor da casa com o proxímo digito*/
                num[i+1]=num[i]-num[i+1];
                num[i]=num[i]-num[i+1];
                
                flag = false;/*teve alteração na ordem*/
            }
        }
            if (flag) {/*se não teve alteração na ordem, o array continua o mesmo, encerra*/
                break;
            }
           
    }    /*tentar mais uma vez
        */
        
        
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    
}
