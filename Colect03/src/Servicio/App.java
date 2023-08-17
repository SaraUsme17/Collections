/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    
    AlumnoServicio as = new AlumnoServicio();
    Scanner leer = new Scanner(System.in);

    
    public void menu(){
        System.out.println("Ingrese una opción \n"
        + "1. Crear alumno\n"
        + "2. Mostrar alumnos \n"
        + "3. Ver el promedio de las notas \n"
        + "4. Salir");
    
    }
    
    public void mostrarMenu(){
        int opc;
        do {
            menu();
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    as.fabrica();
                    break;
                case 2:
                    as.mostrar();
                    break;
                case 3:as.notafinal();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }
        } while (opc!=4);
        

                
    
    
    }
}
