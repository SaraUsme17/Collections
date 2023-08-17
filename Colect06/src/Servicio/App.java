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
    ProductosServicio ps = new  ProductosServicio();
    
    public void menu(){
        System.out.println("Ingrese una opción  \n"
        + "1. Agregar producto \n"
        + "2. Modificar precio  \n"
        + "3. Eliminar producto \n"
        + "4. Mostrar productos  \n"
        + "5. Salir");
    
    }
    
    public void mostrarMenu(){
    int opc;
    
        do {
            menu();
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    ps.fabrica();
                    break;
                case 2:ps.cambiar();
                    break;
                case 3:
                    ps.eliminar();
                    break;
                case 4:
                    ps.mostrar();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opc !=5);
        
    
    }
}
