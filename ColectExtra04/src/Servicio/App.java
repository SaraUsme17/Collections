/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Codigo;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
        Scanner leer = new Scanner(System.in);
        CodigoServicio cs= new CodigoServicio();

    
    public void menu(){
        System.out.println("Ingrese una opción  \n"
        + "1. Ingresar ciudades \n"
        + "2. Mostrar ciudades  \n"
        + "3. Buscar ciudad por código postal \n"
        + "4. Eliminar ciudades \n"
        + "5. Salir");
    
    }
    
    public void mostrarMenu(){
    int opc;
    
        do {
            menu();
            opc = leer.nextInt();
            switch(opc){
                case 1:cs.fabrica();
                    break;
                case 2:cs.mostrar();
                    break;
                case 3:cs.buscar();
                    break;
                case 4:
                    cs.eliminar();
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
