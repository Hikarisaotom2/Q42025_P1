package clase_03112025;

/**
 *
 * @author claudiacortes
 */
public class Clase_03112025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Strings 
        /char -> caracteres ->letras, numeros, simbolos, etc , '
        Strings: conjunto de chars, " */
        char caracter = '!';
        String cadena = "CLAUDIA CORTES";

        // Metodos de la clase string 
        // Length 
        int tamano = cadena.length();
        System.out.println("El tamano del string " + cadena + " es: " + tamano);
        cadena = "Hola mundo ";
        tamano = cadena.length();
        System.out.println("El tamano del string " + cadena + " es: " + tamano);

        // Valores en posiciones 
        //C L A U D I A   tamano: 8 
        //0 1 2 3 4 5 6 7
        // primera pos valida SIEMPRE es 0
        // la ultima posicion valida: length()-1
        
        // Este codigo produce un out of bounds 
//        char valorEnPos = cadena.charAt(80);
//        System.out.println("En la pos 80 estaba el char " + valorEnPos);

        // imprimir una palabra al derecho y al reverso 
        // hola -> 4 
        cadena = "Hola";
        for (int i = 0; i <= cadena.length() - 1; i++) {
            System.out.print(cadena.charAt(i));
        }
        
        System.out.println("");
        
        
        for (int i = cadena.length()-1 ; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        
        System.out.println("");

    }// fin del main 

}
