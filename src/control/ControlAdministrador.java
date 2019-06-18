package control;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Administrador;
import projeto.Enfermeira;

public class ControlAdministrador {

    conexaoBD con = new conexaoBD();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Administrador admin = new Administrador();

    public void Create(Administrador ad) {
        String query = "insert into administrador (cpf,nome,sexo,idade,DataNasc,telefone,endereco,usuario,senha,permissao)values(?,?,?,?,?,?,?,?,?,?)";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, ad.getCpf());
            pst.setString(2, ad.getNome());
            pst.setString(3, ad.getSexo());
            pst.setInt(4, ad.getIdade());
            pst.setDate(5, (Date) ad.getDataNasc());
            pst.setString(6, ad.getTelefone());
            pst.setString(7, ad.getEndereco());
            pst.setString(9, ad.getUsuario());
            pst.setString(10, ad.getSenha());
            pst.setInt(11, ad.getPermissao());

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
    }

    public void Update(Administrador ad, int id) {
        String query = "update enfermeira into cpf=?,nome=?,sexo=?,idade=?,DataNasc=?,telefone=?,endereco=?,rg=?,usuario=?,senha=?,permissao=? where idAdmin = ?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, ad.getCpf());
            pst.setString(2, ad.getNome());
            pst.setString(3, ad.getSexo());
            pst.setInt(4, ad.getIdade());
            pst.setDate(5, (Date) ad.getDataNasc());
            pst.setString(6, ad.getTelefone());
            pst.setString(7, ad.getEndereco());
            pst.setString(9, ad.getUsuario());
            pst.setString(10, ad.getSenha());
            pst.setInt(11, ad.getPermissao());
            pst.setInt(12, id);

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        con.Disconnect();

    }

    public void Delete(int id) {
        String query = "delete from administrador where idAdmin=?";
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
