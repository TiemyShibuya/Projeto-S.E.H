package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Ficha;

public class ControlFicha {

    conexaoBD con = new conexaoBD();
    Ficha f = new Ficha();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Create(Ficha f) {
        String query = "insert into ficha (peso,altura,alergia,descricao,tipoSG,medicamento,idPac) values(?,?,?,?,?,?,?)";
        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);

            pst.setInt(1, f.getPeso());
            pst.setInt(2, f.getAltura());
            pst.setString(3, f.getAlergia());
            pst.setString(4, f.getDescricao());
            pst.setString(5, f.getTipoSanguineo());
            pst.setString(6, f.getMedicamento());
            pst.setInt(7, f.getIdpac());

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
    }

    public void Update(Ficha f, int id) {
        String query = "update ficha set peso=?,altura=?,alergia=?,descricao=?,tipoSG=?,medicamento=? where idPac=?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setInt(1, f.getPeso());
            pst.setInt(2, f.getAltura());
            pst.setString(3, f.getAlergia());
            pst.setString(4, f.getDescricao());
            pst.setString(5, f.getTipoSanguineo());
            pst.setString(6, f.getMedicamento());
            pst.setInt(7, f.getIdpac());
            pst.setInt(8, id);

            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro durante a alteracao!", "Alteracao de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();

        }
        con.Disconnect();

    }

    public void Delete(int id) {
        String query = "delete from ficha where idPac=?";
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
