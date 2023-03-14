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
	Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número total de notas:  ");
        int n = scan.nextInt();
        double[] listaNotas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite " + (i + 1) + "° a nota: ");
            listaNotas[i] = scan.nextInt();
        }

        double media = 0;
        int c = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            media += listaNotas[i];
        }
        media = media / listaNotas.length;

        for (int i = 0; i < listaNotas.length; i++) {
            if (media < listaNotas[i]) {
                c++;
            }
        }

        double[] acimaMedia = new double[c];
        c = 0;

        for (int i = 0; i < listaNotas.length; i++) {
            if (media < listaNotas[i]) {
                acimaMedia[c] = listaNotas[i];
                c++;
            }
        }
        System.out.println("Média " + media);
        for (double d : acimaMedia) {
            System.out.println("Nota " + d);
        }
    }
    
}
