/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.atvdpooandre;

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
        Motor[] motores = new Motor[5];
        int i=0;
        while(i<5){
            motores[i] = new Motor(JOptionPane.showInputDialog("Qual o nome do seu " + (i+1) + " motor?"), Integer.parseInt(JOptionPane.showInputDialog("Qual a potencia do seu " + (i+1) + " motor?")));
            if(i%2==0) motores[i].ligar();
            i++;
        }
        i=0;
        while(i<5){
            JOptionPane.showMessageDialog(null, "Nome: \n" + motores[i].getNome());
            if(!motores[i].isLigado()) JOptionPane.showMessageDialog(null, "Potencia: " + motores[i].getPotencia());
            i++;
        }
        
    }
    
}
