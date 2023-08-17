/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    Scanner leer = new Scanner(System.in);
    ServicioPaises sp = new ServicioPaises();
    
    public void menu (){
        System.out.println("Ingrese una opción \n"
        + "1. Crear pais \n"
        + "2. Mostrar conjunto ordenado alfabeticamente\n"
        + "3. Eliminar país \n"        
        + "4. Salir");
    
    }
    
    public void mostrarMenu(){
    int opc;
    
        do {
            menu();
            opc = leer.nextInt();
            
            switch(opc){
                case 1: sp.fabrica();
                break;
                case 2:sp.ordenarAlfabeticamente();
                break;
                case 3:sp.eliminar();
                break;
                case 4: sp.mostrar();
                break;
            
            }
            
        } while (opc!=4);
        
    
    
    }
    
}
