/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_04112025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_04112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        length 
        charAt
        leer strings
        leer chars
        obtener codigo ascii para un char 
        acumuladores string
        
        convertir a mayusculas
        convertir a minusculas
        comparar strings (teniendo en cuenta las mayusculas y las minusculas)
        reemplazar chars / eliminar chars 
        
        encontrar la posicion de un char 
        obtener fragmentos de una cadena
        
        */
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("-> INDEXOF");
        System.out.println("Ingrese una cadena");
        String cadenaIndexOf = entrada.next();
        int pos = cadenaIndexOf.indexOf('!');
        System.out.println("En la palabra "+cadenaIndexOf+", la letra l esta en la pos "+ pos);
        
        System.out.println("-> SUBSTRING");
        String cadenaSubstring = "programacionI";
        String subCadena = cadenaSubstring.substring(0,3);
        System.out.println("la subcadena entre la pos 0, 3 es "+subCadena);
        subCadena = cadenaSubstring.substring(4); // el pedazo de texto desde la pos 1, hasta el final
         System.out.println("la subcadena que empieza en la pos 4 hasta el final "+subCadena);
        /*
        importante a recordar en el substring: 
        1) al segundo valor siempre se le restara 1,
        2) el primer valor siempre debe ser menor o igual al segundo valor 
        3) ambos valores deben ser posiciones valida, de lo contrario obtendremos un out of bounds 
        */
        
        
        System.out.println("-> REPLACE");
        System.out.println("Ingrese la cadena original");
        String cadenaOriginal = entrada.nextLine();
        System.out.println("Ingrese el char para reemplazar");
        char caracterReemplazar = entrada.next().charAt(0);
         System.out.println("Ingrese el nuevo char");
        char caracterNuevo = entrada.next().charAt(0);
                     
        cadenaOriginal = cadenaOriginal.replaceAll(" ", ""); //eliminando todos los espacios
                                                
        String cadenaModificada = cadenaOriginal.replaceAll(caracterReemplazar+"",caracterNuevo+"" );
        System.out.println("La cadena actualizada es: "+cadenaModificada);
        
        System.out.println("-> EQUALS");
        System.out.println("Ingrese la primera cadena a comparar");
        String cadena1 = entrada.nextLine();
        System.out.println("Ingrese la segunda cadena a comparar");
        String cadena2 = entrada.nextLine();
        boolean iguales = cadena1.equals(cadena2);
        
        if(cadena1.equals(cadena2)){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas son distintas");
        }
        
        if(cadena2.equalsIgnoreCase(cadena1)){
            System.out.println("Las cadenas son iguales, sin importar las mayusculas");
        }else{
            System.out.println("Las cadenas son distintas, sin importar las mayusculas");
        }
    
        System.out.println("-> TO LOWERCASE Y TO UPPER CASE");
        System.out.println("Ingrese una oracion");
        String cadena = entrada.nextLine();
        String cadenaMayuscula = cadena.toUpperCase(); // convierte el texto a mayusculas
        String cadenaMiniscula = cadena.toLowerCase(); // convierte el texto a minisculas

        System.out.println("Cadena original: "+cadena);
        System.out.println("Cadena mayuscula: "+cadenaMayuscula);
        System.out.println("Cadena Minuscula: "+cadenaMiniscula);
        
       
        
       
        
    }
    
}
