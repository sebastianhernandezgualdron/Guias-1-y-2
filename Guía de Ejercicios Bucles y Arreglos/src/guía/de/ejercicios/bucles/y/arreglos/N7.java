/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import javax.swing.JOptionPane;

/**
 **Generar la siguiente sucesión:1, 4, 9, 16, 25, 36, 49, ...
 * @author Sebastian Hernandez Gualdron
 
 */
public class N7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
         * DE numero 1
         * DS sucecióon de numeros
         */
         int numero;
         int impar;
        int array [] = new int [10] ;
        numero = 0;
        impar = 1;
        
        for(int i=0; i<10; i++){
            numero = numero + impar ;
            array[i]  = numero;
            impar += 2;
            
         JOptionPane.showMessageDialog(null, array[i]);

        }
      
    }
    
}
