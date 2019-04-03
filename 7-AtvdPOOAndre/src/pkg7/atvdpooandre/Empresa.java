/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.atvdpooandre;

/**
 *
 * @author Guilherme
 */
public class Empresa {
    private String nome;
    private double capital;
    private int nfuncionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getNfuncionarios() {
        return nfuncionarios;
    }

    public void setNfuncionarios(int nfuncionarios) {
        this.nfuncionarios = nfuncionarios;
    }
    

    public Empresa(String nome, double capital, int nfuncionarios) {
        this.nome = nome;
        this.capital = capital;
        this.nfuncionarios = nfuncionarios;
    }
    
}
