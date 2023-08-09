package B2;

import javax.swing.*;

public class Trabajo2 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número: "));

        if (numero >= 1) {
            String pares = "";
            String impares = "";
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    pares+= i + ", ";
                } else {
                    impares+= i + ", ";
                }
            }

            JOptionPane.showMessageDialog(null, "Cantidad de números pares: " + pares.substring(0, pares.length() - 2) + "\nCantidad de números impares: " + impares.substring(0, impares.length() - 2));

        }

        else {
            JOptionPane.showMessageDialog(null, "El numero no es valido:");
        }

    }
}

