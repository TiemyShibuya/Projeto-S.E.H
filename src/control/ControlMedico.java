package control;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Funcionario;
import projeto.Medico;
import projeto.Pessoa;

/**
 *
 * @author Tiemy Shibuya
 */
public class ControlMedico {

    /*conexão com o banco*/
    conexaoBD con = new conexaoBD();
    Funcionario fun = new Funcionario();
    Pessoa pe = new Pessoa();
    Medico med = new Medico();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Create(Funcionario fun, Pessoa pe, Medico med) {
        String query = "insert into pessoa(cpf,nome,sexo,idade,DataNasc,telefone,endereco) values(?,?,?,?,?,?,?)";
        String query1 = "insert into medico(especialidade,relatorio) values(?,?)";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, med.getCPF());
            pst.setString(2, med.getNome());
            pst.setString(3, med.getSexo());
            pst.setInt(4, med.getIdade());
            pst.setDate(5, (Date) med.getData_de_nascimento());
            pst.setString(6, med.getTelefone());
            pst.setString(7, med.getEndereco());

            pst.execute();

            pst = con.conn.prepareStatement(query1);
            pst.setString(1, med.getEspecialidade());
            pst.setString(2, med.getRelatorio());

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();

        }

    }

    public void Update(Medico med, int id) {
        String query = "update medico set cpf=?,nome=?,sexo=?,idade=?,DataNasc=?,telefone=?,endereco=?,rg=?,especialidade=?,relatorio=? where codMed=?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, med.getCPF());
            pst.setString(2, med.getNome());
            pst.setString(3, med.getSexo());
            pst.setInt(4, med.getIdade());
            pst.setDate(5, (Date) med.getData_de_nascimento());
            pst.setString(6, med.getTelefone());
            pst.setString(7, med.getEndereco());
            pst.setString(8, med.getRG());
            pst.setString(9, med.getEspecialidade());
            pst.setString(9, med.getRelatorio());
            pst.setInt(10, id);

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        con.Disconnect();

    }

    public void Delete(int id) {
        String query = "delete from medico where codigoMedico=?";
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
