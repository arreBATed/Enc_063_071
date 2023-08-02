
package ej_01_raza_perros;

import Servicios.RazaServicios;
import java.util.Scanner;

public class Ej_01_Raza_Perros {

    public static void main(String[] args) {
                
            RazaServicios razaList = new RazaServicios();
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
            String nombreRaza;
            String opcion;
            boolean continuar = true;
            do  {
                System.out.print("Ingrese una raza de perro a la lista: ");
                nombreRaza = leer.next();
                razaList.agregarRazaLista(nombreRaza);
                System.out.println();
                System.out.print("Desea continuar agregando razas a la lista?(s/n): ");
                opcion = leer.next();
                if (opcion.equalsIgnoreCase("n"))   {
                    continuar = false;
                }                
            } while(continuar);
            System.out.println();
            System.out.print("Las razas de perros ingresadas fueron: ");
            razaList.mostrarListaRazas();            
    }
    
}
