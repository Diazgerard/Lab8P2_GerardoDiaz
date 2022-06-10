/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gerardodiaz;

import java.awt.Color;

/**
 *
 * @author gerar
 */
public class Mascotas {
    
    private String nombreMAS;
    private int vida;
    private int delay;
    private int costo;
    private Color color;

    public Mascotas() {
    }

    public Mascotas(String nombreMAS, int vida, int delay, int costo, Color color) {
        this.nombreMAS = nombreMAS;
        this.vida = vida;
        this.delay = delay;
        this.costo = costo;
        this.color = color;
    }

    public String getNombreMAS() {
        return nombreMAS;
    }

    public void setNombreMAS(String nombreMAS) {
        this.nombreMAS = nombreMAS;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombreMAS=" + nombreMAS + ", vida=" + vida + ", delay=" + delay + ", costo=" + costo + ", color=" + color + '}';
    }
    
    
    
}
