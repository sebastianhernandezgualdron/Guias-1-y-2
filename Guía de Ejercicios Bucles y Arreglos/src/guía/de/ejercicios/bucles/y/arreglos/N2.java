/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import javax.swing.JOptionPane;

/**
 *Realizarunprogramaquecalculelosprimeros10númerosdelasucesiónFibonacci.
 * @author Sebastian
 */
public class N2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma;
        int suma2;
        int array [] = new int [10] ;
        array[0] = 0;
        array[1] = 1;
        suma = 1;
        suma2 = 1;
        
        
        for(int i=2; i<10; i++){
          array[i] = suma + suma2;
          suma2 = suma;
          suma = array[i];
        }
        for(int i=0; i<10; i++){
            JOptionPane.showMessageDialog(null, array[i]);
        }
    }
    
}
