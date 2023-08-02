
package ej04_cine_software;

import Servicios.PeliculaServicios;
import java.util.Scanner;


public class Ej04_Cine_Software {

    public static void main(String[] args) {
        
        PeliculaServicios pS = new PeliculaServicios();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        pS.AgregarPeliculasLista();        
        System.out.println(".. ya se ha cargado la lista de peliculas. A continuacion la lista es la siguiente: ");        
        pS.MostrarListaPeliculas();
        System.out.println("Vamos a buscar un alumno para promediar sus notas....");

    
    }
    
}
