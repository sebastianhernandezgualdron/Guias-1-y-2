/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Escribeunprogramaquecalculelafactorialdeunnúmerointroducidoporteclado.
 * Paratodonúmeronaturaln,sellamanfactorialofactorialdenalproductodetodos los 
 * enteros entre 1 y n
 * @author Sebastian
 */
public class N5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int multi;
        
       multi = 1;
        Scanner read = new Scanner(System.in);
       
        System.out.println("inserte numero");
        num = read.nextInt();
       
      for(int i=1; i<num; i++){
          multi= multi * i;
      }
         System.out.println("El producto es  "+ multi);
    }
    
}
