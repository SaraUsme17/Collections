/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Codigo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CodigoServicio {
    Scanner leer = new Scanner(System.in);
    HashMap<Integer, String> listaciudades;

    public CodigoServicio() {
        
        listaciudades = new HashMap();
    }
    
    public void crear(){
        Codigo codigo = new Codigo();
        System.out.println("Ingrese el código postal");
        codigo.setCodigos(leer.nextInt());
        System.out.println("Ingrese el nombre de la ciudad");
        codigo.setNombre(leer.next());
        listaciudades.put(codigo.getCodigos(), codigo.getNombre());
    }
    
    public void fabrica(){
        String resp;
        
        do {
            crear();
            System.out.println("Desea ingresar otra ciudad (S/N)");
            resp = leer.next();
            
            while(!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")){
                System.out.println("Respuesta incorrecta. Ingrese (S/N)");
                resp = leer.next();
             
            }
            

            
            System.out.println("Ciudad agregada con éxito");
            
        } while (resp.equalsIgnoreCase("s"));
    
    }
    
    public void mostrar(){
        
            for (Map.Entry<Integer, String> entry : listaciudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Código postal: " + key + " País: " + value);
            
        }

    }
    
        public void buscar(){
        boolean resp = false;
        System.out.println("Ingrese el código postal de la ciudad que desea buscar");
        Integer res = leer.nextInt();
        for (Map.Entry<Integer, String> entry : listaciudades.entrySet()) {
            if(entry.getKey().equals(res)){
                System.out.println("Código postal: " + entry.getKey() + " País: " + entry.getValue());
                resp = true;
                System.out.println("Ciudad encontrada con éxito");
            
            }
            
        }
        
        if(!resp){
            System.out.println("La ciudad no ha sido encontrada");
        }

    }
        
        public void eliminar(){
        int elim;
        boolean existe=false;
        System.out.println("Ingrese el código postal de la ciudad que desea eliminar");
        elim = leer.nextInt();
            if (listaciudades.containsKey(elim)) {
                listaciudades.remove(elim);
                System.out.println("Códio postal de la ciudad eliminada: " + elim);
                existe = true;
                
            }
            
            if(!existe){
                System.out.println("La ciudad ingresada no existe");
            }

    }
}
