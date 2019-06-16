package control;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Enfermeira;

/**
 *
 * @author Tiemy Shibuya
 */
public class ControlEnfermeira {

    conexaoBD con = new conexaoBD();
    Enfermeira enf = new Enfermeira();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Create(Enfermeira enf) {
        String query = "insert into enfermeira (cpf,nome,sexo,idade,DataNasc,telefone,endereco,cargo)values(?,?,?,?,?,?,?,?)";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, enf.getCPF());
            pst.setString(2, enf.getNome());
            pst.setString(3, enf.getSexo());
            pst.setInt(4, enf.getIdade());
            pst.setDate(5, (Date) enf.getData_de_nascimento());
            pst.setString(6, enf.getTelefone());
            pst.setString(7, enf.getEndereco());
            pst.setString(8, enf.getCargo());

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
    }

    public void Update(Enfermeira enf, int id) {
        String query = "update enfermeira into cpf=?,nome=?,sexo=?,idade=?,DataNasc=?,telefone=?,endereco=?,rg=?,cargo=? where codEnf = ?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, enf.getCPF());
            pst.setString(2, enf.getNome());
            pst.setString(3, enf.getSexo());
            pst.setInt(4, enf.getIdade());
            pst.setDate(5, (Date) enf.getData_de_nascimento());
            pst.setString(6, enf.getTelefone());
            pst.setString(7, enf.getEndereco());
            pst.setString(8, enf.getCargo());
            pst.setInt(9, id);

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        con.Disconnect();

    }

    public void Delete(int id) {
        String query = "delete from enfermeira where codEnf=?";
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
