/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.atvdpooandre;

/**
 *
 * @author aluno
 */
public class Produto {
    private String descricao;
    private Double preco;
    private Double saldo;
    
    public Produto(){
        
    }
    public Produto(String d, Double p, Double s){
        this.descricao = d;
        this.preco = p;
        this.saldo = s;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
}
