/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.atvdpooandre;

/**
 *
 * @author Guilherme
 */
public class Livro {
    private String titulo;
    private int nPaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public Livro(String titulo, int nPaginas) {
        this.titulo = titulo;
        this.nPaginas = nPaginas;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + "\n  Páginas" + nPaginas;
    }
    
    
    
}
