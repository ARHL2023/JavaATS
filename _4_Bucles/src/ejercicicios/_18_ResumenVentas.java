//Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que no se
// introduce el precio por litro. Solo existen tres productos con precios:
// 1- 0,6 $/litro
// 2- 3 $/litro
// 3- 1,25 €/litro.

package ejercicicios;
import java.util.Scanner;
public class _18_ResumenVentas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigoArticulo, cantidadLitro, litrosArticulo1 = 0, conteo600 = 0;
        double precioLitro = 0, importeFactura, facturacionTotal = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\n\tFactura " + i);

            System.out.print("Ingrese codigo de articulo: ");
            codigoArticulo = entrada.nextInt();

            System.out.print("Ingrese cantidad de litros: ");
            cantidadLitro = entrada.nextInt();

            switch (codigoArticulo) {
                case 1:
                    precioLitro = 0.60;
                    litrosArticulo1 += cantidadLitro;
                    break;

                case 2:
                    precioLitro = 3;
                    break;

                case 3:
                    precioLitro = 1.25;
                    break;

                default:
                    System.out.println("Codigo de articulo incorrecto");
            }

            importeFactura = cantidadLitro * precioLitro;
            facturacionTotal += importeFactura;

            if (importeFactura > 600) {
                conteo600++;
            }
        }

        System.out.println("\nfacturacionTotal = " + facturacionTotal);
        System.out.println("litrosArticulo1 = " + litrosArticulo1);
        System.out.println("conteo600 = " + conteo600);
    }
}