/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int[] adultos = new int[edades.length];

        int niños = 0;

        String reporte = "";

        for (int i = 0; i < edades.length; i++) {

            for (int j = 0; j < edades[i].length; j++) {

                if (edades[i][j] >= 18) {

                    adultos[i] = adultos[i] + 1;
                } else {

                    niños = niños + 1;
                }
            }
        }

        reporte = String.format("Total de menores de edad: %s\n", niños);

        for (int i = 0; i < adultos.length; i++) {
            reporte = String.format("%sAdultos en familia %d: %s\n", reporte, i+1, adultos[i]);

        }
        System.out.println(reporte);
    }

}

