package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAlunos;
import modeloConection.ConexaoBD;

/**
 *
 * @author Cah
 */
public class ControleAlunos {

    ConexaoBD conex = new ConexaoBD();
    BeansAlunos mod = new BeansAlunos();

    public void Salvar(BeansAlunos mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into  alunos ( imagem, nome, serie, ano_cadastro)values(?,?,?,?)");

            pst.setBytes(1, mod.getImagem());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getSerie());
            pst.setString(4, mod.getAno_cadastro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR!" + ex);
        }

        conex.desconecta();
    }

    public void EditarUser(BeansAlunos mod) {

        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update alunos set imagem=?, nome=?, serie=?, ano_cadastro=? where cod_acesso=?");

            //   pst.setBytes(1,mod.getImagem());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getSerie());
            pst.setString(4, mod.getAno_cadastro());
            pst.setInt(5, mod.getCod_acesso());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!" + ex);
        }
        conex.desconecta();
    }

    public void Excluir(BeansAlunos mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from alunos where cod_acesso=?");
            pst.setInt(1, mod.getCod_acesso());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!/nErro:");
        }
    }

    public BeansAlunos buscaAlunos(BeansAlunos mod) {
        conex.conexao();

        conex.executaSql("select * from alunos where nome like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCod_acesso(conex.rs.getInt("cod_acesso"));
            mod.setImagem(conex.rs.getBytes("imagem"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setSerie(conex.rs.getString("serie"));
            mod.setAno_cadastro(conex.rs.getString("ano_cadastro"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR na pesquisa!" + ex);
        }

        conex.desconecta();
        return mod;
    }

}
