/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioPelicula {
    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> lista;

    public ServicioPelicula() {
        lista = new ArrayList();
    }
    
    
    
    public Pelicula crear(){
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el título de la película");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el director de la película");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese la duración de la película en horas");
        pelicula.setDuracion(leer.nextDouble());
        
        return pelicula;
    
    
    }
    
    public void guardar(Pelicula pelicula){
    lista.add(pelicula);
    
    }
    
    public void mostrar(){
        for (Pelicula pel : lista) {
            System.out.println(pel);
            
        }
    
    }
    
    public void fabrica(){
        Pelicula pelicula;
        String res;


        do {
            System.out.println("Crear película");
            pelicula = crear();
            guardar(pelicula);
            System.out.println("Película agregada con éxito");
            System.out.println(pelicula);
 
            System.out.println("Desea ingresar otra película (s/n)");
            res = leer.next();
    
            
        } while (res.equalsIgnoreCase("s"));
        

    
    
    
    }
    public void duracionhora(){
        ArrayList<Pelicula> nueva = new  ArrayList();
        for (Pelicula pel : lista) {
            if(pel.getDuracion()>1){
                nueva.add(pel);
            
            }
            
        }
        for (Pelicula pelicula : nueva) {
            System.out.println(pelicula);
            
        }
    
    }
    
    public void ordenarDuracionMayaMen() {
        Collections.sort(lista, Comparadores.peliculasOrdenadasDuracionMayaMen);
        for (Pelicula pel : lista) {
            System.out.println(pel);
        }

    }
    
        public void ordenarDuracionMenaMay(){
            Collections.sort(lista, Comparadores.peliculasOrdenadasDuracionMenaMay);
            for (Pelicula pel : lista) {
                System.out.println(pel);
            }
    
    }
        
            
    public void ordenarTitulo(){
            Collections.sort(lista, Comparadores.peliculasOrdenadasTitulo);
            for (Pelicula pel : lista) {
                System.out.println(pel);
            }
    
    }
    
    public void ordenarDirector() {
        Collections.sort(lista, Comparadores.peliculasOrdenadasDirector);
        for (Pelicula pel : lista) {
            System.out.println(pel);
        }

    }
}
