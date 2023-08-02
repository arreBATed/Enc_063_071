package Servicios;

import java.util.ArrayList;

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
    
}
