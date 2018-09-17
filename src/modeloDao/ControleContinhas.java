/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloBeans.BeansContinhas;

/**
 *
 * @author Cah
 */
public class ControleContinhas {

    ConexaoBD conex = new ConexaoBD();
    BeansContinhas mod = new BeansContinhas();

    public void Salvar(BeansContinhas mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into  ranking2 (id_aluno, pontos)values(?,?)");
  

            // pst.setInt(1, mod.getId());
            pst.setInt(1, mod.getId_aluno());
            pst.setInt(2, mod.getPontos());

            pst.execute();
            JOptionPane.showMessageDialog(null, "ENVIADO PARA O RANKING");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR!" + ex);
        }
        conex.desconecta();

    }
    public void EditarUser(BeansContinhas mod){
                    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update ranking2 set pontos = pontos + ? where id_aluno = ? ");
            
           // ;
            pst.setInt(1, mod.getPontos());
            pst.setInt(2, mod.getId_aluno());
            ;
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"NOVA PONTUAÇÃO ENVIADA PARA O RANKING!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na alteração dos dados!/nErro:"+ex);
         }
       conex.desconecta();
    }

    public BeansContinhas buscaResultado(BeansContinhas mod) {
        conex.conexao();

        conex.executaSql("select * from ranking2 where id_aluno like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setId_aluno(conex.rs.getInt("id_aluno"));
            mod.setPontos(conex.rs.getInt("pontos"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR na pesquisa!" + ex);
        }

        conex.desconecta();
        return mod;
    }

}
