/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        String dato = "";
        String reporte = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                String letra = estudiantes[i][j].substring(0, 1);

                switch (letra) {
                    case "S":
                    case "P":
                    case "T":
                        dato = estudiantes[i][j];
                        reporte = String.format("%sEstudiantes que empiezan con la letra S, P o T: %s\n", reporte, dato);
                        break;
                    default:
                        estudiantes[i][j] = "Invalido";
                }
            }
        }

        System.out.println(reporte);

    }
}
