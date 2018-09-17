package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAdm;
import modeloConection.ConexaoBD;

/**
 *
 * @author Cah
 */
public class ControleAdm {
    
    ConexaoBD conex = new ConexaoBD();
    BeansAdm mod = new BeansAdm();
    
    public void Salvar(BeansAdm mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into  ctrl_adm (nome,usuario,senha)values(?,?,?)");
          
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getUsuario());
            pst.setString(3,mod.getSenha());
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
        
        conex.desconecta();
    }
    public void EditarUser(BeansAdm mod){
                    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update ctrl_adm set nome=?,usuario=?,senha=? where id_adm=?");
           pst.setString(1,mod.getNome());
            pst.setString(2,mod.getUsuario());
            pst.setString(3,mod.getSenha());
             pst.setInt(4,mod.getId_adm());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados Alterados com sucesso!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na alteração dos dados!/nErro:");
         }
       conex.desconecta();
    }
    
    public void Excluir(BeansAdm mod){
       conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from ctrl_adm where id_adm=?");
            pst.setInt(1,mod.getId_adm());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso!");  
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao excluir!/nErro:"+ex);
        }
    }
    public BeansAdm buscaAdm(BeansAdm mod){
        conex.conexao();
        
         conex.executaSql("select * from ctrl_adm where nome like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setId_adm(conex.rs.getInt("id_adm"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setUsuario(conex.rs.getString("usuario"));
            mod.setSenha(conex.rs.getString("senha"));
         ;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR na pesquisa!");
        }
        
        conex.desconecta();
        return mod;
 }
    
}
