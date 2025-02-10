public class ConversionTipos {
    public static void main(String[] args) {
        //Ensanchamiento
        int numero1=5500;
        double numero2=numero1;
        double numero3=856.54;
        //Truncar-> quitar los decimales si es posible
        numero1= (int) numero3;//se comporte como int->856
        System.out.println(numero1);
        //Casting de tipo
        double numero4=numero2+(double)numero1;//856.0
        System.out.println(numero4);
        System.out.println(numero3);

        //Precedencias
        /**
         * Postfijo -> exp ++ exp --
         * Prefijos -> ++exp --exp !exp
         * Aritmeticos-> * / %
         * Aritmeticos-> +-
         * Relacionales < <= > >=
         * Comparacion == !=
         * And logico &&
         * Or logico ||
         * Ternario ? :
         * Asignacion = += -= *= /= %=
         * Ejemplo
         */
         int precedencia=2+3*4; //->14
             precedencia=(2+3)*4; //->20

         boolean logica=1>2 && 2>3; //falso














    }
}
