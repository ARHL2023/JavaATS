//Ejercicio 4:
//        Una compañía de venta de carros  usados, paga a su personal de ventas un salario  de $1000 mensuales,
//        mas una comisión de  $150 por cada carro vendido,
//        más el 5% del  valor de la venta por carro.
//        Cada mes el  capturista de la empresa ingresa en la  computadora los datos pertinentes.
//        Hacer un  programa que calcule e imprima el salario  mensual de un vendedor dado.

package ejercicios;

import java.util.Scanner;

public class _4_VentaCarros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario = 1000, comision = 150, porcentajeVentaCarro = 0.05;
        double salarioMensual;
        double totalPreciosVehiculos;
        int cantidadCarrosVendidos;


        System.out.println("Ingrese la cantidad de carros vendidos: ");
        cantidadCarrosVendidos = entrada.nextInt();

        System.out.println("Ingrese el total de los vehiculos vendidos: ");
        totalPreciosVehiculos = entrada.nextInt();

        salarioMensual = salario + (comision * cantidadCarrosVendidos) + (totalPreciosVehiculos * porcentajeVentaCarro);


        System.out.println("salarioMensual = " + salarioMensual);

    }
}