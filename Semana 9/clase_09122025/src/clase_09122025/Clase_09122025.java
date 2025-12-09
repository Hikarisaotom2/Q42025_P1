/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_09122025;

/**
 *
 * @author claudiacortes
 */
public class Clase_09122025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
     1 metodo
        caso base: me ayuda a salir de la recursion 
        caso recursivo : me ayuda a generar el ciclo 
     */
    }
    
    public static int factorialConFor(int numero){
        //3*2*1
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial*i;
        }

       /*for (int i = numero; i >=1 ; i--) {
            factorial = factorial*i;
        }*/
        return factorial;
    }
    
    public static int factorialRecursivo(int numero){
        if(numero==1){/*Caso base*/
            return 1;
        }else{ /*Caso recursivo*/
         return numero*factorialRecursivo(numero-1);  
        }// fin del if 
    }// fin del metodo 
    
}
