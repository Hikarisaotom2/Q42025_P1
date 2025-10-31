package reposicion_30102025;

import java.util.Scanner;

/**
 * @author claudiacortes
 */
public class Reposicion_30102025 {

    public static void main(String[] args) {
        /*
        Switch case: estructura de decision que trabaja con "casos" o "valores esperados"
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de mes");
        int mes = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = entrada.nextInt();
        /*
        31 días son enero, marzo, mayo, julio, agosto, octubre y diciembre.
        Los meses con 30 días son abril, junio, septiembre y noviembre. 
        Febrero tiene 28 días en un año común y 29 días en un año bisiest
         */
//        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 | mes == 8 || mes == 10 || mes == 12) {
//            System.out.println("El mes tiene 31 dias");
//        } else if (mes == 4 | mes == 6 || mes == 9 || mes == 11) {
//            System.out.println("El mes tiene 30 dias");
//        } else if (mes == 2) {
//            System.out.println("el mes tiene 28 dias");
//        }else{
//   System.out.println("Valor invalido");
//    }

        switch (mes) {
            case 1: // mes ==1
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 4: //mes == 4
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2: // mes ==2
                if(anio%4==0){
                    System.out.println("el mes tiene 28 dias");
                }else{
                    System.out.println("el mes tiene 29 dias");
                }
                
                break;
            default:
                System.out.println("Valor invalido");
        } // fin del switch
        
        
        /* Rule switch
        no necesitamos el uso del break, por que se utilizan {} para el codigo de cada caso
        */
        switch (mes) {
            case 1 -> { //mes ==1 
                System.out.println("El mes tiene 31 dias");
            }
            case 2 -> { //mes ==2 
                System.out.println("El mes tiene 31 dias");
            }

            default->{
            System.out.println("Valor invalido");
            }
                
        } // fin del rule switch 
    }

}
