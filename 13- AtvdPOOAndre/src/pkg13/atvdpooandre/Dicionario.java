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
public class Dicionario {
    ArrayList<String> palavras;
    ArrayList<String> significados;
    
    public String pesquisar(){
        return "Palavra: " + palavras.get(0) + "\n Significado: " + significados.get(0);
    }
    
    public String pesquisar(String p){
        int i=0;
        while(i<palavras.size()){
            if(p.equals(palavras.get(i))) return "Palavra: " + palavras.get(i) + "\n Significado: " + significados.get(i);
            i++;
        }
        return "Palavra não encontrada!";
    }
    public String pesquisar(int ind){
        if(ind>palavras.size()) return "O indice indicado ultrapassa o números de palavras do dicionário!";
        return "Palavra: " + palavras.get(ind) + "\n Significado: " + significados.get(ind);
    }
    public boolean validarPalavra(String p){
        int i=0;
        while(i<palavras.size()){
            if(p.equals(palavras.get(i))){
                System.out.println("Palavra já existente no dicionário no indice " + i);
                return false;
            }
            i++;
        }
        return true;
    }
    
    
    public Dicionario() {
        palavras = new ArrayList<>();
        significados = new ArrayList<>();
    }

    public Dicionario(ArrayList<String> palavras, ArrayList<String> significados) {
        this.palavras = palavras;
        this.significados = significados;
    }
    
    
    
    
}
