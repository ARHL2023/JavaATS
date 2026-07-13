//Ejercicio 4: En MegaPlaza se  hace un 20% de descuento a los
//        clientes cuya compra supere los  $300.
//        ¿Cuál será la cantidad que  pagará una persona por su  compra?
package Ejercicios;

import java.util.Scanner;

public class _4_Descuento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorCompra, descuento = 0.20;

        System.out.println("Ingrese el total de la compra: ");
        valorCompra = entrada.nextDouble();

        if (valorCompra > 300) {
            valorCompra = valorCompra - (valorCompra * descuento);
            System.out.println("El monto a pagar con descuneto es: " + valorCompra);
        }
        else {
            System.out.println("El monto de su compra es: " + valorCompra);
        }

    }
}