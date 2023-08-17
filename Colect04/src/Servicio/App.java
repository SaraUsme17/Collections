/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    ServicioPelicula sp = new ServicioPelicula();
    Scanner leer = new Scanner(System.in);
    
    public void menu(){
        System.out.println("Seleccione una opción \n"
        + "1. Crear peliculas \n"
        + "2. Mostrar todas las películas \n"
        + "3. Mostrar todas las películas con una duración mayor a 1 hora. \n"
        + "4. Mostrar todas las películas ordenadas de acuerdo a su duración (de mayor a menor)\n"
        + "5. Mostrar todas las películas ordenadas de acuerdo a su duración (de menor a mayor)\n"
        + "6. Mostrar todas las películas ordenadas por título, alfabéticamente \n"
        + "7. Mostrar todas las películas ordenadas por director, alfabéticamente \n"
        + "8. Salir");
    
    
    }
    
    public void mostrarMenu(){
        int opc;
        
        do {        
            menu();
            opc = leer.nextInt();
            switch(opc){
                case 1:sp.fabrica();
                break;
                case 2: sp.mostrar();
                break;
                case 3:sp.duracionhora();
                break;
                case 4: sp.ordenarDuracionMayaMen();
                break;
                case 5: sp.ordenarDuracionMenaMay();
                break;
                case 6: sp.ordenarTitulo();
                break;
                case 7: sp.ordenarDirector();
                break;
                case 8: System.out.println("Saliendo");
                break;
                default:System.out.println("Opción inválida");
            
            
            }
            
        } while (opc!=8);
    
    
    
    }
}
