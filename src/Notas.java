import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        /*
        *Solicitar 3 notas por pantalla(Declarar Scanner, solicitar notas,Guardarlas en variables)
        * Hacer la media de las 3 notas (Calcular media en una variable
        * Mostrar la media(Sout-> mostrar)
         */
        //Ingresar las medias de las tres notas
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la nota -> "); //sout
        double nota= entrada.nextDouble();
        System.out.println("Ingrese la nota2->");
        nota+=entrada.nextDouble();
        System.out.println("Ingrese la nota3-> ");
        nota+=entrada.nextDouble();
        nota/=3;
        System.out.println("La media es " + nota);





    }
}
