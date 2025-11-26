/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_26112025;

/**
 *
 * @author claudiacortes
 */
public class Clase_26112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Laberinto:
        1) en cada turno se le debe preguntar al usuario que movimiento desea realizar, izq, derecha, arriba, abajo 
        2) si encontramos un muro (*) el usuario no puede avanzar a esa pos 
        3) el usuario no puede salir del tablero (validar pos)
        4) el juego termina si el usuario llega a la salida (pos 0,0)
        5) podemos asumir qu el tablero siempre será el mismo 
        6) el usuario siempre incicia en la misma pos
         */
        String[][] tablero = new String[5][5];
        tablero = GenerarTableroInicial(tablero);
        ImprimirTablero(tablero);

    }// fin del main 

    public static String[][] GenerarTableroInicial(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "   ";
            }
        }
        
        for (int j = 1; j < tablero[0].length; j++) { // recorrer las columnas de la fila 4
            tablero[0][j] = " * ";
        }

        for (int j = 0; j < tablero[4].length; j++) { // recorrer las columnas de la fila 4
            tablero[4][j] = " * ";
        }

        for (int i = 0; i < tablero.length; i++) {
            tablero[i][4] = " * ";
        }

        tablero[2][0] = " * ";
        tablero[2][2] = " * ";
        tablero[3][0] = " * ";
        tablero[3][1] = " * ";
        tablero[3][2] = " X ";
        return tablero;
    }// fin del metodo

    public static void ImprimirTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) { // recorrer las filas 
            for (int j = 0; j < tablero[i].length; j++) { // recorrer las columnas en la fila i
                System.out.print(tablero[i][j]);
            }// fin del for 
            System.out.println("");
        }// fin del for 
        System.out.println("");
    }// fin del tablero 

}
