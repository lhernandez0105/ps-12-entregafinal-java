package B4;

import javax.swing.*;

public class TrabajoEnClase {
    public static void main(String[] args) {
        int intentos = 0;
        int resultado = 0;



        while (intentos < 3) {

            int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer un número: "));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo número: "));

            try {

            if (valor1== 0){
                throw new Exception("El Primer numero no debe ir vacio");

            }
            if (valor2== 0){
                throw new Exception("El Segundo numero no debe ir vacio");

            }


                resultado = valor1 / valor2;

            }catch (Exception ElError){

                JOptionPane.showMessageDialog(null, ElError.getMessage());
        }

            finally {
            JOptionPane.showMessageDialog(null, "el resultado es: " + resultado);

        }

        }            JOptionPane.showMessageDialog(null, "Calculadora.exe ha dejado de funcionar");



    }
    }
