/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Livro;

/**
 *
 * @author guilh
 */
public class ConexaoLivro {

    public void cadastrarLivro(Livro livro) throws Exception{
        String sql = "INSERT INTO tb_livros(TITULO, AUTOR, GENERO, EDITORA, ISBN, ANO_PUBLICACAO, NUMERO_PAGINAS) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        Connection conn = null;
        
        try {
            conn = new conexao().getConnection();
            ps = conn.prepareStatement(sql);
            
            ps.setString(1,livro.getTitulo());
            ps.setString(2,livro.getAutor());
            ps.setString(3,livro.getGenero());
            ps.setString(4,livro.getEditora());
            ps.setString(5,livro.getIsbn());
            ps.setString(6,livro.getAnoPublicacao());
            ps.setString(7,livro.getNumeroPaginas());
            
            ps.execute();
        
        }catch (SQLException e){
            throw new Exception ("Erro ao cadastrar cliente:" + e);
        }finally{
            // Fecha o statement
            try {
                if(ps != null){
                    ps.close();
                }
            } catch (SQLException e) {
                throw new Exception ("Erro ao fechar o statement" + e);
            }
            //Fecha a conexão.
            try {
                if(conn != null){
                conn.close();
                }
            } catch (SQLException e) {
                throw new Exception ("Erro ao fechar a conexão:" + e);
            }
        }
    }
    public List<Livro> pesquisarLivros(String titulo, String autor, String genero, String anoPublicacao) throws Exception {
    List<Livro> resultados = new ArrayList<>();
    String sql = "SELECT * FROM tb_livros WHERE 1=1"; // Inicia a query
    
    // Verifica se algum critério de pesquisa foi fornecido e adiciona à consulta SQL
    if (titulo != null && !titulo.isEmpty()) {
        sql += " AND TITULO LIKE ?";
    }
    if (autor != null && !autor.isEmpty()) {
        sql += " AND AUTOR LIKE ?";
    }
    if (genero != null && !genero.isEmpty()) {
        sql += " AND GENERO LIKE ?";
    }
    if (anoPublicacao != null && !anoPublicacao.isEmpty()) {
        sql += " AND ANO_PUBLICACAO = ?";
    }
    
    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    
    try {
        conn = new conexao().getConnection();
        ps = conn.prepareStatement(sql);
        
        // Define os parâmetros da query de acordo com os critérios fornecidos
        int index = 1;
        if (titulo != null && !titulo.isEmpty()) {
            ps.setString(index++, "%" + titulo + "%");
        }
        if (autor != null && !autor.isEmpty()) {
            ps.setString(index++, "%" + autor + "%");
        }
        if (genero != null && !genero.isEmpty()) {
            ps.setString(index++, "%" + genero + "%");
        }
        if (anoPublicacao != null && !anoPublicacao.isEmpty()) {
            ps.setString(index++, anoPublicacao);
        }
        
        // Executa a consulta
        rs = ps.executeQuery();
        
        // Processa os resultados
        while (rs.next()) {
            Livro livro = new Livro();
            livro.setTitulo(rs.getString("TITULO"));
            livro.setAutor(rs.getString("AUTOR"));
            livro.setGenero(rs.getString("GENERO"));
            livro.setEditora(rs.getString("EDITORA"));
            livro.setIsbn(rs.getString("ISBN"));
            livro.setAnoPublicacao(rs.getString("ANO_PUBLICACAO"));
            livro.setNumeroPaginas(rs.getString("NUMERO_PAGINAS"));
            
            resultados.add(livro);
        }
        
    } catch (SQLException e) {
        throw new Exception("Erro ao pesquisar livros: " + e.getMessage());
    } finally {
        // Fecha os recursos
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao fechar recursos: " + e.getMessage());
        }
    }
    
    return resultados;
}

    public void pesquisarLivros(Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
