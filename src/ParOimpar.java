import java.util.Scanner;

public class ParOimpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indique un numero entero: ");  //sout
        int numero = entrada.nextInt();
        //Operador ternario condicion?true:false;
        String salida=numero%2==0?"El numero es par":"El numero es impar";
        System.out.println(salida);
        entrada.close();









    }
}
