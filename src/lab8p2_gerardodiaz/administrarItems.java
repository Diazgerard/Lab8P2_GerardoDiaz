/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gerardodiaz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author gerar
 */
public class administrarItems {
    
    private ArrayList<Items> listaItems = new ArrayList();
    private File archivo = null;

    public administrarItems(String path) {
        archivo = new File(path);
    }

    public ArrayList<Items> getListaItems() {
        return listaItems;
    }

    public void setListaItems(ArrayList<Items> listaItems) {
        this.listaItems = listaItems;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaItems;
    //extra mutador
    }
     public void setItems(Items u) {
        this.listaItems.add(u);
    }

    public void cargarArchivo() {
        try {            
            listaItems = new ArrayList();
            Items temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Items) objeto.readObject()) != null) {
                        listaItems.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Items t : listaItems) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
