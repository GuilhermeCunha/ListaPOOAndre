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
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;
    private String categoriaIMC;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCategoriaIMC() {
        return categoriaIMC;
    }

    public void setCategoriaIMC(String categoriaIMC) {
        this.categoriaIMC = categoriaIMC;
    }
    
    
    public void calcIMC(){
        double imc = this.peso / (this.altura * this.altura);
        
        if(imc <= 18.5){
            this.categoriaIMC = "Abaixo do peso";
        }else if(imc <= 25){
            this.categoriaIMC = "Peso normal";
        }else if(imc <= 30){
            this.categoriaIMC = "Acima do peso";
        }else if(imc > 30){
            this.categoriaIMC = "Obesidade";
        } 
    }

    public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.calcIMC();
    }

    @Override
    public String toString() {
        return "\n\nNome: " + nome + "\nCategoriaIMC: " + categoriaIMC ;
    }
    
}
