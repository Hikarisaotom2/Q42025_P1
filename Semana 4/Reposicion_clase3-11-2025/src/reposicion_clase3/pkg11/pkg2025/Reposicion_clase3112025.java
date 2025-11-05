/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reposicion_clase3.pkg11.pkg2025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Reposicion_clase3112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1) leer un string desde la consola
        2) leer un char desde la consola 
        3) contar la cantidad de vocales y no vales y mostrar el resultado final 
        4) contar la cantidad de veces que se repite el char ingresado en el string 
        5)  listemos las vocales y las no vocales 
        
        -> hola 
        ->a 
        cantidad de vocales: 2 y son: o,a  
        cantidad de no vocales: 2 y son H,l
        cantidad de veces que se repite el char a: 1
         */
        Scanner entrada = new Scanner(System.in);
        String palabra = "";
        System.out.println("Ingrese la palabra para analizarla: ");
//        palabra = entrada.nextLine();
//        System.out.println("NextLine: "+ palabra);
        palabra = entrada.next();
//        System.out.println("Next: "+palabra);

        System.out.println("Ingrese un char: ");
        char valor = entrada.next().charAt(0);
//        String cadenChar = entrada.next();
//        char valor = cadenChar.charAt(0);
        int vocales = 0;
        int noVocales = 0;
        int cantidadRepetidos = 0;

        //acumulador 
        String acumuladorVocales = "";
        String acumuladorNoVocales = "";

        /*
        primera pos valida: 0 
        ultima pos valida: length-1
         */
        for (int i = 0; i <= palabra.length() - 1; i++) {
            char valorPos = palabra.charAt(i);
            int codigoAscii = (int) valorPos; // convirtiendo de un char a un int, nos da el codigo ascii para un char 
//            System.out.println(valorPos + "->"+codigoAscii);
            if (codigoAscii == 65 || codigoAscii == 97
                    || codigoAscii == 69 || codigoAscii == 101
                    || codigoAscii == 73 || codigoAscii == 105
                    || codigoAscii == 79 || codigoAscii == 111
                    || codigoAscii == 85 || codigoAscii == 117) {
                vocales++;
                acumuladorVocales += ", " + valorPos;
//                  acumuladorVocales = acumuladorVocales+", "+valorPos;

            } else {
                noVocales++;
                acumuladorNoVocales += ", " + valorPos;
//                  acumuladorNoVocales = acumuladorNoVocales+", "+valorPos;
            }

            if (valor == valorPos) {
                cantidadRepetidos++;
            }

        }// fin del for

        System.out.println("Cantidad de vocales " + vocales + " Y estas son: " + acumuladorVocales);
        System.out.println("Cantidad de no vocales " + noVocales + " Y estas son: " + acumuladorNoVocales);
        System.out.println("Cantidad de veces que se repite el char " + valor + ": " + cantidadRepetidos);

    }// fin del main 

}// fin de la clase
