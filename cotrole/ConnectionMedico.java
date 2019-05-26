package cotrole;

import modelo.Medico;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Paciente;

public class ConnectionMedico {
    
    ConnectionDB connection = new ConnectionDB();
    Paciente p = new Paciente();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean Insert(Medico m,int cod){
        String query = "insert into Medico(Especialidade,codigomedico) values(?,?)";
        connection.Connect();
        try{
            pst = connection.conn.prepareStatement(query);
            
            pst.setString(1,m.getEspecialidade());
            pst.setInt(2,m.getCodigomedico());

            pst.execute();
            return true; 
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    public boolean update(Medico m,int cod){
        String query="update Medico set especialidade=?,codigoMedico=?, where cod_Medico=?";
        connection.Connect();
        try{
             pst = connection.conn.prepareStatement(query);
            
            pst.setString(1,m.getEspecialidade());
            pst.setInt(2,m.getCodigoMedico());
            pst.setInt(3,cod);
            
            pst.execute();
            return true; 
           
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    public boolean Delete(Medico m,int cod){
        String query = "delete from Medico where cod_Medico";
        connection.Connect();
        try{
            pst = connection.conn.prepareStatement(query);
            pst.setInt(1,cod);
            pst.execute();
            return true;
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
}
