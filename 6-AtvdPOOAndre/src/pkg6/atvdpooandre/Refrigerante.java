/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.atvdpooandre;

/**
 *
 * @author aluno
 */
public class Refrigerante {
    private String nome;
    private double preco;
    private int qtdEstoque;
    
    public Refrigerante(String n, double p, int  q){
        this.nome = n;
        this.preco = p;
        this.qtdEstoque = q;
    }
    public void efetuarVenda (){
        this.qtdEstoque = this.qtdEstoque - 1;
    }
}
