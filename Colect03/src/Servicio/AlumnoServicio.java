/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> listaAlumnos;

    public AlumnoServicio() {
        listaAlumnos = new ArrayList();
    }


    
    
    public Alumno crear(){
        
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno");
        alumno.setNombre(leer.next());
        System.out.println("Ingrese las 3 notas");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i+1));
            alumno.getNotas().add(leer.nextInt());
//            alumno.getNotas().add(Integer.parseInt(leer.nextLine()));
            
        }
        
        return alumno;
    
    
    }
    
    public void agregar(Alumno alumno){
    listaAlumnos.add(alumno);
    
    }
    
    public void mostrar(){
        for (Alumno la : listaAlumnos) {
            System.out.println(la);
        }
    
    }
    
    public void fabrica(){
        Alumno alumno;
        String res;
        do {
            System.out.println("Crear alumno");
            alumno = crear();
            agregar(alumno);
            System.out.println(alumno);
            System.out.println("Desea agregrar otro alumnno (SI/NO)");
//            if(!leer.next().equalsIgnoreCase("SI") &&!leer.next().equalsIgnoreCase("NO")){
//                System.out.println("Opción inválida");
//            }
            res = leer.next();
            System.out.println(res.equalsIgnoreCase("si"));
        } while(res.equalsIgnoreCase("si"));
        

    
    }
    
    public void notafinal(){
        System.out.println("Ingrese el nombre del estudiante para calcular su nota final");
        String nombre = leer.next();
        boolean encontrado = false;
        double res=0.0;
        for (Alumno la : listaAlumnos) {
            if (la.getNombre().equals(nombre)) {
                encontrado = true;
                res = promedio(nombre);

            } 

        }
        
        if (encontrado) {
            System.out.println("El promedio final del alumno es " + res);
        } else {
            System.out.println("El alumno no ha sido encontrado");

        }


    
    
    }
    
    public double promedio(String nombre){
        Alumno selec=null;
        for (Alumno la : listaAlumnos) {
            if(la.getNombre().equals(nombre)){
                    selec = la;
                    break;
                    
            }
            
        }
        
        double promedio=0.0;
        for (int nota : selec.getNotas()) {
            promedio = promedio + nota;
            
        }
        
        
        return promedio/3;
    
    
    }
}
