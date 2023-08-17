/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author user
 */
public class Codigo {
    private String nombre;
    private Integer codigos;

    public Codigo() {
    }

    public Codigo(String nombre, Integer codigos) {
        this.nombre = nombre;
        this.codigos = codigos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigos() {
        return codigos;
    }

    public void setCodigos(Integer codigos) {
        this.codigos = codigos;
    }

    @Override
    public String toString() {
        return "codigos{" + "nombre=" + nombre + ", codigos=" + codigos + '}';
    }
    
    
    
}
