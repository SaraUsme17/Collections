/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colect05;

import Servicio.App;
import Servicio.ServicioPaises;

/**
 *
 * @author user
 */
public class Colect05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioPaises sp = new ServicioPaises();
        App menu = new App();
        menu.mostrarMenu();
    }
    
}
