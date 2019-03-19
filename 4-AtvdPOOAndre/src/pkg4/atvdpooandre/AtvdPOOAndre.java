/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.atvdpooandre;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> buscaProdutos = new ArrayList<>();
        Produto[] produtos = new Produto[5];
        int i=0;
        while(i<5){
            produtos[i] = new Produto();
            i++;
        }
        produtos[0].setDescricao("Caneta1");
        produtos[0].setPreco(5.00);
        produtos[0].setSaldo(100.00);
        
        produtos[1].setDescricao("Caneta2");
        produtos[1].setPreco(2.00);
        produtos[1].setSaldo(100.00);
        
        produtos[2].setDescricao("Caneta3");
        produtos[2].setPreco(5.00);
        produtos[2].setSaldo(100.00);
        
        produtos[3].setDescricao("Caneta4");
        produtos[3].setPreco(5.00);
        produtos[3].setSaldo(100.00);
        
        produtos[4].setDescricao("Caneta5");
        produtos[4].setPreco(5.00);
        produtos[4].setSaldo(100.00);
        
        while((JOptionPane.showConfirmDialog(null, "Quer buscar quais produtos?/n Aperte 0 para parar")) ==0){
            buscaProdutos.add(JOptionPane.showInputDialog("Qual o nome desse produto?"));
        }
        i=0;
        boolean encontrado=false;
        while(i<buscaProdutos.size()){
            for(int y=0;y<produtos.length;y++){
                if(buscaProdutos.get(i).equals(produtos[y].getDescricao())){
                    JOptionPane.showMessageDialog(null, "Descrição: " + produtos[y].getDescricao() + "\nValor: " + produtos[y].getPreco() + "\nSaldo: " +produtos[y].getSaldo());
                    encontrado=true;
                    break;
                }else{
                    encontrado=false;
                }
            }
            if(encontrado==false) JOptionPane.showMessageDialog(null, "Produto " + buscaProdutos.get(i) + " não encotnrado");
            encontrado=false;
            i++;
        }
    }
    
}
