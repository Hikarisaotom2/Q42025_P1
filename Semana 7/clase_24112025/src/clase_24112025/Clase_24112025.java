/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_24112025;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_24112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               /*
        Operaciones basicas de los arreglos
            1 crear 
            2 recorrerlos 
            3 acceder a los valores en sus posiciones 
            4 modificar los valores en sus posiciones 
        */ 
               
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los arreglos.");
        int tamano = entrada.nextInt();
        
        int [] arregloA = generarArreglos(tamano);
        int [] arregloB = generarArreglos(tamano);
        
        ImprimriArreglo(arregloA);
        ImprimriArreglo(arregloB);
        
        int resultado = ProductoPunto(arregloA,arregloB);        
        System.out.println("Resultado: "+resultado);
        

       
    }
    
    public static int [] generarArreglos(int tamanoArreglo){
        // crear el arreglo 
        int [] arreglo = new int[tamanoArreglo];
        Random aleatorio = new Random();
        
        // agregar valores aleatorios dentro del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            int numeroAleatorio = aleatorio.nextInt(99);            
            // actualizar el valor de una pos
            arreglo[i] = numeroAleatorio;

        }// fin del for 
        
        return arreglo;
    }// fin del metodo 
    
    public static void ImprimriArreglo(int [] arregloImprimir){
        System.out.print("[");
        for (int i = 0; i < arregloImprimir.length; i++) {
            //accerder al valor dentro de la pos
            int valor = arregloImprimir[i];
            System.out.print(valor+" ");
        }
        System.out.println("]");
    }// fin del metodo 
    
    public static int ProductoPunto( int [] arregloA, int [] arregloB ){
        int resultado = 0;
        for (int i = 0; i < arregloA.length; i++) {
            int multiplicacionTemp = arregloA[i]*arregloB[i];
            resultado +=multiplicacionTemp;
//             resultado +=arregloA[i]*arregloB[i];
        }// fin del for 
        return resultado;
    }// fin del arreglo
    
}
