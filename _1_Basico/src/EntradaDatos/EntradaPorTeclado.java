package EntradaDatos;

import java.util.Scanner;

public class EntradaPorTeclado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;
        float peso;
        String nombres;
        char caracter;

        System.out.println("Ingrese sus nombres:");
        nombres = entrada.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();

        System.out.println("Ingrese su peso: ");
        peso = entrada.nextFloat();

        System.out.println("Ingrese ultimo digito de cedula: ");
        caracter = entrada.next().charAt(0);

        System.out.println("\nnombres = " + nombres);
        System.out.println("edad = " + edad);
        System.out.println("peso = " + peso);
        System.out.println("caracter = " + caracter);


    }
}
