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
public class ContaEspecial extends Conta{
    private double limite;
    
    @Override
   public boolean retiraValor(double v){
        if((this.getSaldo() + limite) - v >=0){
            this.setSaldo(this.getSaldo() - v);
            return true;
        }
        return false;
    }    
   
    @Override
    public double consultarValorDisponivel(){
        return (this.getSaldo() + this.limite);
    }
    
    public ContaEspecial(String n, int nconta, double s, double limite) {
        super(n, nconta, s);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    
}
