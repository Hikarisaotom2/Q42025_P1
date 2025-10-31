/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_clase_29102025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Ejercicios_clase_29102025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        NOTA: los tamanos de la figura, se deben preguntar al usuario 
            1) dibujar cuadrado 
                -> lado: 3
                 *  *  *
                 *  *  *
                 *  *  *
        
                -> lado 7
                *  *  *  *  *  *  *
                *  *  *  *  *  *  *
                *  *  *  *  *  *  *
                *  *  *  *  *  *  *
                *  *  *  *  *  *  *
                *  *  *  *  *  *  *
                *  *  *  *  *  *  *
        
                -> 2 
                *  *
                *  *
                
            2) dibujar un triangulo 
                -> altura: 3
                 *
                 * *
                 * * *
        
                -> altura: 3
                    *
                  * *
                * * *
        
                -> altura: 3 
                 *
                * *
               * * * 
        
            3) rectangulo
                 -> 3, 2
                 *  *  *
                 *  *  *
         */

        Scanner entrada = new Scanner(System.in);
        //Pendiente: agregar validaciones
        System.out.println("Ingrese el tamano");
        int lado = entrada.nextInt();

        // dibujar una linea 
        for (int i = 0; i < lado; i++) {
            /*
               for (int j = 0; j < lado-1; j++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
            */
            for (int j = 0; j < lado; j++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }
    }

}
