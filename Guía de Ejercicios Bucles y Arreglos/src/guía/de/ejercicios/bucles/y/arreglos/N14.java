/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import javax.swing.JOptionPane;

/**
 * * La suma de 6 números impares consecutivos vale 120. Encontrar dichos números.

 * @author Sebastian
 */
public class N14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /* DE numero 1
         * DS numeros consecutivos impares cuyo resultad de suma es 120
         */
         int numero;
         int resultado;
         resultado = 0;   
         numero = 1;
            
            do{
            numero = numero + 2;
            resultado = numero + (numero+2) + (numero+4) + (numero+6)
                    + (numero+8) + (numero+10);
            
            
            }while(resultado != 120);
            
            JOptionPane.showMessageDialog(null,  "120 =" + numero + "+" + 
             (numero+2) +"+" +(numero+4) +"+" + (numero+6) +"+" + (numero+8) +"+"
             + (numero+10));
    }
    
}
