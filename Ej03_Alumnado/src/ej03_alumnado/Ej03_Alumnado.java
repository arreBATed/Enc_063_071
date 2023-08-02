
package ej03_alumnado;

import Servicios.AlumnoServicios;
import java.util.Scanner;

public class Ej03_Alumnado {

    public static void main(String[] args) {
        
        AlumnoServicios aS = new AlumnoServicios();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        aS.AgregarAlumnosLista();        
        System.out.println(".. ya se ha cargado la lista de alumnos. A continuacion la lista es la siguiente: ");        
        aS.MostrarListaAlumnos();
        System.out.println("Vamos a buscar un alumno para promediar sus notas....");
        System.out.print("Ingrese el nombre del aliumno: ");
        String nombreAlumno = leer.next();
        aS.BuscarAlumnoaPromediar(nombreAlumno);
    }
    
}
