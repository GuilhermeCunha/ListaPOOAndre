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
public class Funcionario {
    private String nome;
    private char sexo;
    private char nivel;
    ArrayList<String> dependentes;
    
    public double calcularSalario(){
        double salario;
        switch(this.nivel){
            case 'T':
                salario = 2.000;
            case 'P':
                salario = 3.500;
            case 'S':
                salario = 5.000;
            default:
                salario = 0;
        }
        System.out.println("R$" + salario);
        return salario;
    }
    
    public void mostrarDependentes(){
        int i=0;
        while(i<dependentes.size()){
            if(i==0) System.out.println("Dependentes:\n\n");
            System.out.println("\nNome: " + dependentes.get(i));
            i++;
        }
    }
    public boolean validarSexo(char sexo){
        switch(sexo){
            case 'M': 
                this.sexo = sexo;
                return true;
            case 'F':
                this.sexo = sexo;
                return true;
            default: 
                System.out.println("Sexo inválido!");
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public ArrayList<String> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<String> dependentes) {
        this.dependentes = dependentes;
    }
    
    

    public Funcionario(String nome, char sexo, char nivel, ArrayList<String> dependentes) {
        this.nome = nome;
        this.sexo = sexo;
        this.nivel = nivel;
        this.dependentes = dependentes;
    }

    
    
}
