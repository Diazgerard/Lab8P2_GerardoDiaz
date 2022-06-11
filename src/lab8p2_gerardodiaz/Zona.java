/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gerardodiaz;

import java.util.ArrayList;

/**
 *
 * @author gerar
 */
public class Zona {
    
    
    private String nombre;
    private String renumeracion;
    private int probDERRUMBE;
    private int probMEGA;
    ArrayList<Object> personales = new ArrayList();
    
    
    public Zona() {
    }

    public Zona(String nombre, String renumeracion, int probDERRUMBE, int probMEGA) {
        
        this.nombre = nombre;
        this.renumeracion = renumeracion;
        this.probDERRUMBE = probDERRUMBE;
        this.probMEGA = probMEGA;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Object> getPersonales() {
        return personales;
    }

    public void setPersonales(ArrayList<Object> personales) {
        this.personales = personales;
    }

    public String getRenumeracion() {
        return renumeracion;
    }

    public void setRenumeracion(String renumeracion) {
        this.renumeracion = renumeracion;
    }

    public int getProbDERRUMBE() {
        return probDERRUMBE;
    }

    public void setProbDERRUMBE(int probDERRUMBE) {
        this.probDERRUMBE = probDERRUMBE;
    }

    public int getProbMEGA() {
        return probMEGA;
    }

    public void setProbMEGA(int probMEGA) {
        this.probMEGA = probMEGA;
    }

    @Override
    public String toString() {
        return nombre + personales + renumeracion + probDERRUMBE  + probMEGA ;
    }
    
    
    
}
