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
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mercadoria caneta = new Mercadoria("Caneta" , 2.0, 100);
        
        System.out.println("Valor: " + caneta.comprar() + "\n Estoque: " + caneta.getQtdEstoque());
        System.out.println("Valor: " + caneta.comprar(5) + "\n Estoque: " + caneta.getQtdEstoque());
        System.out.println("Valor: " + caneta.comprar(3, 10) + "\n Estoque: " + caneta.getQtdEstoque());
    }
    
}
