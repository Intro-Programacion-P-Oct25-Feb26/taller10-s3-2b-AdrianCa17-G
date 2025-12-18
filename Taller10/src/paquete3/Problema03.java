/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };

        int zonasFallidas[] = new int[sensores.length];
        int zonasPerfectas = 0;

        String reporte = "";

        for (int i = 0; i < sensores.length; i++) {
            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j] == false) {
                    zonasFallidas[i] = zonasFallidas[i] + 1;
                }

            }
        }
        for (int i = 0; i < zonasFallidas.length; i++) {
            if (zonasFallidas[i] == 0) {
                zonasPerfectas = zonasPerfectas + 1;
            } else {
                reporte = String.format("%sZona %d presenta %d fallos\n", reporte,i+1, zonasFallidas[i]);
            }
        }
        reporte = String.format("%sZona que funciona sin fallos: %d\n", reporte, zonasPerfectas);
        System.out.println(reporte);
    }

}
