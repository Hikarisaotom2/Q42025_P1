/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_17112025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_17112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cadena: ");
        String cadena = entrada.nextLine();
        System.out.println("ingrese p[alabra buscar");
        String buscar = entrada.nextLine();
        System.out.println("Ingrese palabra a reemplazar");
        String replace = entrada.nextLine();
        String nuevaCadena = WordReplace(cadena, buscar, replace);
        System.out.println("La nueva cadena es " + nuevaCadena);

    }// fin del main 

    public static String WordReplace(String cadena, String search, String replace) {
        String cadenaTemporal = "";
        int inicio = -1;
        int fin = -1;
        String cadenaFinal = "";
        for (int i = 0; i < cadena.length(); i++) { // recorre la variable cadena
            char caracterComparar = cadena.charAt(i);
            cadenaTemporal = "";
            for (int j = i; j < cadena.length(); j++) {// recorrer el resto de la variable cadena despues de la legtra que estamos evaluando en el momento
                cadenaTemporal = cadenaTemporal + cadena.charAt(j);
                if (cadenaTemporal.equalsIgnoreCase(search)) {
                    inicio = i;
                    fin = j;
                }// fin del if 
            }// fin del for pequeno 
        }// fin del for 

        if (inicio != -1 && fin != -1) { //encontramos la cadena
            // nota: podemos intentar realizando esto con un substring
            for (int i = 0; i < cadena.length(); i++) {
                char caracterActual = cadena.charAt(i);
                if (i < inicio || i > fin) {
                    cadenaFinal += caracterActual;
                } else if (i == inicio) {
                    cadenaFinal += replace;
                }// fin del if 
            }// fin del for 
        }// fin del if 

        return cadenaFinal;
    }// fin del metodo 

}// fin de la clase 
