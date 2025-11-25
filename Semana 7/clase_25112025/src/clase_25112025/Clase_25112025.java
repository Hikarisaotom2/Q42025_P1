/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_25112025;

/**
 *
 * @author claudiacortes
 */
public class Clase_25112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                /*
        NOTAS IMPORTANTES SOBRE LAS MATRICES: 
        1)  el primer par de corchetes, representa el tamano de las filas,
        el segundo par de corchetes representa el tamano de las columnas
        2) Las matrices no se pueden imprimir directamente en un sout
        */
                
                
        // 1) crear una matriz 
        int tamanoFilas = 5;
        int tamanoColumnas = 7;
        // matriz rectangular / no cuadrada 
        String [][] tablero = new String [tamanoFilas][tamanoColumnas];
        // matriz cuadrada 
        String [][] tableroCuadrado = new String [5][5];
        
        
        // 2) Asignar valores en la matriz 
        int posFila = 0;
        int posColumna = 0;
        tableroCuadrado[posFila][posColumna] = "Hola";
        tableroCuadrado[2][3] = "Mundo";
        
        // 3) Ver los valores dentro de una pos 
        
        String valorEnPos = tableroCuadrado[2][2];
        System.out.println("el valor en la pos 2,2 "+valorEnPos);
        
        String valorEnPos2 = tableroCuadrado[2][3];
        System.out.println("el valor en la pos 2,3 "+valorEnPos2);
        

        // 4) Recorrer una matriz 
            // tamano de las filas? tamano de las columnas? 
        
    }
    
}
