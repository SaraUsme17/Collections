/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Razas {
    
    private ArrayList<String> listaRazas;
    Scanner leer = new Scanner(System.in);

    public Razas() {
        listaRazas = new ArrayList();
    }
    
   
    public ArrayList agregar(){
        System.out.println("Que raza desea agregar ? ");
        String raza = leer.next();
        listaRazas.add(raza);
        System.out.println("La raza ha sido agregada con éxito");
        return listaRazas;
        
    
    }
    
    public void mostrar(){
        System.out.println(listaRazas.toString());
    
    }
    
    public void eliminar(){
        boolean found=false;
        System.out.println("Ingrese la raza de perro que desea eliminar");
        String razae = leer.next();
        Iterator<String> it  =listaRazas.iterator();
        
        while (it.hasNext()) {
//            String next = it.next();

            if (it.next().equals(razae)) {
                it.remove();
                System.out.println("la raza " + razae + " ha sido eliminada");
                found = true;            
            }
       
        } 
        
        if(!found){
            System.out.println("La raza no ha sido encontrada");
        
        }
        
        Collections.sort(listaRazas);
        System.out.println("Lista de razas ordenadas luego de eliminar una");
            for (String raza : listaRazas) {
        System.out.println(raza);
    }

    
    }
}
