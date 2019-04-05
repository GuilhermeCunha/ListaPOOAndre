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
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomeAlunos = new ArrayList<>();
        ArrayList<Float> notaAlunos = new ArrayList<>();
        int i=0;
        while(i<10){
            nomeAlunos.add(("Aluno " + String.valueOf(i)));
            notaAlunos.add(Float.parseFloat("" + i));
            i++;
        }
        Turma turma = new Turma(nomeAlunos, notaAlunos);
        System.out.println("\n Media: " + turma.calcularMediaNota());
        turma.imprimirAlunos();
                
                
    }
}
