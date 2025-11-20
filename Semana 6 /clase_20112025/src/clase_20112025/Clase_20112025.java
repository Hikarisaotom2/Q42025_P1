/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_20112025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_20112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        crear un metodo que crea arreglos 
        crear un metodo que llene un arareglo
        imprimir un arreglo 
        busquemos un elemento dentro de un arreglo 
            -> asumiendo que trabajamos con una lista de enteros 
            -> vamos a buscar un numero dentro de la lista de enteros 
            -> si el numero existe en la lista de enteros, debemos regresar / retornar la posicion en la que lo encontramos 
            -> si el numero NO existe en la lista de enteros, debemos regresra/retornar -1
            -> El metodo debe retornar algo
            -> Debemos pasar por parametros, el arreglo y el valor a buscar 
            public static ______ nombreMetodo(int [] arreglo, int numeroBuscar){
               _______________________________
            }
            
            [20,30,40]
            -> 20
            Resultado: 0
            [20,30,40]
            -> 15 
            Resultado: -1
        
         */
        int[] lista1 = CrearArray(5);
        lista1 = LlenarArreglo(lista1);
        System.out.println("arreglo lleno: ");
        ImprimirArreglo(lista1);
        
        int[] notas = {100,80,65};
        System.out.println("El segundo arreglo: ");
        ImprimirArreglo(notas);
        
//    int [] lista2 = CrearArray(10);
//    lista2 = LlenarArreglo(lista2);
//    System.out.println(lista2);
      char [] listaLetras;
    }
        
    public static int[] CrearArray(int tamano) {
        int[] arreglo = new int[tamano];
        return arreglo;
    }// fin del metodo 

    public static int[] LlenarArreglo(int[] lista) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese un valor para la pos " + i);
            lista[i] = entrada.nextInt();
        }// fin del for
        return lista;
    }// fin del metodo

    public static void ImprimirArreglo(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int valorActual = lista[i];
            System.out.print(i + " )" + valorActual);
        }
    }// fin del metodo

}
