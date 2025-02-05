import java.util.Scanner;

public class OperadoresYasigna {
    public static void main(String[] args) {
        int a=5,b=10,c=15;
        //suma y asigna +=
        a+=10;
        System.out.println("a="+a);
        //resta y asigna c=c-7;
        c-=7;
        System.out.println("c="+c);
        //multiplica y asigna *=
        a*=10;
        System.out.println("a="+a);
        //divide y asigna /=
        b/=2;
        System.out.println("b="+b);
        //modulo y asigna %=   c=8/3->2 mod 2
        c%=3;
        System.out.println("c="+c);

        /*
         * solicitar ventas semanales de las peras y las manzanas
         * precio de las peras -> 1,9
         * precio de las manzanas -> 2,35
         * mostrar por pantalla el importe total vendido
         *
         */
         Scanner sc=new Scanner(System.in);
         final double Precio_Pera=1.9;
         final double Precio_Manzana=2.35;
         //solicitamos los datos
        System.out.println("Kilos vendidos en el 1ª semestre de Peras");
        double peras=sc.nextDouble();
        System.out.println("Kilos vendidos en el 2ª semestre de Peras");
        peras+=sc.nextDouble();
        System.out.println("Kilos vendidos en el 1ª semestre de Manzana");
        double manzanas=sc.nextDouble();
        System.out.println("Kilos vendidos en el 2ª semestre de Manzana");
         manzanas+=sc.nextDouble();
        //calculamos el total vendido x el precio de venta
        peras*=Precio_Pera;
        manzanas*=Precio_Manzana;
        //calculamos el total
        double total=peras+manzanas;
        System.out.println("El frutero ha vendido en el año un total de "+total + "€");

        sc.close();




    }


}












