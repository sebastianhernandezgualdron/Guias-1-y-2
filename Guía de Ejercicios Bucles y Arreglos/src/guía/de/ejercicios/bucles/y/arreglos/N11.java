/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Llenar un arreglo con los primeros 100 números de la sucesión Fibonacci
 * .0,1,1,2,3,5,8,13................
 * @author Sebastian
 */
public class N11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
         * DE capacidad del arreglo
         * DS Arreglo con 100 numeros sucesion fibonacci
         */
        
        int suma;
        int suma2;
        
        suma= 0;
        suma2= 1;
        
        
        
        int array [] = new int [100] ;
        
      array[0] = 0;
      array[1] = 1;
        
        for(int i=2; i<100; i++){
                array[i] = suma + suma2;
          suma2 = suma;
          suma = array[i];
 
        }
         for(int i=0; i<100; i++){
        System.out.println("  "+ array[i]);
    }
    }
    
}
