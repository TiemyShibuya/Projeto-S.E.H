package control;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Funcionario;
import projeto.Pessoa;

/**
 *
 * @author Tiemy Shibuya
 */
public class ControlFuncionario {

    /*conexão com o banco*/
    conexaoBD con = new conexaoBD();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Funcionario fun = new Funcionario();
    Pessoa pe = new Pessoa();

    public void Create(Funcionario fun) {
        String query = "insert into pessoa(cpf,nome,sexo,idade,DataNasc,telefone,endereco) values(?,?,?,?,?,?,?)";
        String query1 = "insert into funcionario(usuario,senha,permissao) values(?,?,?)";

        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, fun.getCPF());
            pst.setString(2, fun.getNome());
            pst.setString(3, fun.getSexo());
            pst.setInt(4, fun.getIdade());
            pst.setDate(5, (Date) fun.getData_de_nascimento());
            pst.setString(6, fun.getTelefone());
            pst.setString(7, fun.getEndereco());
            pst.setString(8, fun.getRG());
            pst.execute();

            pst = con.conn.prepareStatement(query1);
            pst.setString(1, fun.getUsuario());
            pst.setString(2, fun.getSenha());
            pst.setInt(3, fun.getPermissao());
            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
        con.Disconnect();
    }

    public void Update(Funcionario fun, int id) {
        String query = "update pessoa p  funcionario f set p.cpf=?,p.nome=?,p.sexo=?,p.idade=?,p.DataNasc=?,p.telefone=?,p.endereco=?,f. where f.funcionrio_id=?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, fun.getCPF());
            pst.setString(2, fun.getNome());
            pst.setString(3, fun.getSexo());
            pst.setInt(4, fun.getIdade());
            pst.setDate(5, (Date) fun.getData_de_nascimento());
            pst.setString(6, fun.getTelefone());
            pst.setString(7, fun.getEndereco());
            pst.setInt(8, id);

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        con.Disconnect();

    }

    public void Delete(int id) {
        String query = "delete from funcionario where funcionario_id=?";
        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);
            pst.setInt(1, id);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso!", "Exclusao de Cliente", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
        you con
        .Disconnect();
    }

}
