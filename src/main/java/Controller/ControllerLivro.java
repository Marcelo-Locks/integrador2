/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import conexaoBD.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.Livro;

/**
 *
 * @author guilh
 */
public class ControllerLivro {
    
    public boolean cadastrarLivro(String titulo, String autor, String genero, String editora, 
                                    String isbn, String anoPublicacao, String numeroPaginas) throws Exception{
        
    if(!titulo.equals("") && !autor.equals("") && !genero.equals("") && !editora.equals("") && !isbn.equals("")  
            && !anoPublicacao.equals("") && !numeroPaginas.equals("")){
        
        //Criando o objeto do livro
        Livro livro = new Livro(titulo, autor, genero, editora, isbn, anoPublicacao, numeroPaginas);
        
        livro.cadastrarLivro(livro);
     return true;
    }
        return false;
    }
    
    public boolean pesquisarLivros(Jtable table, String titulo, String autor, String genero, String ano) 
            throws Exception {
      
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Obtém conexão com o banco de dados
            conexao conn = new conexao();
            conn.getConnection();
            // Define a consulta SQL
            String sql = "SELECT titulo, autor, genero, ano_publicacao FROM tb_livros";

            // Cria o statement com a consulta SQL
            stmt = conexao.prepareStatement(sql);

            // Executa a consulta e obtém o resultado
            rs = stmt.executeQuery();

            // Itera sobre o resultado e imprime os dados, por exemplo
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("genero");
                String autor = rs.getString("ano_publicacao");
                System.out.println("ID: " + id + ", Título: " + titulo + ", Autor: " + autor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fecha os recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
    }
        return false;
    }
}



