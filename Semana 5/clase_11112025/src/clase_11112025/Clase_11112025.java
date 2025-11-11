/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_11112025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_11112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Desarrolle un programa en Java que simule un sistema de verificación de contraseñas, implementando control de intentos y validaciones básicas sobre el texto ingresado.

        El programa deberá cumplir con las siguientes especificaciones:

        Defina dentro del código una contraseña secreta (por ejemplo, "Programacion123").

        El usuario dispondrá de cinco intentos para ingresar la contraseña correcta.

        En cada intento:

        El programa deberá solicitar al usuario que escriba una contraseña.

        Si la contraseña ingresada coincide exactamente con la contraseña secreta (respetando mayúsculas y minúsculas), deberá mostrarse un mensaje de éxito y finalizar el programa.

        Si la contraseña no coincide, se mostrará un mensaje indicando el error y se descontará un intento.

        Si la contraseña ingresada tiene menos de ocho caracteres, deberá mostrarse un mensaje de advertencia antes de continuar, sin descontar una vida adicional.

        Cuando el usuario agote todos los intentos, el programa deberá finalizar mostrando un mensaje que indique que el acceso ha sido bloqueado.

        Nota: No está permitido utilizar el método equalsIgnoreCase() ni equals() para comparar las contraseñas.
        El estudiante deberá implementar su propia lógica para verificar si ambas cadenas son exactamente iguales.
        Ejemplos:

        Ingrese la contraseña: hola
        Advertencia: la contraseña es demasiado corta.
        Contraseña incorrecta. Intentos restantes: 4

        Ingrese la contraseña: programacion
        Contraseña incorrecta. Intentos restantes: 3

        Ingrese la contraseña: Programacion123
        ¡Acceso concedido!


        Ejemplo 2 ( Si el usuario falla todos los intentos)

        Ingrese la contraseña: java123
        Contraseña incorrecta. Intentos restantes: 0
        Acceso bloqueado. Intente más tarde.*/

        String contrasenaSecreta = "12345678";
        int vidas = 5;
        Scanner entrada = new Scanner(System.in);
        String contrasena = "";
        while (vidas > 0) {
            do {
                System.out.println("Ingrese la contrasena: ");
                contrasena = entrada.nextLine();
                if (contrasena.length() < 8) {
                    System.out.println(" Advertencia: la contraseña es demasiado corta.");
                }

            } while (contrasena.length() < 8); // fin del do while 
            // Podemos estar completamente seguros de que la contrasena tiene como minimo 8 caracteres 

            if (contrasenaSecreta.length() == contrasena.length()) {// verificar si son lo mismo 

                boolean sonIguales = true;
                for (int i = 0; i < contrasena.length(); i++) {
                    char primerChar = contrasena.charAt(i);
                    char segundoChar = contrasenaSecreta.charAt(i);
                    if (primerChar == segundoChar) {
                        // Esto no me sirve de mucho, por que el hecho de que dos chars sean lo mismo, NO asegura que el resto de los chars van a ser iguales
                    } else {
                        sonIguales = false;
                        break;
                    }// fin del if 
                }// fin del for

                if (sonIguales) {
                    System.out.println(" ¡Acceso concedido!");
                    break;
                } else {
                    vidas--;
                    System.out.println("Contraseña incorrecta. Intentos restantes:" + vidas);
                }

            } else {
                vidas--;
                System.out.println("Contraseña incorrecta. Intentos restantes:" + vidas);
            }// fin del if 
            
            if (vidas == 0) {
                System.out.println("Acceso bloqueado. Intente más tarde.");
            }
        }// fin del while 
    }// fin del main

}// fin de la clase
