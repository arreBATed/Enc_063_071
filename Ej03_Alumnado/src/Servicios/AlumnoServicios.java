
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoServicios {
    
    private final ArrayList<Alumno> listaAlumnos;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
    public AlumnoServicios()   {
        this.listaAlumnos = new ArrayList();       
    }
    
    public void AgregarAlumnosLista()   {
        
        boolean continuar = true;
        boolean correcto;
        String opcion; 
        int cont = 0;
        System.out.println("--- Cargando Alumnos ---"); 
        do  {
                cont = cont + 1;
                System.out.println("--- Alumno #"+cont+" ---");
                this.listaAlumnos.add(crearAlumno());  
                correcto = true; 
                do {
                    System.out.print("Desea continuar ingresando alumnos? (s/n): ");
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
    
    public void MostrarListaAlumnos() {
        
        int cont = 0;
        for (Alumno a : listaAlumnos)   {
            cont = cont + 1;
            System.out.println("----- Alumno N#"+cont+" -----");
            MostrarAlumno(a);
        }
    }
    
    public Alumno crearAlumno()    {
        
        Alumno a;
        ArrayList<Integer> auxInteger = new ArrayList();
        int aux;
        
        a = new Alumno();
        System.out.println("Datos del alumno -------");
        System.out.print("Ingrese el nombre del alumno: ");
        a.setNombre(leer.next());
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el valor entero de la #"+(i+1)+" nota: ");
            aux = leer.nextInt();
            auxInteger.add(aux);
        }  
        a.setListaNotas(auxInteger);               
        return a;
    }
    
    public void MostrarAlumno(Alumno a) {
        
        System.out.println("Datos del alumno -------");
        System.out.println("Ingrese el nombre del alumno: "+a.getNombre());
        System.out.println("Notas: ");
        System.out.println(". Nota #1: "+a.getListaNotas().get(0));
        System.out.println(". Nota #2: "+a.getListaNotas().get(1));
        System.out.println(". Nota #3: "+a.getListaNotas().get(2));        
    }
    
    public Integer notaFinal(Alumno a)  {
        
        Integer promedio;
        
        promedio = (a.getListaNotas().get(0) + a.getListaNotas().get(1) + a.getListaNotas().get(2)) / 3;
        return promedio;
    }
    
    public void BuscarAlumnoaPromediar(String nombAlumno) {
        
        boolean ausente = true;
        for (Alumno a : listaAlumnos)   {
            if (a.getNombre().equals(nombAlumno))   {
                System.out.println("El promedio de notas del alumno es "+notaFinal(a).toString());
                ausente = false;
                break;
            }
        }
        if (ausente)    {
            System.out.println("El alumnbo no se encuentra en el listado.");
        }
    }
        
}
