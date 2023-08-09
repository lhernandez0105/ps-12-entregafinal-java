package B3;

import javax.swing.*;

public class Tarea {
        public static void main(String[] args) {

            int intentos = 0;

            while (intentos < 3) {

                //Pido el usuario y contraseña

                String usuario = JOptionPane.showInputDialog(null, "Ingrese su Usuario: ");
                String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");

                //Condicional correcto

                if (usuario.equals("Usuario") && contrasena.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Ingreso con éxito");
                    intentos = 0;

                    //Muestro el menu
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                            "Menú:\n1. Hackear la nasa \n2. Comprar una hamburguesa \n3. Mostrar que dia es hoy"));

                    switch (opcion) {

                        case 1:
                            JOptionPane.showMessageDialog(null, "Ingreso con éxito a la nasa \n (no hay cohetes disponibles a marte hasta el dia martes)");

                            break;

                        case 2:
                            JOptionPane.showMessageDialog(null, "No hay hamburguesas");
                            break;

                        case 3:
                            JOptionPane.showMessageDialog(null, "¿Quieres saber el dia?");
                            JOptionPane.showMessageDialog(null, "Seguro?");
                            JOptionPane.showMessageDialog(null, "De verdad estas seguro?");
                            JOptionPane.showMessageDialog(null, "No se que dia es \nEspero haberte ayudado");
                        break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                    }

                    //condicional incorrecto

                } else {
                    intentos++;
                    if (intentos >= 3) {

                        for (int i = 0; i < 33; i++) {
                            JOptionPane.showMessageDialog(null, "Usuario bloqueado.");

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Intentos restantes: " + (3 - intentos));
                    }
                }


            }
        }
    }
