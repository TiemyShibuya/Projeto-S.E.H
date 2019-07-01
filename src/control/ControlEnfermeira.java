package control;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Enfermeira;

public class ControlEnfermeira {

    conexaoDB con = new conexaoDB();
    Enfermeira enf = new Enfermeira();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Create(Enfermeira enf) {
        String query = "insert into enfermeira (cpf,nome,sexo,idade,dataNasc,telefone,endereco,cargo,permissao,usuario,senha)values(?,?,?,?,?,?,?,?,?,?,?)";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, enf.getCpf());
            pst.setString(2, enf.getNome());
            pst.setString(3, enf.getSexo());
            pst.setInt(4, enf.getIdade());
            pst.setString(5, enf.getDataNasc());
            pst.setString(6, enf.getTelefone());
            pst.setString(7, enf.getEndereco());
            pst.setString(8, enf.getCargo());
            pst.setInt(9, enf.getPermissao());
            pst.setString(10, enf.getUsuario());
            pst.setString(11, enf.getSenha());

            pst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
    }

    public void Update(Enfermeira enf, int id) {
        String query = "update enfermeira into nome=?,cpf=?,sexo=?,idade=?,dataNasc=?,telefone=?,endereco=?,cargo=?,permissao=?,usuario=?,senha=? where idEnf = ?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, enf.getNome());
            pst.setString(2, enf.getCpf());
            pst.setString(3, enf.getSexo());
            pst.setInt(4, enf.getIdade());
            pst.setString(5, enf.getDataNasc());
            pst.setString(6, enf.getTelefone());
            pst.setString(7, enf.getEndereco());
            pst.setString(8, enf.getCargo());
            pst.setInt(9, enf.getPermissao());
            pst.setString(10, enf.getUsuario());
            pst.setString(11, enf.getSenha());
            pst.setInt(12, id);

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        con.Disconnect();

    }

    public void Delete(int id) {
        String query = "delete from enfermeira where idEnf=?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setInt(1, id);

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }

        con.Disconnect();

    }

}
