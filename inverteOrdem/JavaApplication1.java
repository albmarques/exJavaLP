/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nomes ={"Ana","Marcos","João"};
        String [] inverteNomes = new String[nomes.length];
        int c = 0;
        
        for (int i = nomes.length-1; i >= 0; i--) {
            inverteNomes[c] = nomes[i];
            c++;
        }
        
        for (String inverteNome : inverteNomes) {
            System.out.println(inverteNome);
        }
    }
    
}
