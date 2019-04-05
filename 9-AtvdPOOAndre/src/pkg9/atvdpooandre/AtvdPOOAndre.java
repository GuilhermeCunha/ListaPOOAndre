/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.atvdpooandre;

/**
 *
 * @author Guilherme
 */
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[4];
        
        pessoas[0] = new Pessoa("Guilherme" , 18, 1.80, 71, "Masculino");
        System.out.println(pessoas[0]);
        
        pessoas[1] = new Pessoa("Gabriel" , 18, 2.0, 50, "Masculino");
        System.out.println(pessoas[1]);  
        
        pessoas[2] = new Pessoa("Luca" , 18, 1.50, 71, "Masculino");
        System.out.println(pessoas[2]); 
        
        pessoas[3] = new Pessoa("Mehiel" , 18, 1.80, 85, "Masculino");
        System.out.println(pessoas[3]);
         
    }
    
}
