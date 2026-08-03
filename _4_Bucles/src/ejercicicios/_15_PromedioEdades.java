//Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la
//        cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de  1.75
package ejercicicios;
import java.util.Scanner;
public class _15_PromedioEdades {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double estatura, edadMedia=0, estaturaMedia=0;
        int edad, contMayores=0, contEstatura=0;

        for (int i = 1; i <=5 ; i++) {
            System.out.print("\nIngrese edad estudiante "+i+" : ");
            edad = entrada.nextInt();
            System.out.print("Ingrese estatura estudiante "+i+" : ");
            estatura = entrada.nextDouble();

            if(edad>18){
                contMayores++;
            }
            if(estatura>1.75){
                contEstatura++;
            }

            edadMedia+=edad;
            estaturaMedia+=estatura;

        }

        edadMedia = edadMedia / 5;
        estaturaMedia = estaturaMedia / 5;

        System.out.println("\ncontMayores = " + contMayores);
        System.out.println("contEstatura = " + contEstatura);
        System.out.println("edadMedia = " + edadMedia);
        System.out.println("estaturaMedia = " + estaturaMedia);

    }
}
