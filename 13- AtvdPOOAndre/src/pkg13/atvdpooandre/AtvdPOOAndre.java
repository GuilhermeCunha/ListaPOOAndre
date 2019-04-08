/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.atvdpooandre;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        ArrayList<String> significados = new ArrayList<>();
        
        palavras.add("Java");
        palavras.add("Funcionário");
        palavras.add("Aluno");
        palavras.add("Futebol");
        
        significados.add("Linguagem de programação");
        significados.add("Pessoa que trabalha");
        significados.add("Pessoa que estuda");
        significados.add("Modalidade de esporte");
        
        Dicionario dicionario = new Dicionario(palavras, significados);
        
        System.out.println(dicionario.pesquisar());
        System.out.println(dicionario.pesquisar("Java"));
        System.out.println(dicionario.pesquisar(2));
        
        dicionario.validarPalavra("Java");
        dicionario.validarPalavra("Guilherme");
        
    
    }
}
