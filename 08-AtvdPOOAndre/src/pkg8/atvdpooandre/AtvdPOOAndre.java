/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.atvdpooandre;

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
        ArrayList<Livro> livros = new ArrayList<>();
        Livro livro;
        int i=1;
        while(livros.size()<4){
            livro = new Livro("Nome " + i, (i+10));
            livros.add(livro);
            i++;
        }
        i=0;
        while(i<livros.size()){
            System.out.println(livros.get(i));
            i++;
        } 
    }
    
}
