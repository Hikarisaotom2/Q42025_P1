/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_05112025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_05112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        -> palabra secreta 
        -> contador de vidas: por cada error que cometamos, restar una vida 
        -> respueta correcta; la pos en la que estaba la letra y mostrar la situacion actual del juego 
        -> el juego termina cuando : nos quedamos sin vidas o adivinamos la palabra antes de quedarnos sin vidas
        
         miercoles 
        cantidad de vidas: 5
        _ _ _ _ _ _ _ _ _ 
        
        -> a 
        fallaste! 
        cantidad de vidas: 4
        _ _ _ _ _ _ _ _ _ 
        
        -> e
        felicidades! 
        cantidad de vidas: 4
         _ _ e _ _ _ _ e _ 
        
        */
        
        Scanner entrada = new Scanner(System.in);
        int vidas = 5;
        boolean ganamos = false;
        String secreto = "Jueves hola mundo";
        String adivinar = "";
        
        for (int i = 0; i < secreto.length(); i++) {
                adivinar+= "_ ";
        }
        
        while (vidas>0 || ganamos) {
            System.out.println("Cantidad de vidas: "+ vidas);
            System.out.println(adivinar);
            System.out.println("Ingrese un char para adivinar: ");
            char valor = entrada.next().charAt(0);
            
            int posEncontro= secreto.indexOf(valor);
            
            if(posEncontro!=-1){
                System.out.println("Felicidades, encontro una letra");
                

            }else{
                System.out.println("Error, el valor no existe!");
                vidas--;
            }
            
            
            
            
        }
    }
    
}
