/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**Dadodosnúmerosenteros,dondeestosnúmerosformaranunintervalo,esdecirelprimer
 * númerodebesermenorqueelsegundo(sedebeejecutarhastaqueseaválido el intervalo),
 * y se deben sumar los números del intervalo.
 *
 * @author Sebastian
 */
public class N3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int suma;
        suma = 0;
       
        Scanner read = new Scanner(System.in);
       do{
        System.out.println("inserte numero1");
        num1 = read.nextInt();
        
       
        System.out.println("inserte numero2");
        num2 = read.nextInt();
        
      
        }while (num1 > num2);
       num1 = num1 + 1;
       
      for(int i=num1; i<num2; i++){
          suma = suma + i;
      }
         System.out.println("La suma es  "+ suma);
    }
    
}
