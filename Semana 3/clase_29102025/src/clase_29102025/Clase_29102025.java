/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_29102025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_29102025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        For : ciclo, controlados por contador
        Switch: simplificado del else if....,
         */

        // controlados por logica : while, do while
        // controlados por contador : for 
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            //i+=500
        }// fin del for 
        /*
                int i=0;
        while (i<10) {
            System.out.println("i");
            i++;
        }
         */

        int numero = 1;
        System.out.println("BREAK");
        while (numero <= 5) {
            System.out.println(numero);
            numero++;
            if (numero == 3) {
                break;
            }
        }
        /*
         numero
          1 
          5
        
        consola: 
        Ingrese un numero
        El numero es menor a 5! saltando iteracion
        Ingrese un numero: 
        Validando.....
         */

 /*
        
        numero 
        1
        
        consola: 
        Ingrese un numero:
        El numero es menor a 5! saltando iteracion
        
         */
        System.out.println("CONTINUE");
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();
            if (numero < 5) {
                System.out.println("El numero es menor a 5! saltando iteracion");
                continue;
            }

            System.out.println("Validando.....");
            break;
        } while (true);

    }

}
