package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexaoDB {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/hospital_s.e.h";
    private String user = "Natyemy";
    private String password = "nyemy";
    public Connection conn;
    public ResultSet rs;

    public conexaoDB() {
        this.rs = rs;
        this.conn = conn;
    }

    //Fazendo a conexão com o Banco de dados
    public boolean Connect() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(url, user, password);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar com banco de dados!" + ex.getMessage(), "Erro no", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //fazendo a desconexão com o Banco de dados
    public boolean Disconnect() {
        try {
            conn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível desconectar com o banco de dados!" + ex.getMessage(), "Erro no Logout", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //Retorna o status da conexão do banco
    public boolean status() {
        if (Connect() == true) {
            System.out.println("Conexão estabelecida");
            return true;
        } else {
            System.err.println("Desconectado");
            return false;
        }

    }
}
