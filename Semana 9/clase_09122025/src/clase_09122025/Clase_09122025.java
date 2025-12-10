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
     int resp = factorialRecursivo(4);
        System.out.println(resp);
    }
    
                /*
    Reglas para prueba de escritorio
        1) crece de abajo hacia arriba 
        2)SIEMPRE que llamamemos a un metodos,
        vamos a ingresar algo a la pila 
        3) la computadora solamente se concentra 
        en una cosa a la vez (lo que este en el tope de la pila)
        4)cuando realicemos un retorno exitoso,
        vamos a sacar el elemento de la pila
        */
    
    public static int factorialRecursivo(int numero){
        if(numero==1){/*Caso base*/
            return 1;
        }else{ /*Caso recursivo*/
            // x! = x* (x-1)!
         return numero*factorialRecursivo(numero-1);  
        }// fin del if
    }// fin del metodo
    
    
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
 
    
}
