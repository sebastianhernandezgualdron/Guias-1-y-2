/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.de.ejercicios.bucles.y.arreglos;

import java.util.Scanner;

/**
 *Generarunamatrizcondimensionesdadasporelusuarioycolocar0enladiagonal
 * trasversa y la letra A en laS demás posiciones
 * @author Sebastian
 */
public class N18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*DE dimesiones matriz
         * DS matriz con 0 en la diagonal transversal y 1 en lo demas
         */
          int x;
          int y;
          int transversal;
          transversal = 0;
       
        
        
        
        Scanner read = new Scanner(System.in);
       
        
        System.out.println("inserte tamaño en x");
        x = read.nextInt();
        
        System.out.println("inserte tamaño en y");
        y = read.nextInt();
        
        transversal = x - 1 ;
        
       
        int matriz[][] = new int[x][y];
        for(int i=0; i<y; i++){
                for(int k=0; k<x; k++){
                    
                    if(k == transversal){
                        
                        matriz[i][k] = 0 ;
                        
                        transversal--;
                    }else{
                        matriz[i][k] = 1 ;
                    }
                }
            }
        for(int i=0; i<x; i++){
        for(int k=0; k<y; k++){
            System.out.println(+ matriz[i][k]);
        }
        }
    }
    
}
