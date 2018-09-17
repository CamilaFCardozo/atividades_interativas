/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/professor" ;
    private final String usuario = "root";
    private final String senha = "";
    public Connection con;// responavel por realizar a conexao
    
    public void conexao(){
        
        try {
            
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
         //  JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!!");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao conectar o banco de dados:\n"+ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);//TYPE_SCROLL_INSENSITIVE não diferencia a pesquisa de maiuscula e minuscula
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na funcao ExecutaSql:\n"+ex.getMessage());
        }
        
    
    }
    
    public void desconecta(){
        try {
            con.close();
      //      JOptionPane.showMessageDialog(null, "BD desconectado com sucesso!");
                    
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao desconectar BD:\n"+ex.getMessage());

        }
        
    }
    
    
}
