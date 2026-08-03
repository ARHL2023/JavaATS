//Ejercicio 16: Pide un número (que debe estar entre 0 y 10) y
//        mostrar la tabla de multiplicar de  dicho número

package ejercicicios;
import java.util.Scanner;
public class _16_TablaDeMultiplicar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 0 y 10: ");
        int numero = entrada.nextInt();

        if(numero>=0 && numero<=10){
            for (int i = 0; i <=10 ; i++) {
                System.out.println(numero +" * "+i+" = "+(numero*i));
            }
        }

        else {
            System.out.println("No esta dentro del rango solicitado");
        }

    }
}