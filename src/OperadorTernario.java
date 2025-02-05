import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Es un operador que evalua una condicion y su comportamiento si es true o false
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese una edad");
        byte edad=sn.nextByte();
        String mensaje=edad>=18 ? "Puedes pasar al PUB":"Espera cumplir 18 años";
        System.out.println(mensaje);
        sn.close();









    }
}

