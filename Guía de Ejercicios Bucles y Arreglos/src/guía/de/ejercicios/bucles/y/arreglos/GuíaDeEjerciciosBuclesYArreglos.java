/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Realizar un programa que lea un número y determine si es un número primo.
 * @author Sebastian
 */
public class GuíaDeEjerciciosBuclesYArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont;
         float num;
      cont = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = read.nextInt();
        
        for(int i=1; i<num; i++){
        
            if(num % i == 0){
                cont++;
        }
            
        }
        
       if(cont==1){
           System.out.println("El numero es primo" );
       }else{
           System.out.println("El numero no es primo" );
       }
        
        
    }
    
}
