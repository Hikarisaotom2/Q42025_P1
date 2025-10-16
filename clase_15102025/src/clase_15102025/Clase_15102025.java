/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_15102025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_15102025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Cree un programa que lea 4 numeros y calcule el promedio de los valores.
        -> considere nombres significativos 
        -> buenas practicas de programacion
        -> documente su codigo 
         */
        
        /*
        Palabra Reservada:  palabras que tiene un significado en el lenguaje
         las palabras reservadas estan prohibidas en los nombres de variables
        */
        
        Scanner entrada = new Scanner(System.in);
        
        int Scanner =0;

        System.out.println("Bienvenido/a");
        
        System.out.println("ingrese un valor: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("ingrese el segundo valor: ");
        int numero2 = entrada.nextInt();
        
        System.out.println("ingrese el tercer valor: ");
        int numero3 = entrada.nextInt();
        
        System.out.println("ingrese el cuarto valor: ");
        int numero4 = entrada.nextInt();
        
        // calculando promedio de los valores
//        double promedioValores = (numero1+numero2+numero3+numero4)/4;

        double sumaValores = numero1 + numero2 + numero3 + numero4;
                                
        double promedioValores = sumaValores / 4;
        
        System.out.println("El resultado es: "+promedioValores);

    }

}
