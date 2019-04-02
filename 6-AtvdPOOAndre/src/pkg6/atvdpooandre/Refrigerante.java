/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.atvdpooandre;

import javax.swing.JOptionPane;

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
    public boolean efetuarVenda (double pagamento){
        if(this.qtdEstoque>0){
            this.qtdEstoque = this.qtdEstoque - 1;
            JOptionPane.showMessageDialog(null, "Venda efetuada\n Troco: " + (pagamento-this.preco));
            return true;
        }
        JOptionPane.showMessageDialog(null, "\nVenda não realizada");
        return false;
    }
}
