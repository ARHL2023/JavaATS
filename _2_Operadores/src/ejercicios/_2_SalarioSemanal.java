//Ejercicio 2: Hacer un  programa que calcule e  imprima el salario semanal  de un empleado
// a partir de  sus  horas  semanales  trabajadas y de su salario  por hora.

package ejercicios;

import java.util.Scanner;

public class _2_SalarioSemanal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double horasTrabajadas, salarioHora, salarioSemanal;

        System.out.println("Ingre el total de las horas trabajadas: ");
        horasTrabajadas = entrada.nextDouble();
        System.out.println("Ingre su salario por hora: ");
        salarioHora = entrada.nextDouble();

        salarioSemanal = salarioHora*horasTrabajadas;

        System.out.println("\nsalarioSemanal = " + salarioSemanal);

    }
}