//Ejercicio 9: Pedir el día, mes y
//        año de una fecha e indicar si la  fecha es correcta.
//        Suponiendo  que todos los meses son de 30  días.

package Ejercicios;

import java.util.Scanner;

public class _9_FechaCorrecta {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes, anio;

        System.out.println("Ingrese dia: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese mes: ");
        mes = entrada.nextInt();
        System.out.println("Ingrese año: ");
        anio = entrada.nextInt();

        if ((dia >= 1) && (dia <= 30)) {
            if ((mes >= 1) && (mes <= 12)) {
                if (anio != 0) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("La fecha es incorrecta, año incorrecto");
                }

            } else {
                System.out.println("La fecha es incorrecta, mes incorrecto");
            }

        } else {
            System.out.println("La fecha es incorrecta, dia incorrecto");
        }

    }
}