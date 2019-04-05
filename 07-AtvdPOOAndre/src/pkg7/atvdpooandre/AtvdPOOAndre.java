/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.atvdpooandre;

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
        Empresa[] empresas = new Empresa[5];
        
       empresas[0] = new Empresa("Empresa 1", 1500, 10);
       empresas[1] = new Empresa("Empresa 2", 2500, 15);
       empresas[2] = new Empresa("Empresa 3", 3500, 60);
       empresas[3] = new Empresa("Empresa 4", 4000, 25);
       empresas[4] = new Empresa("Empresa 5", 5000, 50);
       
       int maior=0;
       int i=0, ind=0;
       while(i<5){
           if(i==0){
               maior = empresas[i].getNfuncionarios();
               ind = 0;
           }
           if(empresas[i].getNfuncionarios() > maior){
               maior = empresas[i].getNfuncionarios();
               ind = i;
           }
           i++;
       }
       
        JOptionPane.showMessageDialog(null, "A empresa " + empresas[ind].getNome() + " é a que tem mais funcionarios");
       
       
    }
    
}
