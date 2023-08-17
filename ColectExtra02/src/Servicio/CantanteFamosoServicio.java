/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CantanteFamosoServicio {
    
    Scanner leer = new Scanner(System.in);
    ArrayList<CantanteFamoso> listacantantes;

    public CantanteFamosoServicio() {
        listacantantes = new  ArrayList();
    }
    
    public CantanteFamoso crear() {
        
        CantanteFamoso cf = new CantanteFamoso();
        System.out.println("Ingrese el nombre del cantante");
        cf.setCantante(leer.next());
        System.out.println("Ingrese el nombre del disco más vendido");
        cf.setVentas(leer.next());
        return cf;

    }
    
    public void agregarmas(ArrayList<CantanteFamoso> lista){
        CantanteFamoso cf;
        String res;
        
        do {                      
            System.out.println("Desea agregar un cantante más? Responda (s/n) ");
            res = leer.next();
            
            while(!res.equals("s") &&!res.equals("n") ){
                System.out.println("Opción incorrecta, ingrese (s/n)");
                res = leer.next();
            
            
            }
            
            if(res.equals("s")){
                cf = crear();
                lista.add(cf);
            }  
            
        } while (res.equalsIgnoreCase("s"));
            
    }
    
    public void mostrar(ArrayList<CantanteFamoso> lista){
        
        for (CantanteFamoso can : lista) {
            System.out.println(can);
        }
    
    
    }
    
    public ArrayList<CantanteFamoso> eliminar(ArrayList<CantanteFamoso> lista){
        System.out.println("Ingrese el nombre del cantante que desea eliminar");
        String nombre = leer.next();
        boolean encontrado = false;
        Iterator<CantanteFamoso> it = lista.iterator();
        while (it.hasNext()) {
            CantanteFamoso cantante = it.next();
            if(cantante.getCantante().equals(nombre)){
            it.remove();
            encontrado = true;
            
            }
            
        }
        
        if(encontrado){
            System.out.println("El cantante ha sido eliminado");
        
        }else{
            System.out.println("El usuario no ha sido encontrado");
        }
        return lista;

        
        }
        
    }
