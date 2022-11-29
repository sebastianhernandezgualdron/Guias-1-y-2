/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

/**
 *Llenarunarregloconlosprimeros100númerosparesymuestrelasumadeloselementos
 * del arreglo.
 * @author Sebastian
 */
public class N12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          /**
         * DE capacidad del arreglo
         * DS Suma primeros 100 numeros pares
         */
        
        
        int suma;
        int suma2;
        suma2 = 0;
      
        suma= 2;
        
        
        
        int array [] = new int [100] ;
        
  
    
        
        for(int i=0; i<100; i++){
                array[i] = suma;
                suma = suma + 2;
                suma2 = suma2 + array[i];
          
 
        }
         
        System.out.println("La suma es  "+suma2);
    
    }
    
}
