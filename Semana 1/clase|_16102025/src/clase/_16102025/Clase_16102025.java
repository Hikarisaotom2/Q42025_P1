/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase._16102025;

/**
 *
 * @author claudiacortes
 */
public class Clase_16102025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 5;
        boolean bandera = true;
        // IF 
        if (numero<5){
            System.out.println("Caso verdadero");
        }
        
        //IF ELSE 
        if (numero<5) { //caso verdadero 
            System.out.println("El numero es menor a 5");
        }else{ // caso falso
            System.out.println("eL numeor no es menor a 5");
        }
        
        
        /*
         0 - 64 REP 
        65 70 APB 
        71 79 buena 
        80 89 muy bueno 
        90 100 excelente 
        otras notas no valido
        */
        int nota = 70;
//        if (nota <= 64) {
//            System.out.println("REP");
//        } else {// nota es mayor a 64 
//            if (nota <= 79 && nota >= 71) {
//                System.out.println("APB");
//            } else { // nota es mayor a 79
//                if (nota <= 89 && nota >= 80) {
//                    System.out.println("Muy bueno");
//                } else { // nota es mayor a 89
//                    if (nota <= 100 && nota >= 90) {
//                        System.out.println("Excelente");
//                    } else {// Nota es mayor a 100
//                        System.out.println("Nota no valida");
//                    }
//                }
//            }
//        }


        // ELSE IF -> if else if 
        if (numero<5) {
            System.out.println("El numero es menor a 5");
        }else if(numero==7){
            System.out.println("El numero es 7");
        }else{ // caso falso
            System.out.println("eL numeor no es menor a 5");
        }
        
        if (nota<=64) {
            System.out.println("REP");
        }else if(nota <= 79 && nota >= 71){
            System.out.println("APB");
        }else if(nota <= 89 && nota >= 80){
            System.out.println("Muy bueno");
        }else if(nota <= 90 && nota >= 100){
            System.out.println("excelente");
        }else{ /*El else es opcional, pero siempre es recomendable ponerlo*/
            System.out.println("Nota no valida");
        }
    }
    
}
