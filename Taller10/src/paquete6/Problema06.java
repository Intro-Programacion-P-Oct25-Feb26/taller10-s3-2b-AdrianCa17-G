/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] valoresNumericos = new int[5][6];
        int[][] matrizResultante = new int[5][6];
        int valorIngresado;
        int numero;

        System.out.println("Ingreso un numero entero o real para realizar la multiplicacion");
        numero = entrada.nextInt();

        System.out.println("Ingreso de datos de la matriz");
        for (int i = 0; i < valoresNumericos.length; i++) {
            for (int j = 0; j < valoresNumericos[i].length; j++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        i, j);
                valorIngresado = entrada.nextInt();
                valoresNumericos[i][j] = valorIngresado;

                matrizResultante[i][j] = valoresNumericos[i][j] * numero;
            }
            System.out.println();
        }

        System.out.println("Presentación de valores de la matriz original");
        for (int i = 0; i < valoresNumericos.length; i++) {
            for (int j = 0; j < valoresNumericos[i].length; j++) {
                System.out.printf("%d\t", valoresNumericos[i][j]);
            }
            System.out.println();
        }

        System.out.println("Presentación de valores de la matriz resultante");
        for (int i = 0; i < matrizResultante.length; i++) {
            for (int j = 0; j < matrizResultante[i].length; j++) {
                System.out.printf("%d\t", matrizResultante[i][j]);
            }
            System.out.println();
        }
    }
}
