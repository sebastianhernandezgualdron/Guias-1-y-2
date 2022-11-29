/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Generarunamatrizcuadradayladiagonalprincipalllenarlaconceros,
 * lasdemásposiciones con 1
 * @author Sebastian
 */
public class N17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*DE dimesiones matriz
         * DS matriz con 0 en diagonal principal y el resto con 1
         */
        
 
       
        int matriz[][] = new int[3][3];
        for(int i=0; i<3; i++){
                for(int k=0; k<3; k++){
                    
                    if(i == k){
                        
                        matriz[i][k] = 0;
                    }else{
                        
                        matriz[i][k] = 1;
                    }
                }
            }
        for(int i=0; i<3; i++){
        for(int k=0; k<3; k++){
            System.out.println(+ matriz[i][k]);
        }
        }
    }
    
}
