/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.atvdpooandre;

/**
 *
 * @author Guilherme
 */
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Soma: " + calculadora.somar(5, 7));
        System.out.println("Subtração: " + calculadora.subtrair(5, 7));
        System.out.println("Multiplicação : " + calculadora.multiplicar(5, 7));
        System.out.println("Divisão: " + calculadora.dividir(5, 0));
    }
    
}
