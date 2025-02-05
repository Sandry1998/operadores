import java.util.Scanner;

public class Aritmeticos {
    public static void main(String[] args) {
        //Operador +
        int numero1 = 5, numero2 = 10, numero3 = 15;
        int suma = numero1 + numero2 + numero3;
        System.out.println("La suma es" + suma);
        //Operador -
        int resta = numero3 - numero1; //resta=10
        System.out.println("El resta es" + resta);
        //Operador de asignacion =
        resta = 0; //asigno 0 a resta
        System.out.println("El resta es" + resta);
        //Operador *-> multipliacion
        int multiplicacion = numero1 * numero2;
        System.out.println("El multiplicacion es" + multiplicacion);
        //Operador / -> division ----- declarar la variable en double
        double division = (double) numero3 / numero2;
        System.out.println("El division es" + division);
        //Operador % Modulo o resto de una division
        double modulo = (double) numero3 % numero2;
        System.out.println("El modulo es" + modulo);
        //Operador de incremento ++ incrementa en 1 el valor de la variable (numero1=numero1+1)
        //supuesto como prefijo
        ++numero1;
        System.out.println("Ahora numero1 es" + numero1);
        //Operador de decremento -- -> resta en 1 el valor de la variable (numero1=numero1-1)
        --numero1;
        System.out.println("Ahora numero1 es" + numero1);
        //Para entender la diferencia en usar el ++ o -- de presfijo o posfijo
        int a,b,c;
        a=1;
        b=a++;//b=1 y luego a=2
        c=a++; //incrementamos primero a a=3 y despues asignamos el valor a c=3
        System.out.println("a=" +a+" b="+b+" c="+c);
        // d=a*b   b=b+1
        int d=a*b++;
        System.out.println("a=" +a+" b="+b+" c="+c +" d="+d);

        /*solicita la edad al usuario y muestra cuanto tendra el año 2025 (asumimos que no nacio en Enero)
        *1. Declarar el Scanner
        * 2. Solicitar la edad
        * 3. Declarar la variable byte y leer el dato
        * 4. Incrementar en uno la edad
        * 5. Mostrar la edad de 2025 en pantalla
         */

        Scanner  sc= new Scanner(System.in);
        System.out.println("Ingrese su edad");
        byte edad=sc.nextByte();
        edad++;
        System.out.println("SU edad en 2025" + edad);

        sc.close();










    }
}
