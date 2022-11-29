/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import javax.swing.JOptionPane;

/**
 ** Una progresión geométrica comienzaen 1 y tiene razón 2.Encontrar los 
 * trestérminos consecutivos(de la sucesión) cuyo producto es 512.
 * @author Sebastian Hernandez Gualdron
 
 */
public class N8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * DE numero 1
         * DS numeros consecutivos cuyo producto es 512
         */
         int numero;
         int resultado;
         resultado = 0;   
         numero = 1;
            
            do{
            numero = numero * 2;
            resultado = (numero/2) * (numero) * (numero*2);
            
            
            }while(resultado != 512);
            
            JOptionPane.showMessageDialog(null, numero/2+ "*" + numero+ "*" + 
             numero*2 +"= 512");
    }
    }
    

