/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author UTPL
 */
public class Problema08 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        //                  00  01  02 10  11 12
        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};

        //                  00  01  02  10  11 12
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
         */

        String mensaje = "";

        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                if (j <= i) {
                    mensaje = String.format("%s%.0f\t", mensaje, dato1[i][j]);
                } else {
                    mensaje = String.format("%s%.0f\t", mensaje, dato2[i][j]);
                }

            }
            mensaje = String.format("%s\n", mensaje);
        }
        System.out.println(mensaje);
    }
}
