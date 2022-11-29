/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Generarunvectordetamañon,selleneconvaloresdadosporelusuario.Imprimirpor 
 * pantalla la cantidad de valores impares
 * @author Sebastian
 */
public class N20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          /*DE capacidad del vector
         * DS Vector con 0 
         */
        int cantNum;
       int num;
       
        
        
        
        Scanner read = new Scanner(System.in);
       
        
        System.out.println("inserte tamaño vector");
        cantNum = read.nextInt();
        
        
        
        
        int array [] = new int [cantNum] ;
        for(int i=0; i<cantNum; i++){
                
                System.out.println("inserte numero");
                num = read.nextInt();
                array[i] = num;
          
            }
        for(int i=0; i<cantNum; i++){
            if(array[i] % 2 != 0){
        System.out.println("  "+ array[i]);
        
            }
        }
         
    }
    
}
