package control;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Paciente;

/**
 *
 * @author Tiemy Shibuya
 */
public class ControlPaciente {

    conexaoBD con = new conexaoBD();
    Paciente pac = new Paciente();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Create(Paciente pac) {
        String query = "insert into paciente (cpf,nome,sexo,idade,DataNasc,telefone,endereco,emergencia) values (?,?,?,?,?,?,?,?)";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, pac.getCPF());
            pst.setString(2, pac.getNome());
            pst.setString(3, pac.getSexo());
            pst.setInt(4, pac.getIdade());
            pst.setDate(5, (Date) pac.getData_de_nascimento());
            pst.setString(6, pac.getTelefone());
            pst.setString(7, pac.getEndereco());
            pst.setString(8, pac.getEmergencia());

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }

    }

    public void Update(Paciente pac, int id) {
        String query = "upate paciente into cpf=?,nome=?,sexo=?,idade=?,DataNasc=?,telefone=?,endereco=?,rg=?,emergencia=?";
        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, pac.getCPF());
            pst.setString(2, pac.getNome());
            pst.setString(3, pac.getSexo());
            pst.setInt(4, pac.getIdade());
            pst.setDate(5, (Date) pac.getData_de_nascimento());
            pst.setString(6, pac.getTelefone());
            pst.setString(7, pac.getEndereco());
            pst.setString(8, pac.getRG());
            pst.setString(9, pac.getEmergencia());

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        con.Disconnect();
    }

    public void Delete(int id) {
        String query = "delete from paciente where codPac=?";
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
