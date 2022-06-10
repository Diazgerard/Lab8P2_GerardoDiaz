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
public class Jugadores {
    
    private int dinero;
    private int banco;
    ArrayList<Items> items = new ArrayList();
    ArrayList<Mascotas> mascotas = new ArrayList();

    public Jugadores() {
    }

    public Jugadores(int dinero, int banco) {
        this.dinero = dinero;
        this.banco = banco;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "dinero=" + dinero + ", banco=" + banco + ", items=" + items + ", mascotas=" + mascotas + '}';
    }
    
    
    
}
