// Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de masa,
// mostrar en pantalla un menú con las opciones posibles.
package Ejercicios;
import java.util.Scanner;
public class _14_Conversion {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double kg, resultado;
        int opcion;

        System.out.print("Ingrese la cantidad en Kg: ");
        kg = entrada.nextDouble();

        System.out.println("\nSeleccione la unidad a convertir:");
        System.out.println("1. Gramos");
        System.out.println("2. Miligramos");
        System.out.println("3. Toneladas");
        System.out.println("4. Libras");

        System.out.print("Opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                resultado = kg * 1000;
                System.out.println(kg + " Kg = " + resultado + " gramos");
                break;

            case 2:
                resultado = kg * 1000000;
                System.out.println(kg + " Kg = " + resultado + " miligramos");
                break;

            case 3:
                resultado = kg / 1000;
                System.out.println(kg + " Kg = " + resultado + " toneladas");
                break;

            case 4:
                resultado = kg * 2.20462;
                System.out.println(kg + " Kg = " + resultado + " libras");
                break;

            default:
                System.out.println("Opción incorrecta");
        }
    }
}