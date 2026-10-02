import java.util.Scanner;
/**
* Programa para generar una clave estilo RFC de las personas
* Objetivo familiarizarce con la creación y uso de objetos de la clase String utilizando algunos métodos de dicha clase en la elaboración de un programa.
* @author Daniel Albor Méndez
* @version 1a edición
*/
public class RFC{
    
    public static void main(String[]args){
     /**
    * Ahora inicializamos el lector de teclado y solicitamos el nombre completo de la persona
    **/
      Scanner in = new Scanner(System.in);
      System.out.println("Hola cual es su nombre completo");
      String nombre = in.nextLine().trim();
     /**
    * Ahora solicitar la fecha de nacimiento en formato dd/mm/aa con las diagonales de forma obligatira
    **/ 
     System.out.println("Porfabor ingresa tu fecha de nacimiento con el formato dd/mm/aa");
     String fechaNacimiento = in.nextLine().trim();
     /**
    * Ahora separar el nombre en partes/palabras
    **/ 
      int primerEspacio = nombre.indexOf(" ");
      int segundoEspacio = nombre.indexOf(" ", primerEspacio + 1);
    /**
    * Ahora crear subcadenas para cada parte del nombre completo
    **/ 
    String Nombre = nombre.substring(0, primerEspacio);
    String apellidoPaterno = nombre.substring(primerEspacio + 1, segundoEspacio);
    String apellidoMaterno = nombre.substring(segundoEspacio + 1);
     /**
    * Extraer las letras necesarias para el RFC
    **/ 
    String inicialNombre = Nombre.substring(0,1);
    String dosletrasPaterno = apellidoPaterno.substring(0,2);
    String inicialMaterno= apellidoMaterno.substring(0,1);
     /**
    * Formar la parte alfabetica y numerica del RFC
    **/ 
    String letrasRFC= dosletrasPaterno + inicialMaterno + inicialNombre;
     /**
    * Separar la fecha de nacimiento usando las diagonales
    **/ 
      int primeraDiagonal =fechaNacimiento.indexOf("/");
      int segundaDiagonal =fechaNacimiento.indexOf("/",primeraDiagonal+1);
    
    //subcadenas para el dia mes y año
    String dia = fechaNacimiento.substring(0, primeraDiagonal);
    String mes = fechaNacimiento.substring(primeraDiagonal+ 1, segundaDiagonal);
    String año = fechaNacimiento.substring(segundaDiagonal+1);
    //formar la parte numerica del RFC 
    String numerosRFC = año + mes + dia;
    /**
    * Unir las variables de la parte numerica y alfabetica en mayusculas para crear el RFC
    **/ 
    String rfcFinal = (letrasRFC + numerosRFC).toUpperCase();
    System.out.println("El RFC de" + nombre + "es: " + rfcFinal);
  
  }
  
}
