/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

        int[] dias = new int[5];

        String reporte = "";

        for (int i = 0; i < asistencia.length; i++) {

            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j]) {
                    dias[i] = dias[i] + 1;
                }

            }
        }
        for (int i = 0; i < estudiantes.length; i++) {

            reporte = String.format("%sEstudiante: %s", reporte, estudiantes[i]);
            reporte = String.format("%s -- Dias asistidos %s -- ", reporte, dias[i]);

            if (dias[i] == 5) {
                reporte = String.format("%sAsistio todos los dias\n", reporte);
            } else {
                reporte = String.format("%sNo asistio todos los dias\n", reporte);
            }
        }
        System.out.println(reporte);
    }

}
