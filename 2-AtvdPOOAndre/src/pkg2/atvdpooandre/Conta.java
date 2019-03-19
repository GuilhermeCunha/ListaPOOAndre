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
public class Conta {
    private String nome;
    private int numeroconta;
    private double saldo;
    
    public boolean depositaValor(double v){
        this.saldo += v;
        return true;
    }
    
   public boolean retiraValor(double v){
        if(this.saldo - v >=0){
            this.saldo -= v;
            return true;
        }
        return false;
    }     
    
    public double consultarValorDisponivel(){
        return this.saldo;
    }
    
    public Conta(String n, int nconta, double s){
        this.nome = n;
        this.numeroconta = nconta;
        this.saldo = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
