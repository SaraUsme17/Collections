/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioPaises {
    
    HashSet<String> nombresPais = new HashSet();
    Scanner leer = new Scanner(System.in);
    
    public Paises crear(){
        Paises pais = new Paises();
        System.out.println("Ingrese el nombre del país");
        pais.setNombre(leer.next());
        nombresPais.add(pais.getNombre());
        return pais;

    }
    
    public void fabrica(){
        String res;
        do {
            crear();
            System.out.println("Desea ingresar otro país (s/n)");
            res = leer.next();
            System.out.println("Pais ingresado correctamente");
        } while (res.equalsIgnoreCase("s"));
        
    }
    
    public void mostrar(){
        for (String np : nombresPais) {
            System.out.println(np);
        }
    
    }
    
    public void ordenarAlfabeticamente(){
    ArrayList<String> paisesAlfa = new ArrayList(nombresPais);
    Collections.sort(paisesAlfa);
    
        System.out.println("Los paises ordenados alfabéticamente son");
        
        for (String sn : paisesAlfa) {
            System.out.println(sn);
            
        }
    
    }
    
    public void eliminar() {
        System.out.println("Ingrese el nombre del pais que desea eliminar");
        String res = leer.next();
        if (nombresPais.contains(res)) {
            Iterator<String> it = nombresPais.iterator();
            while (it.hasNext()) {
                if (it.next().equals(res)) {
                    it.remove();
                }

            }

            System.out.println("El Pais ha sido eliminado");
        }else{
        System.out.println("El Pais no ha sido encontrado");
        }

    
    }
}
