import java.util.Scanner;
/**
* Programa para simular una sesión con el psicologo
* Objetivo familiarizarce con la creación y uso de ob-
jetos de la clase String utilizando algunos métodos de dicha clase en la elaboración de un
programa.
* @author Daniel Albor Méndez
* @version 1a edición
*/
public class Psicologo{
    
    public static void main(String[]args){
    
    /**
    * Ahora inicializamos el lector de teclado y el mensaje de bienvenida
    **/
      Scanner in = new Scanner(System.in);
      System.out.println("Hola bienvenido cual es su nombre");
      String nombre = in.nextLine();
     /**
    * Ahora damos el saludo al paciente
    **/  
      System.out.println( "Buenas tardes " + nombre + ".");
      System.out.println( "Cuenteme cual es su problema en la vida");
      
    /**
    * Ahora vamos a guardar el problema del paciente con otro objeto scanner.Y le vamos a responder incluyendo el problema que nos planteo
    **/  
      String problema=in.nextLine();
      System.out.println("Mmm...ya veo");
      System.out.println("Entonces digame ... ");
      System.out.println("por que dice que " + problema + ".");
    /**
    * Ahora vamos a guardar la siguiente respuesta del paciente.
    **/ 
     String respuesta=in.nextLine();
     System.out.println("Muy interesante!! Hablaremos de ello con mas detalle la siguiente sesion");
     
    }
}
