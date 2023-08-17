/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class NumerosServicio {
    
    Scanner leer = new Scanner(System.in);

    ArrayList<Integer> listanum;
    
        public NumerosServicio() {
             listanum = new ArrayList();
    }
        
   public void ingresar(){
       Integer num;
       int contador=0;
       double suma = 0; 
       
       do {
           System.out.println("Ingrese un número");
           num = leer.nextInt();
           if(num!=99){
               listanum.add(num);
               contador++;
               suma = suma + num;
           }

           
       } while (num!=99); 
       
       for (Integer in : listanum) {
           System.out.println(in);
       }
       
       System.out.println("Cantidad de números leídos " + contador);
       System.out.println("La suma de los números leídos " + suma);
       System.out.println("Promedio de los números leídos: " + (suma/contador) );
   }     
   

}
