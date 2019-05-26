package cotrole;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionDB {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/SEH_bd";
    private String user = "Natyemy";
    private String password = "nyemy";
    public Connection conn;
    public ResultSet rs;
    
    //Fazendo a conexão com o Banco de dados
    public boolean Connect(){
        try{
            System.setProperty("jdbc.Drivers",driver);
            conn = DriverManager.getConnection(url, user, password);           
            return true;
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Não foi possível conectar com banco de dados!"+ex.getMessage(),"Erro no",JOptionPane.ERROR_MESSAGE);           
            return false;
         }
    }
    
   //fazendo a desconexão com o Banco de dados
    public boolean Disconnect(){
        try{
            conn.close();            
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Não foi possível desconectar com o banco de dados!"+ex.getMessage(),"Erro no Logout",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    
}
