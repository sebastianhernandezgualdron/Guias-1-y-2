/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Generar una matriz cuadrada y pedir las dimensiones al usuario
 * @author Sebastian
 */
public class N16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*DE dimesiones matriz
         * DS matriz
         */
          int x;
          int y;
       
        
        
        
        Scanner read = new Scanner(System.in);
       
        
        System.out.println("inserte tamaño en x");
        x = read.nextInt();
        
        System.out.println("inserte tamaño en y");
        y = read.nextInt();
        
        
       
        int matriz[][] = new int[x][y];
        for(int i=0; i<x; i++){
                for(int k=0; k<y; k++){
                    
                    matriz[i][k] = 2;
                }
            }
        for(int i=0; i<x; i++){
        for(int k=0; k<y; k++){
            System.out.println(+ matriz[i][k]);
        }
        }
    }
    
}
