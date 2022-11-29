/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import javax.swing.JOptionPane;

/**
 **6.Realice algoritmo que genere la siguiente sucesión hasta los 10 primeros
 * números:5, 15, 45, 135, 405, 1215.............................
 * @author Sebastian Hernandez Gualdron
 */
public class N6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        // DE numero 5
        // DS suceción de los diez primeros numeros
        int numero;
        int array [] = new int [10] ;
        numero = 5;
        
        for(int i=0; i<10; i++){
            array[i] = numero;
            numero = numero * 3;
         JOptionPane.showMessageDialog(null, array[i]);

        }
    }
    
}
