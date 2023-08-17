/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in);
    
    HashSet<Libro> listalibros;

    public LibroServicio() {
        listalibros = new  HashSet();
    }
    
    public Libro crear(){
        Libro libro = new Libro();
        System.out.println("Ingrese el nombre del libro");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        libro.setAutor(leer.next());
         System.out.println("Ingrese el número de ejemplares");
         libro.setNumEjemplares(leer.nextInt());
         System.out.println("Ingrese el número de ejemplares prestados");
         libro.setNumEjemplaresPrestados(leer.nextInt());
         listalibros.add(libro);

        return libro;
    
    }
    
    public void fabrica(){
        String res;
        
        do {
            crear();
            System.out.println("Desea ingresar otro libro (s/n)");
            res = leer.next();
            
            while(!res.equals("s") && !res.equals("n") ){
                System.out.println("Opción inválida. Ingrese (s/n)");
                res = leer.next();
            }

        } while (res.equals("s"));
        
    
    }
    
    public boolean prestamo(Libro libro){
        boolean encontrado = false;
        System.out.println("Ingrese el nombre del libro que quiere prestar");
        String res = leer.next();
        for (Libro libroLista : listalibros) {
            if (libroLista.getTitulo().equals(res)) {
                encontrado = true;
                prestamosuma(encontrado, libroLista);
                break; // Termina el bucle después de encontrar el libro
            }
        }
//        Iterator<Libro> it = listalibros.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals(res)) {
//                //llamar método que sume (falta crearlo)
//                encontrado = true;
//                prestamosuma(encontrado, libro);
//            }
//
//        }
    if (!encontrado) {
        System.out.println("No se ha encontrado el libro ingresado");
    }
        return encontrado;
    
    
    }
    
    public void prestamosuma(boolean encontrado, Libro libro){
        
        if (encontrado) {
            if (libro.getNumEjemplaresPrestados() < libro.getNumEjemplares()) {
                libro.setNumEjemplaresPrestados(libro.getNumEjemplaresPrestados() + 1);
                System.out.println("Libro prestado exitosamente");
            }else{
                System.out.println("No hay ejemplares disponibles de este libro");
            }

        }
    
    
    }
    
        public boolean devolucion(Libro libro){
        boolean encontrado = false;
        System.out.println("Ingrese el nombre del libro que quiere devolver");
        String res = leer.next();
            for (Libro libroLista : listalibros) {
                if (libroLista.getTitulo().equals(res)) {
                    encontrado = true;
                    prestamoresta(encontrado, libroLista);
                    break; // Termina el bucle después de encontrar el libro
                }
            }
//        Iterator<Libro> it = listalibros.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals(res)) {
//                //llamar método que sume (falta crearlo)
//                encontrado = true;
//                prestamoresta(encontrado, libro);
//            }
//
//        }

            if (!encontrado) {
                System.out.println("No se ha encontrado el libro ingresado");
            }

        return encontrado;
    
    
    }
    
    public void prestamoresta(boolean encontrado, Libro libro) {

        if (encontrado) {
            if (libro.getNumEjemplaresPrestados() >0) {
                libro.setNumEjemplaresPrestados(libro.getNumEjemplaresPrestados() - 1);
                System.out.println("Libro devuelto exitosamente");
            }else{
                System.out.println("No hay ejemplares prestados para este libro");
            }

        }

    }
    
    public void mostrar(){
        for (Libro lis : listalibros) {
            System.out.println(lis);
        }
    
    }
}
