/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Generar un vector de tamaño n y se rellene de 0
 * @author Sebastian
 */
public class N15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*DE capacidad del vector
         * DS Vector con 0 
         */
        int cantNum;
       
        
        
        
        Scanner read = new Scanner(System.in);
       
        
        System.out.println("inserte tamaño vector");
        cantNum = read.nextInt();
        
        
        
        
        int array [] = new int [cantNum] ;
        for(int i=0; i<cantNum; i++){
                array[i] = 0;
                
              
          
            }
        for(int i=0; i<cantNum; i++){
        System.out.println("  "+ array[i]);
        }
         
    }
    
}
