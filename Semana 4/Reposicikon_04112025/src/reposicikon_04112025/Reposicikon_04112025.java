/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reposicikon_04112025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Reposicikon_04112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1) repetir caracteres :
        cadena: numeroCharNumeroCharNumeroChar.............     

        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena con el formato numeroCharNumeroChar: ");
        String cadena = entrada.next();
        
        for (int i = 0; i <= cadena.length()-1; i+=2) {
            // char -> numeroAscii , numero entero 
            // '9' -> 57 (codigo ascii), 9 
            char valorActual = cadena.charAt(i);
            // convertir el char a un entero 
            int cantidadVecesRepetir = Integer.parseInt(valorActual+"");
            char caracterRepetir = cadena.charAt(i+1);
            for (int j = 0; j < cantidadVecesRepetir; j++) {
                System.out.print(caracterRepetir);
            }
        }// fin del for 
        System.out.println("");
        
        
        
    }// fin del main 
    
}// fin de la clase
