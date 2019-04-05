/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.atvdpooandre;

/**
 *
 * @author Guilherme
 */
public class Lampada {
    private int potencia;
    private boolean estado;
    
    public void ligar(){
        if(!estado)this.estado = true;   
    }
  
    public void desligar(){
        if(estado)this.estado = false;   
    }    
    
    public Lampada(){
        this.estado = false;
    }
    
    public Lampada(int p, boolean est){
        this.potencia = p;
        this.estado = est;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isEstado() {
        return estado;
    }
    
    
    
}
