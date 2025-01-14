/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexaoBD.ConexaoLivro;

/**
 *
 * @author guilh
 */
public class Livro {
    
    //Criando os atributos da classe.
    
    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private String isbn;
    private String anoPublicacao;
    private String numeroPaginas;
    
    //Criando os contrutores da classe.
    
    public Livro(){}
    
    public Livro(String titulo, String autor, String genero, String editora, 
                 String isbn, String anoPublicacao, String numeroPaginas){
    
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
    }

    public Livro(String titulo, String autor, String genero, String ano) {
       
    }
    
    public void cadastrarLivro (Livro livro) throws Exception{
       new ConexaoLivro().cadastrarLivro(livro);

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public void pesquisarLivros(Livro livro) throws Exception{
       new ConexaoLivro().pesquisarLivros(livro);

    }
    

    public void setTitulo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAutor(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setGenero(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEditora(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIsbn(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNumeroPaginas(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAnoPublicacao(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}