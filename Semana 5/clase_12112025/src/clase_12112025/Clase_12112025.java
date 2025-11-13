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
        int continuar=0;
         Scanner entrada = new Scanner(System.in);
        while (continuar!=1) {
             
              System.out.println("Ingrese su opcion");
              int op = entrada.nextInt();
              if(op==1){
                  EjercicioToLowerCase();
              }else if(op==2){
                  Suma();
              }else if(op==3){
                  Restar(20,40);
              }
        }
        /*
        Metodos: Un fragmento de codigo reutilizable que se puede llamar en cualquier parte del codigo. 
        */
        
      
        // Utilizar un metodo/ invocar/ llamar 
        // NombreMetodo();
        EjercicioToLowerCase();
        System.out.println("");
        int valorFinal = Suma();
  
        
        
        int numero1 = entrada.nextInt();
        int numero2= entrada.nextInt();
        int resultadoResta = Restar(numero1,numero2);
        resultadoResta=Restar(1,2);
        resultadoResta=Restar(numero1,120);
        resultadoResta=Restar(numero2,130);
        resultadoResta=Restar(873,numero1);
        resultadoResta=Restar(873,numero2);
        System.out.println("El resultado es: "+ resultadoResta);
        
     
      
    }// fin del main 
    
    /*
    1) Los metodos se escriben debajo del main, pero dentro de la clase  o debajo de la clase, arriba del main
    2) Los metodos no necesaramiente se ecsriben todos igual 
     public static tipoDeRetorno nombreMetodo (...) {
        
    }
    void: no tenemos ningun resultado 
    3) dentro de las llaves del metodo, se programa con normalidad
    4) El metodo, puede estar definidio peor eso no significa que se va a ejecutar, para ello tenemos que llamarlo en el main.
    5) Podemos crear metodos que nos den un resultado
        -> return valorRegresar
        -> al hacer return, el tipo de retorno del metodo debe coincidir con el tipo de dato que estamos usando en el return 
    6) Parametros y argumentos: 
        -> parametros: son los valores que se definen como necesarios para que el metodo trabaje
        -> argumentos: son los valores que se le pasan al metodo en su llamado
    */
    public static int Restar(int numero1, int numero2){
        int resultado = numero1-numero2;
        return resultado;
    }
    
    public static int Suma(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = entrada.nextInt();
        int resultado = numero1+numero2;
        return resultado;
    }
    
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
