/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.atvdpooandre;

/**
 *
 * @author aluno
 */
public class Motor {
    private String nome;
    private int potencia;
    private boolean ligado;

    public boolean isLigado() {
        return ligado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void ligar(){
        this.ligado = true;
    }
    
    public void desligar(){
        this.ligado = false;
    }
    
    public Motor(String nome, int potencia){
        this.nome = nome;
        this.potencia = potencia;
        this.ligado = false;
    }
}
