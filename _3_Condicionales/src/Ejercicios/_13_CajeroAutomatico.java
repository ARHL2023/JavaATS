//Ejercicio 13: Hacer un programa que simule un  cajero automático con un saldo inicial de 1000  Dólares,
//        con el siguiente menú de opciones:
//        1. Ingresar dinero a la cuenta
//        2. Retirar dinero de la cuenta
//        3. Salir
package Ejercicios;

import java.util.Scanner;

public class _13_CajeroAutomatico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double saldoInicial = 1000, monto, saldoFinal;

        System.out.println("1. Ingresar dinero a la cuenta" +
                "\n2. Retirar dinero de la cuneta" +
                "\n3. Salir" +
                "\nOpcion:");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingresar monto: ");
                monto = entrada.nextDouble();
                saldoFinal = saldoInicial + monto;
                System.out.println("saldoFinal = " + saldoFinal);
                break;

            case 2:

                System.out.println("Ingresar monto: ");
                monto = entrada.nextDouble();

                if (monto > saldoInicial) {
                    System.out.println("No tiene suficiente saldo");
                } else {
                    saldoFinal = saldoInicial - monto;
                    System.out.println("saldoFinal = " + saldoFinal);
                }
                break;

            case 3:
                System.out.println("Vuelva pronto");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

    }
}