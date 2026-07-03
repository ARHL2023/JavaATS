package EntradaDatos;

import javax.swing.*;

public class EntradaDatosJOptionPane {
    public static void main(String[] args) {

        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Ingrese una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero entero"));
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero decimal"));

        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal  es: "+decimal);

    }
}
