/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBD;


// Conexão com o banco de dados
import java.sql.Connection; 

// Carrega o driver de conexão
import java.sql.DriverManager;

// Biblioteca que traz erros de banco de dados
import java.sql.SQLException;

/**
 *
 * @author Prog_Sis
 */
public class conexao {
    public Connection getConnection(){
        
        // Variavel de conexão, inicia nula.
        Connection conn = null;
        
        // Variáveis de conexão mysql
        String servidor = "localhost";
        String porta    = "3306";
        String usuario  = "root";
        String senha    = "123456";
        String banco    = "biblioteca_integrador";
        
        // Verificação de carregamento do drive de conexão
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Mostra qual vai ser a tentativa de conexão
        } catch (Exception e) { // Faz com que caso a tentativa não de certo ele mostre o erro que esta dando
            e.printStackTrace();
        }
        
        // Executa a conexão
        try {
            // esta falando de onde pegar a conexão, para se conectar ao sql
            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + ":" + porta + "/" + banco, usuario, senha);
            //conn = DriverManager.getConnection("jdbc:mysql//localhost:3306",usuario,senha);
        } catch (SQLException e) {
            e.printStackTrace(); // Vai mostrar qual é o erro que deu e qual a causa
        }
        
        return conn; // Faz com que retorne a conexão com o sql
        
    }
}
