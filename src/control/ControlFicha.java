package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Ficha;

public class ControlFicha {

    conexaoDB con = new conexaoDB();
    Ficha f = new Ficha();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Create(Ficha f) {
        String query = "insert into ficha (Paciente_idPac,peso,altura,alergia,descricao,tipoSG,medicamento,date) values(?,?,?,?,?,?,?,?)";
        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);

            pst.setInt(1, f.getIdpac());
            pst.setInt(2, f.getPeso());
            pst.setInt(3, f.getAltura());
            pst.setString(4, f.getAlergia());
            pst.setString(5, f.getDescricao());
            pst.setString(6, f.getTipoSanguineo());
            pst.setString(7, f.getMedicamento());
            pst.setString(8, f.getData());

            pst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!", "Cadastro de Funcionario", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
    }

    public void Update(Ficha f, int id) {
        String query = "update ficha set peso=?,altura=?,alergia=?,descricao=?,tipoSG=?,medicamento=?,data=? where idPac=?";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);

            pst.setInt(1, f.getPeso());
            pst.setInt(2, f.getAltura());
            pst.setString(3, f.getAlergia());
            pst.setString(4, f.getDescricao());
            pst.setString(5, f.getTipoSanguineo());
            pst.setString(6, f.getMedicamento());
            pst.setString(6, f.getData());
            //pst.setInt(7, f.getIdpac());
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
