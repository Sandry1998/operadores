public class Logicos {
    public static void main(String[] args) {
        //Operador logico and -> &&

        int a=5, b=10, c=15;
        // si x=true y=true -> resultado es -> true
        boolean resultado=(a > b) && (c < b); //5<10 y 15>10
        System.out.println("(a < b) && (c < b) ->" +resultado);
        // en el resto de supuesto, donde alguna de las partes sea false, el resultado sera false
        resultado=(a==b)&&(b<c); //false
        System.out.println("(a==b)&&(b<c)->"+resultado);

        //Operador logico or -> ||
        resultado=(a!=b)||(c!=b); //true
        System.out.println("(a!=b) || (c!=b)->"+resultado);
        resultado=(a==b)||(b<c); //true
        System.out.println("(a==b) || (b<c)->"+resultado);
        resultado=(a==b)||(b==c); //false
        System.out.println("(a==b) || (b==c)->"+resultado);

        //Operador de negacion !
        resultado=!(a<b);
        System.out.println("!(a<b)->"+resultado);




    }
}
