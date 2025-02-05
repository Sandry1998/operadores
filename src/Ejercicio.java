import java.util.Scanner;

public class Ejercicio {
    /**
     * Decidir si salimos a la calle, aspectos que influyen:
     * 1.Esta lloviendo
     * Ha terminado la tarea.
     * Independientemente del resultado anterior, si tiene que ir a la biblioteca, podra salir a la calle
     *
     */
  public static void main(String[] args) {
      //Declarar las variables y el scanner
      boolean estaLloviendo, terminoTarea,biblioteca;
      Scanner  sn= new Scanner(System.in);
      //Hacemos las preguntas
      System.out.println("¿Esta lloviendo? ");
      estaLloviendo=sn.nextBoolean();
      System.out.println("¿Ha terminado la tarea?");
      terminoTarea=sn.nextBoolean();
      System.out.println("¿Necesitas ir a a la biblioteca?");
      biblioteca=sn.nextBoolean();
      //resultado si no llueve y ha terminado la tarea->sale o si tiene que ir a la biblioteca
      boolean resultado= !estaLloviendo && terminoTarea || biblioteca;
      System.out.println("Puedes salir -> "+resultado);





    }
}
