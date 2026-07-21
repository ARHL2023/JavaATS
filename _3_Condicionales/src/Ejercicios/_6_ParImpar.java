//Ejercicio 6: Hacer un programa
//        que tome dos números y diga si  ambos son pares o impares.

package Ejercicios;

import java.util.Scanner;

public class _6_ParImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Ingrese primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese segundo numero: ");
        numero2 = entrada.nextInt();

        if(numero1 % 2 == 0  && numero2 % 2 == 0){
            System.out.println("Ambos numeros son pares");
        }
        else if (numero1 % 2 != 0  &&  numero2 % 2 != 0) {
            System.out.println("Ambos numeros son impares");
        }
        else {
            System.out.println("Almenos un numero es impar");
        }

    }
}