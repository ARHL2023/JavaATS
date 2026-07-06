import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float n1, n2;
        float suma, resta, multiplicacion, division, resto;

        System.out.println("Ingrese primer numero:");
        n1 = entrada.nextFloat();

        System.out.println("Ingrese segundo numero: ");
        n2 = entrada.nextFloat();

        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        division = n1 / n2;
        resto = n1 % n2;

        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("division = " + division);
        System.out.println("division = " + division);
        System.out.println("resto = " + resto);

    }
}