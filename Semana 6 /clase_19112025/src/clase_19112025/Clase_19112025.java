/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_19112025;

/**
 *
 * @author claudiacortes
 */
public class Clase_19112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Array: Son un tipo de dato compuesto, tipo de dato por referencia
        nos ayudan a crear lstas en java 
        NOTAS: 
        - tienen un tamaño fijo
        - podemos tener un index out of bounds 
        - para acceder a sus elementos debemos trabajar con posiciones 
        - la primera pos valida es el 0 y la ultima es el tamaño -1
        - en un array todos los elementos deben ser del mismo tipo de dato.
        */
        
        // Crear un arreglo
        int [] listaDni = new int [5];
        int [] listaDni2 = {123,234,250}; // tamano: 3
        int [] listaDni3; // arreglo sin inicializar    
        listaDni3 = new int[1];
        
        // acceder al tamaño del arreglo 
        int tamano = listaDni.length;
        System.out.println("Tamano del array "+tamano);
        
        // Acceder a las posciones dentro del arreglo 
       
        int pos = 4;
        //modificar el valor en una pos 
        listaDni[pos] = 250;
        // acceder al valor en una pos
        int valor = listaDni[pos];
        
        System.out.println("Valor en la pos "+pos+ ": " +valor);

        
        
        
        
    }
    
}
