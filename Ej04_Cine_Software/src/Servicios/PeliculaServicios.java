
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicios {
    
    private final ArrayList<Pelicula> listaPeliculas;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public PeliculaServicios()   {
        this.listaPeliculas = new ArrayList();       
    }
    
    public Pelicula crearPelicula()    {
        
        Pelicula p;
        
        p = new Pelicula();
        System.out.println("------- Datos de la pelicula -------");
        System.out.print("Ingrese el titulo de la pelicula: ");
        p.setTitulo(leer.next());
        System.out.println();
        System.out.print("Ingrese el director de la pelicula: ");
        p.setDirector(leer.next());
        System.out.println();
        System.out.print("Ingrese la duracion (en horas) de la pelicula: ");
        p.setDuracion(leer.nextInt());
        System.out.println();                     
        return p;
    }
    
    public void MostrarPelicula(Pelicula p) {
        
        System.out.println("------ Datos de la pelicula -------");
        System.out.println("Titulo: "+p.getTitulo());
        System.out.println("Director: "+p.getDirector());
        System.out.println("Duracion: "+p.getDuracion().toString());       
    }
    
     public void MostrarListaPeliculas() {
        
        int cont = 0;
        for (Pelicula p : listaPeliculas)   {
            cont = cont + 1;
            System.out.println("-------------------------------");
            System.out.println("----- Pelicula N#"+cont+" -----");
            MostrarPelicula(p);
        }
        System.out.println("-------------------------------");
    }
     
    public void AgregarPeliculasLista()   {
        
        boolean continuar = true;
        boolean correcto;
        String opcion; 
        int cont = 0;
        System.out.println("--- Cargando Peliculas ---"); 
        do  {
                cont = cont + 1;
                System.out.println("--- Pelicula #"+cont+" ---");
                this.listaPeliculas.add(crearPelicula());  
                correcto = true; 
                do {
                    System.out.print("Desea continuar ingresando peliculas? (s/n): ");
                    opcion = leer.next();
                    switch (opcion) {
                        case "s" : 
                                    System.out.println("Ok, continuamos...");
                                    correcto = false;
                                    break;
                        case "n" :
                                    System.out.println("Ok, terminamos...");
                                    correcto = false;
                                    continuar = false;
                                    break;
                        default  : 
                                    System.out.println("La opcion ingresada no es correcta. Por favor, coloque una opcion correcta...");                
                    }
                } while (correcto);       
        } while (continuar);        
    }
    
}
