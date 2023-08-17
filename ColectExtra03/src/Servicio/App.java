/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    
    Scanner leer = new Scanner(System.in);
    HashSet<Libro> listalibros;
    LibroServicio ls = new LibroServicio();
    Libro libro = new Libro();

    public App() {
        listalibros = new HashSet();
    }


     public void menu (){
        System.out.println("Ingrese una opción \n"
        + "1. Crear libro \n"
        + "2. Mostrar libros\n"
        + "3. Prestar libro\n"  
        + "4. Devolver libro\n"    
        + "5. Salir");
    
    }
    
    public void mostrarMenu(){
    int opc;
    
        do {
            menu();
            opc = leer.nextInt();
            
            switch(opc){
                case 1:ls.fabrica(); ;
                break;
                case 2:ls.mostrar();
                break;
                case 3:ls.prestamo(libro);
                break;
                case 4: ls.devolucion(libro);
                break;
                case 5: System.out.println("Saliendo");;
                break;
                default:System.out.println("Opción incorrecta");
            
            }
            
        } while (opc!=5);
        
    
    
    }
}
