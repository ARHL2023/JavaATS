//-Ejercicio 10: Pedir el día, mes y  año de una fecha e indicar si la
//        fecha es correcta. Con meses de  28, 30 y 31 días. Sin años  bisiestos.


package Ejercicios;

import java.util.Scanner;

public class _10_FechaCorrecta {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes, anio;

        System.out.println("Ingrese dia: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese mes: ");
        mes = entrada.nextInt();
        System.out.println("Ingrese año: ");
        anio = entrada.nextInt();

        if (anio != 0) {

            if (mes >= 1 && mes <= 12) {

                if (mes == 2 && dia >= 1 && dia <= 28) {
                    System.out.println("Fecha correcta");

                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)
                        && dia >= 1 && dia <= 30) {
                    System.out.println("Fecha correcta");

                } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7
                        || mes == 8 || mes == 10 || mes == 12)
                        && dia >= 1 && dia <= 31) {
                    System.out.println("Fecha correcta");

                } else {
                    System.out.println("La fecha es incorrecta, día incorrecto");
                }

            } else {
                System.out.println("La fecha es incorrecta, mes incorrecto");
            }

        } else {
            System.out.println("La fecha es incorrecta, año incorrecto");
        }

    }
}