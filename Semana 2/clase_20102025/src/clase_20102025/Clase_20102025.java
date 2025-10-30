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

                System.out.println("Sumando 3 numeros");

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
//                int resultado = numero1+numero2+numero3;
                // contadoras, acumuladoras, banderas
                int numeroContador = 1;
                int resultadoAcumulador = 0;

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
                } // fin del while 
                System.out.println("El resu;tado es: " + resultadoAcumulador);

            } else if (opcion == 2) {
                System.out.println("Mayor de 8 numeros");
                int contadorNumeros = 0;
                int numeroMayor = 0;

                while (contadorNumeros < 8) {
                    System.out.println("Ingrese un numero");
                    int numeroComparar = entrada.nextInt();
                    if (numeroComparar >= numeroMayor) {
                        numeroMayor = numeroComparar;
                    } // fin del if
                    contadorNumeros++;
                } // fin del while 
                System.out.println("El numero mayor es: " + numeroMayor);
            } else if (opcion == 3) {
                System.out.println("Ver el menor de 1500 numeros");
                int contadorNumeros = 0;
                int numeroMenor=0;
                /*
                1 ) Iniciar numeroMenor con un valor muy grande 
                2) agregar una validacion 
                */
                while (contadorNumeros < 3) {
                    System.out.println("Ingrese un numero");
                    int numeroComparar = entrada.nextInt();
     
                    if (numeroComparar <= numeroMenor) {
                        numeroMenor = numeroComparar;
                    } // fin del if
                    contadorNumeros++;
                } // fin del while 
                System.out.println("El numero menor es: " + numeroMenor);
            } else if (opcion == 4) {
                    System.out.println("Exponentes");
                    System.out.println("Ingrese el valor base");
                    int base = entrada.nextInt();
                    
                    //Validar 
                    while (base<0) {
                        System.out.println("El valor es incorrecto, ingrese un valor positivo");
                         System.out.println("Ingrese el valor base");
                          base = entrada.nextInt();
                    }// fin del while
                    
                    System.out.println("El valor es incorrecto ");
                    System.out.println("Ingrese el exponente");
                    int exp = entrada.nextInt();
     
            } else {

            }// fin del if menu 

        } while (opcion != 5);

    }// fin del main 

}// fin de la clase 
