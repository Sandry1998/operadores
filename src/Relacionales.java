import java.util.Scanner;

public class Relacionales {
    public static void main(String[] args) {
        //los operadores relacionales dan como resultado verdadero o falso (true o false)
        int a=5,b=10,c=15;
        //Operador == -> igual al
        boolean igual=a==b;
        System.out.println("igual es "+igual);
        //Operador != -> distinto a
        boolean distinto=a==b; //true
        System.out.println("distingo es "+distinto);
        //Operador <  -> Menor a
        boolean menor=a<b;  //true
        System.out.println("menor es "+menor);
        //Operador <= -> Menor o igual
        boolean menorIgual=a>b; //true
        System.out.println("mayor es "+menor);
        //Operador >= -> Mayor o igual
        boolean mayorIgual=a>=b; //false
        System.out.println("mayor o igual es "+mayorIgual);

        /*
        *Solicitar la edad y si la edad es mayor a 18, indicar true o false
        *

        */



        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su edad");
        byte edad=sc.nextByte();
        boolean mayorEdad=edad>=18;
        System.out.println("¿Es mayor de edad? -> "+mayorEdad);

        /*
        *Operadores aritmeticos y Operadores logicos
        * Solicita un numero e indica con true or false si el numero es par
        */

        System.out.println("Ingrese un numero");
        int numero=sc.nextInt();
        boolean par=(numero%2)==0; //se calcula el modulo del numero entre 2 y si es 0 es par
        System.out.println("¿Es par? -> "+par);








    }
}
