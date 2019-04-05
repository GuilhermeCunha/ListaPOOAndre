/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.atvdpooandre;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Turma {
    ArrayList<String> nomeAlunos;
    ArrayList<Float> notaAlunos;
    
    
    public double calcularMediaNota(){
        int i=0;
        double media=0;
        while(i<notaAlunos.size()){
            media+=notaAlunos.get(i);
            i++;
        }
        return (media/notaAlunos.size());
    }
    
    public void imprimirAlunos(){
        int i=0;
        while(i<nomeAlunos.size()){
            System.out.println("\n" + nomeAlunos.get(i) + "   " + notaAlunos.get(i));
            i++;
        }
    }
    
    

    public Turma() {
        this.nomeAlunos = new ArrayList<>();
        this.notaAlunos = new ArrayList<>();
    }

    public Turma(ArrayList<String> nomeAlunos, ArrayList<Float> notasAlunos) {
        this.nomeAlunos = nomeAlunos;
        this.notaAlunos = notasAlunos;
    }
    
    
    
}
