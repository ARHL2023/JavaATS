import java.util.Scanner;

public class Integrador1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int menu, codigoProducto;
        int cantidad, cantidadVentas = 0, cantidadProductosVendidos=0;
        double precioUnitario = 0, importe, descuento = 0, porcentajeDescuento = 0.10, total = 0;
        double facturacionTotal = 0, ventaMayor=0;
        int ventaMayor50=0, totalUnidadesProducto1=0;
        boolean ventaMayor100=false;

        do {

            System.out.println("\n*****TIENDA*****");
            System.out.println("1. Registrar Venta");
            System.out.println("2. Mostrar Resumen");
            System.out.println("3. Salir");

            System.out.print("\nIngrese una opcion: ");
            menu = entrada.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("\nRegistrar venta");
                    System.out.println("1. Desifectante");
                    System.out.println("2. Detergente");
                    System.out.println("3. Jabon");

                    do {
                        System.out.print("Ingrese codigo de producto: ");
                        codigoProducto = entrada.nextInt();

                        switch (codigoProducto) {

                            case 1:
                                System.out.println("elijio producto 1");
                                precioUnitario = 2.50;

                                break;

                            case 2:
                                System.out.println("elijio producto 2");
                                precioUnitario = 3.00;
                                break;

                            case 3:
                                System.out.println("elijio producto 3");
                                precioUnitario = 1.50;
                                break;

                            default:
                                System.out.println("Codigo de producto incorrecto");
                        }

                    } while (codigoProducto < 1 || codigoProducto > 3);

                    do {
                        System.out.print("Ingrese la cantidad:");
                        cantidad = entrada.nextInt();

                        if (cantidad <=0) {
                            System.out.println("Cantidad debe ser mayor a 0");
                        }
                    } while (cantidad <=0);

                    //total cantidad de ventas
                    if (codigoProducto >= 1 && codigoProducto <= 3) {
                        cantidadVentas++;
                    }

                    //total productos vendidos
                    cantidadProductosVendidos+=cantidad;

                    importe = precioUnitario * cantidad;

                    //descuento
                    if (importe > 50) {
                        descuento = importe * porcentajeDescuento;
                    } else {
                        descuento = 0;
                    }

                    total = importe - descuento;

                    //venta mayor
                    if(total>ventaMayor){
                        ventaMayor=total;
                    }

                    //unidades producto1
                    if (codigoProducto == 1) {
                        totalUnidadesProducto1 += cantidad;
                    }

                    System.out.println("Importe: " + importe);
                    System.out.println("Descuento: " + descuento);
                    System.out.println("Total: " + total);

                    //venta mayor a $50
                    if(importe>50){
                        ventaMayor50++;
                    }

                    //facturacion total
                    facturacionTotal += total;

                    //venta mayor a 100
                    if(total>100){
                        ventaMayor100=true;
                    }

                    break;

                case 2:
                    System.out.println("*****RESUMEN VENTAS*****");
                    System.out.println("Ventas realizadas: " + cantidadVentas);
                    System.out.println("Facturacion total: " + facturacionTotal);
                    System.out.println("Productos vendidos: "+cantidadProductosVendidos);
                    System.out.println("Venta Mayor: "+ventaMayor);
                    System.out.println("Ventas mayores a $50: "+ventaMayor50);
                    System.out.println("Unidades de producto 1: "+totalUnidadesProducto1);
                    System.out.println("¿Hubo una venta mayor a $100?: "+ventaMayor100);
                    break;

                case 3:
                    System.out.println("Gracias por su visita");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }//switch menu principal

        } while (menu != 3); // do while menu principal


    }
}