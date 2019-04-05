/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.atvdpooandre;

/**
 *
 * @author Guilherme
 */
public class Mercadoria {
    private String nome;
    private double valor;
    private int qtdEstoque;
    
   public double comprar(){
       this.qtdEstoque--;
       return this.valor;
   }
    public double comprar(int qtd){
       this.qtdEstoque -= qtd;
       return (this.valor*qtd);
   }
    public double comprar(int qtd, int desc){
        double valorCompra = this.valor * qtd;
        double valorDesconto = ((valorCompra * desc)/100);
       
       this.qtdEstoque -= qtd;
       return (valorCompra - valorDesconto);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Mercadoria(String nome, double valor, int qtdEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
    }
    
    
}
