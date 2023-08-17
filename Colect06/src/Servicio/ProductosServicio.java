/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProductosServicio {
    
    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> listaproductos; 

    public ProductosServicio() {
        listaproductos = new HashMap(); 
    }
    
    
    
    public Productos crear(){
        Productos producto = new Productos();
        System.out.println("Ingrese el nombre del producto");
        producto.setNombreProducto(leer.next());
        System.out.println("Ingrese el precio del producto");
        producto.setPrecio(leer.nextDouble());
        listaproductos.put(producto.getNombreProducto(), producto.getPrecio());
        return producto;
    
    }
    
    public void  fabrica(){
        String resp;
        
        do {
            crear();
            System.out.println("Desea ingresar otro producto (S/N)");
            resp = leer.next();
            
            while(!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")){
                System.out.println("Respuesta incorrecta. Ingrese (S/N)");
                resp = leer.next();
             
            }
            

            
            System.out.println("Producto agregado con éxito");
            
        } while (resp.equalsIgnoreCase("s"));
        
    
    }
    
    public void eliminar(){
        String elim;
        boolean existe=false;
        System.out.println("Ingrese el producto que desea eliminar");
        elim = leer.next();
            if (listaproductos.containsKey(elim)) {
                listaproductos.remove(elim);
                System.out.println("Producto eliminado: " + elim);
                existe = true;
                
            }
            
            if(!existe){
                System.out.println("El producto ingresado no existe");
            }

//    Iterator<Map.Entry<String, Double>> iterator = listaproductos.entrySet().iterator();
//    while (iterator.hasNext()) {
//        Map.Entry<String, Double> entry = iterator.next();
//        if (entry.getKey().equals(elim)) {
//            iterator.remove();
//            System.out.println("Producto eliminado: " + entry.getKey());
//        }
//    }
    }
    
    public void mostrar(){
        

        for (Map.Entry<String, Double> entry : listaproductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Nombre producto: " + key + " Precio: " + value);
            
        }
    
    }
    
    public void cambiar(){
        boolean resp = false;
        System.out.println("Ingrese el producto al que le quiere modificar el precio");
        String res = leer.next();
        for (Map.Entry<String, Double> entry : listaproductos.entrySet()) {
            if(entry.getKey().equals(res)){
                System.out.println("Ingrese el nuevo precio");
                Double np = leer.nextDouble();
                entry.setValue(np);
                resp = true;
                System.out.println("Precio modificado con éxito" + np);
            
            }
            
        }
        
        if(!resp){
            System.out.println("El producto no ha sido encontrado");
        }

    }
}
