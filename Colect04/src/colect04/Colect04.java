/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colect04;

import Servicio.App;
import Servicio.ServicioPelicula;

/**
 *
 * @author user
 */
public class Colect04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioPelicula sp = new  ServicioPelicula();
        App menu = new App();
        menu.mostrarMenu();
    }
    
}
