/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gerardodiaz;

/**
 *
 * @author gerar
 */
public class Items {
    
    
    private String nombre;
    private String alimento;
    private int probOBT;
    private int precio;

    public Items() {
    }

    public Items(String nombre, String alimento, int probOBT, int precio) {
        
        this.nombre = nombre;
        this.alimento = alimento;
        this.probOBT = probOBT;
        this.precio = precio;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getProbOBT() {
        return probOBT;
    }

    public void setProbOBT(int probOBT) {
        this.probOBT = probOBT;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Items{" + ", nombre=" + nombre + ", alimento=" + alimento + ", probOBT=" + probOBT + ", precio=" + precio + '}';
    }
    
    
    
}
