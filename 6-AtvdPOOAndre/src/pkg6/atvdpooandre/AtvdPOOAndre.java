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
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Refrigerante[] refrigerantes = new Refrigerante[5];
        int i=0;
        refrigerantes[0] = new Refrigerante("Coca Cola", 1.50, 40);
        refrigerantes[1] = new Refrigerante("Fanta Uva", 0.90, 10);
        refrigerantes[2] = new Refrigerante("Fanta Laranja", 0.90, 8);
        refrigerantes[3] = new Refrigerante("Sprite", 0.80, 20);
        refrigerantes[4] = new Refrigerante("Kuat", 1.00, 100);
        while(i<5){
            System.out.println((i+1) + " " + refrigerantes[i].toString());
            i++;
        }
        int n = Integer.parseInt(JOptionPane.showInputDialog("Qual refrigerante gostaria de comprar?"));
        refrigerantes[(n-1)].efetuarVenda(Double.parseDouble(JOptionPane.showInputDialog("Com quantos reais gostaria de pagar?")));
        
    }
    
}
