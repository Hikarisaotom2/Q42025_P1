/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_041220225;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_041220225 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un arraylist 
        ArrayList<String> lista = new ArrayList<String>();
        
        // agregar un valor 
        lista.add("Hola Mundo");
        String mensaje = "Hola";
        lista.add(mensaje);
        lista.add(mensaje);
        lista.add(mensaje);
        lista.add(mensaje);
        
        // Imprimir un arrarlist 
        System.out.println("Lista: ");
        System.out.println(lista);
        
        //Acceder a los elementos dentro del arraylist 
        String elemento = lista.get(0);
        String elemento2 = lista.get(1);
        System.out.println("Elementos ");
        System.out.println("0 "+elemento);
        System.out.println("1 "+ elemento2);
        
        // acceder al tamano del arraylist 
        int tamano = lista.size();
        System.out.println("tamano actual: "+ tamano);
         lista.add("mensaje extra");
        lista.add("otro mensaje");
        tamano = lista.size();
         System.out.println(lista);
        System.out.println("Tamano despues de agregar dos elementos... "+tamano );
        
        // eliminar elementos del arraylist 
        
        System.out.println("\n -> ELIMINANDO ELEMENTOS\n");
        System.out.println("Lista antes de comenzar a eliminar: ");
        System.out.println(lista);
        
        lista.remove(0);
        System.out.println("Eliminando pos: 0");
        System.out.println(lista);
        lista.remove(4);
        System.out.println("Eliminando pos: 4");
        System.out.println(lista);
        
        //Otras operaciones 
        boolean seEncuentra = lista.contains("Hola");
        int pos = lista.indexOf("Hola"); //funciona igual que en los strings 
        boolean estaVacio = lista.isEmpty();
        lista.clear(); //elimina todos los elementos 
        System.out.println(lista);
        
        
        
    }// fin del main
}
