/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *Llenarunarreglodetamañon,yestoselementossean1y0alternadoeimprimirpor consola.
 * @author Sebastian
 */
public class N9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * DE capacidad del arreglo
         * DS Arreglo con 1 y 0
         */
        int cantNum;
        int cont;
        cont = 0;
        
        
        
        Scanner read = new Scanner(System.in);
       
        System.out.println("inserte numero");
        cantNum = read.nextInt();
        int array [] = new int [cantNum] ;
        
      
        
        for(int i=0; i<cantNum; i++){
            if(cont == 0){
                array[i] = 1;
                
                cont = 1;
            }else{
                array[i] = 0;
                
                cont = 0;
            }
        }
         for(int i=0; i<cantNum; i++){
        System.out.println("  "+ array[i]);
    }
    }
}
