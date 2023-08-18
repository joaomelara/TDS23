/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.itens;

/**
 *
 * @author 3113.343
 */
public class Livro extends Itens{
    private String autor;
    private String editora;
    private int numeroPaginas;
    
    
    

    public Livro() {
    }

    public Livro(String autor, String editora, int numeroPaginas) {
        this.autor = autor;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    public Livro(String autor, String editora, int numeroPaginas, int codigo, String titulo) {
        super(codigo, titulo);
        this.autor = autor;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" + "autor=" + autor + ", editora=" + editora + ", numeroPaginas=" + numeroPaginas + '}';
    }

  
}