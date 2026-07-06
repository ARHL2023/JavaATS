//Ejercicio 6:
// Hacer un programa que calcule el cuadrado de una suma.

package ejercicios;
public class _6_CuadradoSuna {

    public static void main(String[] args) {

        double a = 10, b = 3;
        double cuadrado;

        cuadrado =  Math.pow(a, 2) + Math.pow(b, 2) + (2 * (a * b));
        System.out.println("cuadrado = " + cuadrado);

    }
}