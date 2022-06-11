/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gerardodiaz;

import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;

/**
 *
 * @author gerar
 */
public class administrarVida {
    
    private JProgressBar progBar_Vl;
    private JFormattedTextField vida;
    private JFormattedTextField delay;
    private boolean avanzar;
    private boolean vive;

    public administrarVida(JProgressBar progBar_Vl, JFormattedTextField vida, JFormattedTextField delay) {
        this.progBar_Vl = progBar_Vl;
        this.vida = vida;
        this.delay = delay;
        this.avanzar = avanzar;
        this.vive = vive;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    public void run() {
        while (vive) {
            if (avanzar) {
                int d = 1;
                if (Integer.parseInt(delay.getText()) > 0) {
                    d = Integer.parseInt(delay.getText());
                }
                progBar_Vl.setValue(Integer.parseInt(vida.getText())-(Integer.parseInt(delay.getText()))
                );
            }//FIN IF
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }

    }
    
    
    
    
    
}
