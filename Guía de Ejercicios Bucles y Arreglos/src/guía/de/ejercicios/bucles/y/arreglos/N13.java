/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 * Llenarunarreglodetamañonqueselleneconnúmerosingresadosporelusuarioy
 * determine cantidad de positivos y negativos.
 * @author Sebastian
 */
public class N13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * DE capacidad del arreglo
         * DS Cant positivos y negativos
         */
         int cantNum;
         int num;
        int contPosi;
        int contNega;
        contPosi= 0;
        contNega = 0;
        
        
        
        Scanner read = new Scanner(System.in);
       
        
        System.out.println("inserte cant de numeros");
        cantNum = read.nextInt();
        
       
        int array [] = new int [cantNum] ;
        for(int i=0; i<cantNum; i++){
            System.out.println("inserte numero");
        num = read.nextInt();
        
                array[i] = num ;
                
                if(num > 0){
                    
                    contPosi++;
                }else{
                    contNega++;
                }
          
            }
       
        System.out.println(" cant positivos "+ contPosi);
       System.out.println(" cant negativos "+ contNega);
         
    }
    
}
