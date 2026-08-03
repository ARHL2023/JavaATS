//Ejercicio 7: Pedir números hasta  que se introduzca uno negativo, y  calcular la media.
package ejercicicios;
import java.util.Scanner;
public class _7_PromedioNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, contador = 0, suma = 0;
        double promedio = 0;

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            suma += numero;
            contador++;
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();
        }

        if(contador==0){
            System.out.println("Division entre 0 no existe");
        }
        else {
            promedio =(double) suma / contador;
        }

        System.out.println("suma = " + suma);
        System.out.println("contador = " + contador);
        System.out.println("promedio = " + promedio);

    }
}