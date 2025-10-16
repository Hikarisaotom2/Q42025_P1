/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eejemplos;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Eejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hola, este es un comentario de una linea 
        
        /*
        Hola 
        este 
        es un 
        comentario
        de multiples lineas
        */
        
        
        
        /*Crear variables*/
        // TipoDato nombreVariable = valorInicial;
        // TipoDato nombreVariable;
        
        /*Notas sobre Variables
        1) variables significativas 
        2) Reglas para crear variables: 
            1) toda variable empieza con letras
            2) Dentro de la variable si podemos tener numeros, letras y simbolos
            3) en el caso de java el unico simbolo valido es _ 
        
        3) es buena practica utilizar convenciones de escritura:
            su objetivo es que las variables sean mas faciles de leer 
            camelCase - > empezamos en miniscula y cada palabra siguiente va a comenzar en mayuscula
                notasDeLaClase
            snake_case -> todo en miniscula pero cada palabra esta separada por un _
                notas_de_la_clase
            kebab-case -> todo en miniscula pero cada palabra esta separada por un -
                notas-de-la-clase
            PascalCase -> Cada palabra comienza en Mayuscula
                NotasDeLaClase
        */ 
        
       

        int miVariable = 5;
        double midouble = 4.9;
        /*operaciones de ejemplo*/
        miVariable+=5;
        miVariable = miVariable+5;        
        miVariable+=5;// miVariable = miVariable+5;
        
        /*Entrada y Salida de datos en consola*/
        System.out.print("Hola Mundo"); // No tiene salto de linea 
        System.out.print("Otro mensaje"); // No tiene salto de linea 
        
        System.out.println("Hola Mundo"); // Si tiene salto de linea
        System.out.println("Otro mensaje"); // Si tiene salto de linea

        Scanner entrada = new Scanner(System.in);
        int nota1 = entrada.nextInt();

    }
    
}
