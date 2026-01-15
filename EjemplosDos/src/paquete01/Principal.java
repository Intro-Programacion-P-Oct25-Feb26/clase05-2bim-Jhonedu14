/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoTrabajo;
import paquete06.Presentacion;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        
        double[] misNotas;
        double promedio;
       
        String nombreEmpresa;
        String direccionEmpresa;
        
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        nombreEmpresa= DatoTrabajo.ObtenerNombreEmpresa();
        direccionEmpresa= DatoTrabajo.direccionEmpresa();
        
        Presentacion.imprimir(nombre, apellidoRetornado, ciudad, misNotas,
                promedio, nombreEmpresa, direccionEmpresa);
        
        
       
    }
    
}
/*
La problematica primero importa de los  demas paquetes para la resolucion del 
problema mediante las funciones y cada funcion retorna un valor de dicha 
funcion y esta presentando una solucion con el nombre, el apellido, ciudad, 
y  al ingresar las 4 notas va a calcular el promedio de las notas.
*/

