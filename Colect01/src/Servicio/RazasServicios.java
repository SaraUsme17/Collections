/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Razas;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class RazasServicios {
    Scanner leer = new Scanner(System.in);
    private Razas rz = new Razas();
    
//        public RazasServicios(Razas rz) {
//        this.rz = rz;
//    }

    
    public static void menu() {

        System.out.println("Seleccione una opción: \n"
                + "1. Agregar raza\n"
                + "2. Salir\n"
                + "3.Eliminar raza");
    }
    
    public void mostrarMenu() {
        int opc;
        String sino;
        do {
            menu();
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    rz.agregar();
//                    System.out.println("Desea agregar otra raza (s/n?)");
//                    sino = leer.next();
//                    if(sino.equalsIgnoreCase("s")){
//                    opc=1;
//                    }
                    break;
                case 2:
                    rz.mostrar();
                    break;
                case 3:
                    rz.eliminar();
                default:
                    System.out.println("Opción inválida");

            }
        } while (opc!=2);


    
    }
}
