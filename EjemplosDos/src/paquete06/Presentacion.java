/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author USUARIO
 */
public class Presentacion {
    
    public static void imprimir(String nombre, String apellido, String ciudad,
            double[] c,
            double promedio, String nombreEmpresa, String direccionEmpresa) {

        String cadenaNotas = "";

        for (int i = 0; i < c.length; i++) {
            cadenaNotas = String.format("%s%.2f ", cadenaNotas, c[i]);
        }

        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Notas registradas %s\n"
                + "Promedio: %.2f\n"
                + "Nombre de la empresa: %s\n"
                + "Direccion de la empresa: %s\n",
                nombre,
                apellido,
                ciudad,
                cadenaNotas,
                promedio,
                nombreEmpresa,
                direccionEmpresa
        );

    }

}
