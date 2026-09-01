import java.util.Scanner;

public class LlenarArregloForEach {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombres[] = {"Andy","Lady","Angela","Stephanie"};

//        for (int i = 0; i < nombres.length ; i++) {
//            System.out.println(nombres[i]);
//        }

        for(String i: nombres){
            System.out.println("Nombres: "+i);
        }

    }
}