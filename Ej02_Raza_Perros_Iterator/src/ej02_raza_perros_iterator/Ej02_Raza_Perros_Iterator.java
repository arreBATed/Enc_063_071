package ej02_raza_perros_iterator;

import Servicios.RazaServicios;
import java.util.Scanner;

public class Ej02_Raza_Perros_Iterator {


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
        System.out.println();
        System.out.print("Ingrese una raza por teclado para eliminar: ");
        nombreRaza = leer.next();
        razaList.buscarRazaEliminar(nombreRaza);
        System.out.println();
        System.out.print("Ahora las razas de perros de la lista son: ");
        razaList.mostrarListaRazas(); 
        System.out.println();
           
    }
    
}
