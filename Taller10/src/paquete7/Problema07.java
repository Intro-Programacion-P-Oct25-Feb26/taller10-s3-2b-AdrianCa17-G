/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matrizX = new int[3][3];
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int valorIngresado;
        int iguales = 0;
        String mensaje;

        System.out.println("Ingreso de datos de la matriz X");
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        i, j);
                valorIngresado = entrada.nextInt();
                matrizX[i][j] = valorIngresado;
            }
            System.out.println();
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (matrizX[i][j] + 1) * (matrizX[i][j] + 1);
            }
        }

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = (matrizX[i][j] * matrizX[i][j]) + (2 * matrizX[i][j]) + 1;
            }
        }

        System.out.println("Presentación de valores de la matriz original");
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                System.out.printf("%d\t", matrizX[i][j]);
            }
            System.out.println();
        }

        System.out.println("Calculo y presentacion de ecuacion de matriz X en matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("%d\t", matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println("Calculo y presentacion de ecuacion de matriz X en matriz B");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("%d\t", matrizB[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                if(matrizA[i][j] == matrizB[i][j]){
                    iguales = iguales + 1;
                }
                    
            }
        }
        
        if(iguales == 9){
            mensaje = "La identidad algebraica de matriz A como matriz B se cumple";
        }else{
            mensaje = "La identidad algebraica de matriz A como matriz B no se cumple";
        }
        
        System.out.println("\n"+mensaje);

    }
}
