/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.atvdpooandre;

/**
 *
 * @author Guilherme
 */
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta("Guilherme",123,5000);
        conta.depositaValor(5000);
        conta.retiraValor(2000);
        System.out.println(conta.consultarValorDisponivel());
        
        ContaEspecial contaEspecial = new ContaEspecial("Guilherme Cunha",123,5000,10000);
        System.out.println("A conta especial tem: \n" + " Nome: " + contaEspecial.getNome() + "\n Numero da conta:" + contaEspecial.getNumeroconta() + "\n Saldo: " + contaEspecial.getSaldo() + "\n Limite: " + contaEspecial.getLimite());
        
        contaEspecial.depositaValor(5);
        contaEspecial.retiraValor(12000);
        
        
        System.out.println("A conta especial tem: \n" + " Nome: " + contaEspecial.getNome() + "\n Numero da conta:" + contaEspecial.getNumeroconta() + "\n Saldo: " + contaEspecial.getSaldo() + "\n Limite: " + contaEspecial.getLimite());
    }
    
}
