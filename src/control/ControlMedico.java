package control;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Medico;

public class ControlMedico {

    /*conexão com o banco*/
    conexaoBD con = new conexaoBD();
    Medico med = new Medico();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Create(Medico med) {
        String query = "insert into medico(nome,cpf,sexo,idade,dataNasc,telefone,endereco,especialidade,relatorio,usuario,senha,permissao) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, med.getNome());
            pst.setString(2, med.getCpf());
            pst.setString(3, med.getSexo());
            pst.setInt(4, med.getIdade());
            pst.setDate(5, (Date) med.getDataNasc());
            pst.setString(6, med.getTelefone());
            pst.setString(7, med.getEndereco());
            pst.setString(8, med.getUsuario());
            pst.setString(9, med.getSenha());
            pst.setInt(10, med.getPermissao());
            pst.setString(11, med.getEspecialidade());
            pst.setString(12, med.getRelatorio());

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();

        }

    }

    public void Update(Medico med, int id) {
        String query = "update medico set nome=?,cpf=?,sexo=?,idade=?,dataNasc=?,telefone=?,endereco=?,rg=?,especialidade=?,relatorio=?,usuario=?,senha=?,permissao=? where idMed=?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, med.getNome());
            pst.setString(2, med.getCpf());
            pst.setString(3, med.getSexo());
            pst.setInt(4, med.getIdade());
            pst.setDate(5, (Date) med.getDataNasc());
            pst.setString(6, med.getTelefone());
            pst.setString(7, med.getEndereco());
            pst.setString(8, med.getUsuario());
            pst.setString(9, med.getSenha());
            pst.setInt(10, med.getPermissao());
            pst.setString(11, med.getEspecialidade());
            pst.setString(12, med.getRelatorio());
            pst.setInt(13, id);

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        con.Disconnect();

    }

    public void Delete(int id) {
        String query = "delete from medico where idMed=?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setInt(1, id);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Medico excluido com sucesso!", "Exclusao de Funcionario", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
        con.Disconnect();
    }

}
