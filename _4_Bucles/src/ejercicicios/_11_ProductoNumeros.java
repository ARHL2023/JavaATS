//Ejercicio 11:
//        Diseñar un programa que muestre el producto de los 10 primeros números impares.
package ejercicicios;
public class _11_ProductoNumeros {
    public static void main(String[] args) {

        int producto=1;
        int contador = 0;

        for (int i = 0; contador <10 ; i++) {
            if(i%2!=0){
                producto*=i;
                contador++;
            }
        }

        System.out.println("producto = " + producto);

    }
}