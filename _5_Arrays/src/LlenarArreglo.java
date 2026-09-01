import java.util.Scanner;

public class LlenarArreglo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = entrada.nextInt();

        int arreglo[] = new int[tamaño];

        //llena el arreglo
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        //muestra el arreglo
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Inidice " + i + ": " + arreglo[i]);
        }

    }
}