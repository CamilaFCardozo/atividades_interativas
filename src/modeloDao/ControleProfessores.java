
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansProfessores;
import modeloConection.ConexaoBD;

/**
 *
 * @author Cah
 */
public class ControleProfessores {
    
    ConexaoBD conex = new ConexaoBD();
    BeansProfessores mod = new BeansProfessores();
    
    public void Salvar(BeansProfessores mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into  professores (nome,usuario,senha)values(?,?,?)");
          
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getUsuario());//se der erro escreva double
            pst.setString(3,mod.getSenha());
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR!/N:"+ex);
        }
        
        conex.desconecta();
    }
    public void EditarUser(BeansProfessores mod){
                    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update professores set nome=?,usuario=?,senha=? where id_professor=?");
           pst.setString(1,mod.getNome());
            pst.setString(2,mod.getUsuario());
            pst.setString(3,mod.getSenha());
             pst.setInt(4,mod.getId_professor());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados Alterados com sucesso!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na alteração dos dados!/nErro:"+ex);
         }
       conex.desconecta();
    }
    
    public void Excluir(BeansProfessores mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from professores where id_professor=?");
            pst.setInt(1,mod.getId_professor());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso!");  
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao excluir!/nErro:"+ex);
        }
    }
    public BeansProfessores buscaProfessores(BeansProfessores mod){
        conex.conexao();
        
         conex.executaSql("select * from professores where nome like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setId_professor(conex.rs.getInt("id_professor"));
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
