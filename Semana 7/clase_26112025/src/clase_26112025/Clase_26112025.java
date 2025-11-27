/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_26112025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_26112025 {

    /**
     * @param args the command line arguments
     */
    //Variables globales
    public static int filaActualJugador =  -1;
    public static int columnaActualJugador = -1;
    
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
        
        
        while (true) {
              ImprimirTablero(tablero);
              tablero = LeerValidarMovimiento(tablero);
        }
      

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
        tablero[3][2] = " x ";
        filaActualJugador = 3;
        columnaActualJugador = 2;
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
    
    public static String[][] LeerValidarMovimiento(String [][] tablero){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la dirección a la que desea moverse: ");
        System.out.println("1) Izquierda");
        System.out.println("2) Derecha ");
        System.out.println("3) Arriba");
        System.out.println("4) Abajo");
        int pos = entrada.nextInt();
        switch (pos) {
            case 1 ->{ //Izquierda, col
                String valor = tablero[filaActualJugador][columnaActualJugador-1];
                if(valor.equals("   ")){ // el espacio esta vacio, podemos movernos
                     tablero[filaActualJugador][columnaActualJugador] = "   ";
//                  columnaActualJugador =columnaActualJugador-1;
                  columnaActualJugador--;
// .                columnaActualJugador-=1;
                    tablero[filaActualJugador][columnaActualJugador] = " x ";
                    System.out.println("AVANZANDO CON EXITO!");
                    
                }else{ // el espacio esta ocupado
                    System.out.println("Movimiento invalido.....");
                }
            }
            
            case 2 ->{// Derecha, col
                 String valor = tablero[filaActualJugador][columnaActualJugador+1];
                if(valor.equals("   ")){ // el espacio esta vacio, podemos movernos
                    tablero[filaActualJugador][columnaActualJugador] = "   ";
                     columnaActualJugador++;
                    tablero[filaActualJugador][columnaActualJugador] = " x ";
                    System.out.println("AVANZANDO CON EXITO!");
                }else{ // el espacio esta ocupado
                    System.out.println("Movimiento invalido.....");
                }
            }
            
            case 3 ->{ // Arriba, fila 
                /*
                Pendiente para trabajo en clase: 
                1)completar los movimientos de arriba, abajo 
                2)agregar validaciones para no permitir movimientos fuera del tablero 
                3) verificar si el usuario gano
                */
            }
            
            case 4 ->{// Abajo, fila 
                
            }
            
            default ->{
                
                
            }
        }// fin del switch 
        
        return tablero;
        
    }// fin del metodo 
    
}// fin de la clase 
