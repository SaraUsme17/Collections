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
public class CantanteFamoso {
    private String cantante;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String cantante, String ventas) {
        this.cantante = cantante;
        this.discoConMasVentas = ventas;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getVentas() {
        return discoConMasVentas;
    }

    public void setVentas(String ventas) {
        this.discoConMasVentas = ventas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "cantante=" + cantante + ", discoConMasVentas=" + discoConMasVentas + '}';
    }

    
    
}
