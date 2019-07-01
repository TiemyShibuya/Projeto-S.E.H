package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Paciente;

public class ControlPaciente {

    conexaoDB con = new conexaoDB();
    Paciente pac = new Paciente();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Create(Paciente pac) {
        String query = "insert into peciente (nome,cpf,sexo,idade,dataNasc,telefone,endereco,rg,emergencia,enfermeira_id,medico_id) values(?,?,?,?,?,?,?,?,?,?,?)";

        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, pac.getNome());
            pst.setString(2, pac.getCpf());
            pst.setString(3, pac.getSexo());
            pst.setInt(4, pac.getIdade());
            pst.setString(5, pac.getDataNasc());
            pst.setString(6, pac.getTelefone());
            pst.setString(7, pac.getEndereco());
            pst.setString(8, pac.getRg());
            pst.setInt(9, pac.getEmergencia());
            pst.setInt(10, pac.getEnfid());
            pst.setInt(11, pac.getMedid());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Cadastro feito", "Cadastro de Paciente", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }

    }

    public void Update(Paciente pac, int id) {
        String query = "update paciente set nome=?,cpf=?,sexo=?,idade=?,DataNasc=?,telefone=?,endereco=?,rg=?,emergencia=?,enfermeira_idEnf=?,medico_idMed=? where idPac=?";
        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, pac.getNome());
            pst.setString(2, pac.getCpf());
            pst.setString(3, pac.getSexo());
            pst.setInt(4, pac.getIdade());
            pst.setString(5, pac.getDataNasc());
            pst.setString(6, pac.getTelefone());
            pst.setString(7, pac.getEndereco());
            pst.setString(8, pac.getRg());
            pst.setInt(9, pac.getEmergencia());
            pst.setInt(10, pac.getEnfid());
            pst.setInt(11, pac.getMedid());
            pst.setInt(12, id);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Alteração feita", "Alteração do dado do Paciente", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        con.Disconnect();
    }

    public void Delete(int id) {
        String query = "delete from paciente where idPac=?";
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
