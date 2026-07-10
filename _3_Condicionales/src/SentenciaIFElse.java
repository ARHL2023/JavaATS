//        if(condicion){
//            Instruccion;
//        }
//        else {
//            Instruccion2;
//        }

import java.util.Scanner;

public class SentenciaIFElse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, dato = 5;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        // ES IGUAL O NO
        if(numero==dato){
            System.out.println("El numero es 5");
        }
        else {
            System.out.println("El numero es diferente de 5");
        }

        //MAYOR O MENOR

        if(numero>=dato){
            System.out.println("El numero es mayor a 5");
        } else if (numero == dato) {
            System.out.println("El numero es 5");
        }
        else {
            System.out.println("El numero es menor a 5");
        }

    }
}