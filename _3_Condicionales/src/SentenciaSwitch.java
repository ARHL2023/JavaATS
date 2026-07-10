//        switch (dato)
//        case 1: Intruccion1;
//        break;
//
//        case n: Intruccion1;
//        break;
//
//        default: CasoContrario;
//        break;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dato;

        System.out.println("Ingrese un numero entre 1 y 5: ");
        dato = entrada.nextInt();

        switch (dato) {
            case 1:
                System.out.println("Es el numero 1");
                break;
            case 2:
                System.out.println("Es el numero 2");
                break;
            case 3:
                System.out.println("Es el numero 3");
                break;
            case 4:
                System.out.println("Es el numero 4");
                break;
            case 5:
                System.out.println("Es el numero 5");
                break;

            default:
                System.out.println("No ingreso un numero entre 1 y 5");
        }

    }
}
