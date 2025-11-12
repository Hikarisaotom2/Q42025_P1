/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_12112025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_12112025 {
    
    public static void main(String[] args) {
        /*
        Metodos: Un fragmento de codigo reutilizable que se puede llamar en cualquier parte del codigo. 
        */
        
        Scanner entrada = new Scanner(System.in);
        // Utilizar un metodo/ invocar/ llamar 
        // NombreMetodo();
        EjercicioToLowerCase();
      
    }// fin del main 
    
    /*
    1) Los metodos se escriben debajo del main, pero dentro de la clase  o debajo de la clase, arriba del main
    2) Los metodos no necesaramiente se ecsriben todos igual 
     public static tipoDeRetorno nombreMetodo (...) {
        
    }
    void: no tenemos ningun resultado 
    3) dentro de las llaves del metodo, se programa con normalidad
    4) El metodo, puede estar definidio peor eso no significa que se va a ejecutar, para ello tenemos que llamarlo en el main.
    */
    
    public static void EjercicioToLowerCase(){
     Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cadena");
        String cadena = entrada.nextLine();
        String nuevaCadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            int codigoAscii = (int)caracter; // 65
            if(codigoAscii>=65 && codigoAscii<=90){// Es una letra mayuscula
                int codigoAsciiMinuscula = codigoAscii+32;
                char caracterMinuscula = (char)codigoAsciiMinuscula;
                nuevaCadena+=caracterMinuscula;
            }else{ //es cualquier otra cosa
                nuevaCadena+= caracter;
            }// fin del if
        }//fin del for 
        System.out.println("La cadena en minuscula es: "+ nuevaCadena);
    }// fin del metodo
   
}// fin de la clase 
