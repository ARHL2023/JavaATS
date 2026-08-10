//Ejercicio 17: Una empresa que se dedica a la venta  de desinfectantes necesita un programa para
//        gestionar las facturas. En cada factura figura: el  código del artículo, la cantidad vendida en litros y el
//        precio por litro. Se pide de 5 facturas introducidas:
//        Facturación total, cantidad en litros vendidos del  artículo 1 y cuantas facturas se emitieron de más de  $600.
package ejercicicios;
import java.util.Scanner;
public class _17_ResumenVentas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigoArticulo, cantidadLitro, litrosArticulo1 = 0, conteo600=0;
        double precioLitro, importeFactura, facturacionTotal = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\n\tArticulo " + i);
            System.out.print("Ingrese codigo de articulo: ");
            codigoArticulo = entrada.nextInt();
            System.out.print("Ingrese cantidad de litros: ");
            cantidadLitro = entrada.nextInt();
            System.out.print("Ingrese precio por litro: ");
            precioLitro = entrada.nextDouble();

            importeFactura = cantidadLitro * precioLitro;
            facturacionTotal += importeFactura;

            if (codigoArticulo == 1) {
                litrosArticulo1 += cantidadLitro;
            }

            if(importeFactura>600){
                conteo600++;
            }
        }

        System.out.println("facturacionTotal = " + facturacionTotal);
        System.out.println("litrosArticulo1 = " + litrosArticulo1);
        System.out.println("conteo600 = " + conteo600);

    }
}