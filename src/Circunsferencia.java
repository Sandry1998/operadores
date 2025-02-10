import java.util.Scanner;

public class Circunsferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //solicitamos el radio en una variable tipo double
        System.out.print("***CALCULO DE LA LONGITUD Y AREA DE UN CIRCULO*** ");
        System.out.print("Ingrese el radio de la circunferencia*** ");
        double radio = entrada.nextDouble();
        //Utilizamos la API de Java para realizar calculos o traer valores
        double area = Math.PI*Math.pow(radio, 2); //Math.pow(base,exp) -> exponente
        double longitud=2*Math.PI*radio;
        System.out.println("El area del circunferencia es: "+area);
        System.out.println("La longitud del radio es: "+longitud);
        entrada.close();


    }
}
