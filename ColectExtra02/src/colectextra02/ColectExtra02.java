/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectextra02;

import Entidad.CantanteFamoso;
import Servicio.CantanteFamosoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ColectExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CantanteFamosoServicio cfs = new CantanteFamosoServicio();
        ArrayList<CantanteFamoso> lista = new  ArrayList();
        CantanteFamoso cf;
        
        //Ingresamos los 5 cantantes
        for (int i = 0; i < 5; i++) {
            cf = cfs.crear();
            lista.add(cf);    
        }
        
        //Mostramos los 5 cantantes 
        System.out.println("Los 5 cantantes ingresados son");
        for (CantanteFamoso cant : lista) {
            System.out.println(cant);
            
        }
        
        mostrarMenu(cfs, lista);
        
    }
    
    
    //Menu
    
    public static void menu(){
        System.out.println("Ingrese una opción \n"
        + "1. Agregar más cantantes \n"
        + "2. Mostrar todos los cantantes \n"
        + "3. Eliminar un cantante \n"
        + "4. Salir");
    }
    
    public static void mostrarMenu(CantanteFamosoServicio cfs, ArrayList<CantanteFamoso> lista){
        Scanner leer = new Scanner(System.in);
        int opc;
        
        do {
            
            menu();
            opc = leer.nextInt();
            switch(opc){
                case 1:cfs.agregarmas(lista);
                break;
                case 2:cfs.mostrar(lista);
                break;
                case 3:cfs.eliminar(lista);
                break;
                case 4: System.out.println("Saliendo");
                break;
                default:System.out.println("Opción inválida");
                break;
            
            }
            
        } while (opc!=4);
        
    
    }
}
