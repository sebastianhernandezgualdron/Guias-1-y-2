/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Ejercicio5:LaconjeturadeUlamafirmaquedadounenteroysiguiendolospasossiguientes
 * siempre obtenemos un 1.• Si el número es par se divide por 2.• Si es impar se 
 * multiplica por 3 y se suma 1.Escribeunprogramaquelepidaalusuariounnúmeroentero
 * yquecompruebesilaconjeturadeUlamescierta,elprogramadeberáescribirtodalasecuen
 * ciahastallegaraluno.Porejemplo,sielusuariointroduceun5lasecuenciasería:5,16,8
 * ,4, 2, 1.
 * @author Sebastian
 */
public class N4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
    
     
       
        Scanner read = new Scanner(System.in);
        
        System.out.println("inserte numero1");
        num = read.nextInt();
       do{
       
      if(num % 2 == 0){
         
          num= num / 2;
      }else{
          
          num = num * 3 + 1;
          
      }
    
        System.out.println(num);
      
        }while (num !=1);
      
        
    }
    
}
