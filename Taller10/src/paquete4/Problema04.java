/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] a = new int[3][2];
        int[][] b = new int[3][2];
        int valorIngresado;
        int matrizMayor = 0;
        int matrizMayor2 = 0;
        String mensaje;
        
        System.out.println("Ingreso de datos del arreglo a");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        i, j);
                valorIngresado = entrada.nextInt();
                a[i][j] = valorIngresado;
            }
            System.out.println();
        }

  
        System.out.println("Ingreso de datos del arreglo b");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        i, j);
                valorIngresado = entrada.nextInt();
                b[i][j] = valorIngresado;
            }
            System.out.println();
        }
        
        System.out.println("Presentación de valores del arreglo a");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Presentación de valores del arreglo b");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%d\t", b[i][j]);
            }
            System.out.println();
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] >= b [i][j]){
                    matrizMayor = matrizMayor + 1;
                }
                
                if(a[i][j] > b [i][j]){
                    matrizMayor2 = matrizMayor2 + 1;
                }
            }

        }
        
        if(matrizMayor == 6 && matrizMayor2 >= 1){
            mensaje = "La matriz A es mayor que la matriz B";
        }else{
            mensaje = "La matriz A no es mayor que la matriz B";
        }
        
        System.out.println("\n" + mensaje);

    }

}
