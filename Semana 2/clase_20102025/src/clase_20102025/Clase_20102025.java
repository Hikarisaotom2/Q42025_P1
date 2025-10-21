/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_20102025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_20102025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 8;

        /*
        Repetimos el contenido del ciclo siempre y cuando la condicion se cumpla.
        Si no se cumple, salimos del ciclo. 
        NOTA: El hecho de que yo tenga un ciclo, no significa que vamos a repetir*/
        while (numero <= 7) {
            System.out.println("Impresion dentro del while");
        }//fin del ciclo 

        /*
        el do while ejecuta la evalujcion al final del ciclo 
        y por ello es el unico ciclo que NOS GARANTIZA COMO MINIMO UNA EJECUCION
         */
        do {
            System.out.println("Impresion dentro del do while");
        } while (numero <= 7);

        /*
        cree un programa con un menu interactivo que tengas las siguientes opciones 
            1) sumar 3 numeros 
            2) ver el mayor de 8 numeros 
            3) ver el menor de 1500 numeros 
            4) calcular el exponente 
            5) salir 
        

         */
        int opcion = 0;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Bienvenido al programa");
            System.out.println("1) sumar 3 numeros");
            System.out.println("2) ver el mayor de 8 numeros");
            System.out.println("3) Ver el menor de 1500 numeros");
            System.out.println("4) exponentes");
            System.out.println("5) Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            // >= , <=, ==, != (distinto/ diferente)
            if (opcion == 1) {
                // el codigo funciona solamente para 3 numeros 
                // repite demasiado codigo -> normalmente cuando vemos que hay mucho que se repite, puede ser un indicativo de que podemos mejorarlo

//                System.out.println("Sumando 3 numeros");
//                
//                System.out.println("Ingrese el primer numero");
//                int numero1= entrada.nextInt();
//                
//                System.out.println("Ingrese el segundo numero: ");
//                int numero2 = entrada.nextInt();
//                
//                System.out.println("Ingrese el tercer numero");
//                int numero3 = entrada.nextInt();
//                System.out.println("Ingrese el tercer numero");
//                int numero3 = entrada.nextInt();
//                
//                int resultado = numero1+numero2+numero3;
                int numeroContador = 1;
                int resultadoAcumulador = 0;
                // contadoras, acumuladoras, banderas
                while (numeroContador <= 3) {
                    System.out.println("Ingrese un numero");
                    int numeroLeer = entrada.nextInt();
                    // aumentamos el contador en 1
//                    numeroContador = numeroContador+1;
//                    numeroContador += 1;
                    numeroContador++;
                    // Acumulamos los valores que hemos ido leyendo
//                  resultadoAcumulador+=numeroLeer;
                    resultadoAcumulador = resultadoAcumulador + numeroLeer;
                }

            } else if (opcion == 1) {
            } else if (opcion == 3) {
            } else if (opcion == 4) {

            } else {

            }

        } while (opcion != 5);

        if (numero < 7) {
        } else {

        }

        if (numero < 7) {

        }
        else if (numero > 7) {

        }

    }

}
