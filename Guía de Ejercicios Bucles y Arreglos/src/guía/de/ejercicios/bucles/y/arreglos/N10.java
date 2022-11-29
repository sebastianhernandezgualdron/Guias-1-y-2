/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Llenarunarreglodetamañon,estetamañodebeserimpar,yelcontenidodelarreglo deben 
 * ser los números pares partiendo de 2.
 * @author Sebastian
 */
public class N10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
         * DE capacidad del arreglo
         * DS Arreglo con PARES
         */
        int cantNum;
        int cont;
        cont = 2;
        
        
        
        Scanner read = new Scanner(System.in);
       
        do{
        System.out.println("inserte numero");
        cantNum = read.nextInt();
        
        
        
        }while(cantNum % 2 != 0);
        int array [] = new int [cantNum] ;
        for(int i=0; i<cantNum; i++){
                array[i] = cont;
                
                cont = cont + 2;
          
            }
        for(int i=0; i<cantNum; i++){
        System.out.println("  "+ array[i]);
        }
         
    }
    }
    

