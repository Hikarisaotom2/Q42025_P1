package clase_021220225;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_021220225 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Al crear una nueva clase, creamos un nuevo tipo de dato valido.
        */
      
       /*
       tipodeDato nombreVariable;
       */
       
       Persona juan = crearPersona();
       imprimirPersona(juan);
       
       
       Persona pedro = crearPersona();
       imprimirPersona(pedro);
       
       

    }// final del main
    
    public static void imprimirPersona(Persona personaImprimir ){
        System.out.println(" _________________________________________ ");
        System.out.println(personaImprimir.nombre);
       System.out.println(personaImprimir.apellido);
       System.out.println(personaImprimir.dni);
       System.out.println(personaImprimir.contacto);
        System.out.println(" _________________________________________ ");
    }
    
    public  static Persona crearPersona(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el dni");
        int dni = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el contacto: ");
        String contacto = entrada.nextLine();
        
        Persona nuevaPersona = new Persona();
        nuevaPersona.nombre = nombre;
        nuevaPersona.apellido = apellido;
        nuevaPersona.contacto = contacto;
        nuevaPersona.dni = dni;
        
        return nuevaPersona;
    }// fin del metodo
}
