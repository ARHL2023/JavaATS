//Ejercicio 8:
//        Construir un programa que  calcule y muestre por pantalla las raíces de
//        de la ecuación de  segundo grado
//        de coeficientes reales.
//
//        ax^2 + bx + c = 0

package ejercicios;

public class _8_EcuacionSegundoGrado {
    public static void main(String[] args) {

        double a = 1, b = -5, c = 6;
        double x1,x2;

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * (a * c)))/(2*a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * (a * c)))/(2*a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }
}
