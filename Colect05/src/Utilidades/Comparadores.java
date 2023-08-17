/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Paises;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class Comparadores {
    public static Comparator<Paises> comparar = new Comparator<Paises>() { //CTRL + espacio para autocompletar
        @Override
        public int compare(Paises p1, Paises p2) {
            return p2.getNombre().compareTo(p1.getNombre());

    }
            
    };
       
            
}
