
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
        boolean continuar = true;
        int opcion;
        do {
            System.out.println("------ Ordenamiento de lista de peliculas ---------");
            System.out.println("1.- Ordenar la lista de peliculas por duracion de mayor a menor. ");
            System.out.println("2.- Ordenar la lista de peliculas por duracion de menor a mayor. ");
            System.out.println("3.- Ordenar la lista de peliculas alfabeticamente por titulos. ");
            System.out.println("4.- Ordenar la lista por duracion alfabeticamente por directores. ");
            System.out.println("5.- Salir. ");
            System.out.print("Ingrese el numero de opcion (1-5): ");
            opcion = leer.nextInt();
            switch (opcion)   {
                    case 1  : 
                                pS.OrdenarPelisDeMayorAMenorDuracion();
                                System.out.println();
                                pS.MostrarListaPeliculas();
                                break;
                    case 2  :
                                pS.OrdenarPelisDeMenorAMayorDuracion();
                                System.out.println();
                                pS.MostrarListaPeliculas();
                                break;
                    case 3  :
                                pS.OrdenarPelisAlfabeticamentePorTitulo();
                                System.out.println();
                                pS.MostrarListaPeliculas();
                                break;
                    case 4  :
                                pS.OrdenarPelisAlfabeticamentePorDirector();
                                System.out.println();
                                pS.MostrarListaPeliculas();
                                break;
                    case 5  :
                                System.out.println("Gracias por utilizar el programa");
                                continuar = false;
                                break;
                    default :
                                System.out.println("La opcion elegida no es correcta. Intente nuevamente....");
            }            
        } while (continuar);
    
    }
    
}
