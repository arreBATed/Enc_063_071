package Servicios;

import java.util.ArrayList;
import java.util.Iterator;

public class RazaServicios {
    
    private ArrayList<String> listaRazas;
       
    public RazaServicios()   {
        this.listaRazas = new ArrayList();
    }
  
    public void agregarRazaLista(String nombreRaza)   {
        
        this.listaRazas.add(nombreRaza);        
    }      
    
    public void mostrarListaRazas() {
        
        System.out.println(this.listaRazas.toString());
    }
    
    public void buscarRazaEliminar(String r)    {
        
        Iterator  it = listaRazas.iterator();
        boolean noPresente = true;
        while ((it.hasNext()) && (noPresente))  {
            if (it.next().equals(r))    {   
                System.out.println("La raza se encuentra presente en la lista. Sera eliminada.");
                it.remove();
                noPresente = false;
            }
        }
        if (!noPresente)    {
            System.out.println("La raza no se encuentra en la lista.");
        }      
    }       
    
}
