//Ejercicio 5:
//        Un obrero necesita calcular su salario  semanal, el cual se obtiene de la siguiente manera:
//        Si trabaja 40 horas o menos se le paga $16 por hora
//        Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora  extra.

package Ejercicios;

import java.util.Scanner;

public class _5_SalarioSemanal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int horasTrabajadas;
        double salarioSemanal;

        System.out.println("Ingrese el total de horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();

        if(horasTrabajadas<=40){
            salarioSemanal = horasTrabajadas*16;
        }
        else {
            salarioSemanal = (40*16)+((horasTrabajadas-40)*20);
        }

        System.out.println("salarioSemanal = " + salarioSemanal);

    }
}