/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.atvdpooandre;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class ConsultorDeVendas extends Funcionario{
    private double valorBonusMensal;
    
    @Override
    public double calcularSalario(){
        double salarioComBonus = super.calcularSalario() + this.valorBonusMensal;
        System.out.println("Salario com Bonus: " + salarioComBonus);
        return salarioComBonus;
    }
    
    
    
    
    
    public ConsultorDeVendas(String nome, char sexo, char nivel, ArrayList<String> dependentes) {
        super(nome, sexo, nivel, dependentes);
    }
    
}
