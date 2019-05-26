package cotrole;

import modelo.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPaciente {
    
    ConnectionDB connection = new ConnectionDB();
    Paciente p = new Paciente();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean Insert(Paciente p,int cod){
        String query = "insert into Paciente(codigoPaciente,Emergencia) values(?,?)";
        connection.Connect();
        try{
            pst = connection.conn.prepareStatement(query);
            
            pst.setInt(1,p.getCotigoPaciente());
            pst.setInt(2,p.getEmergencia());
        
            
            pst.execute();
            return true; 
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    public boolean update(Paciente p,int cod){
        String query="update Paciente set codigoPaciente=?,emergencia=?, where cod_paciente=?";
        connection.Connect();
        try{
             pst = connection.conn.prepareStatement(query);
            
            pst.setInt(1,p.getCodigoPaciente());
            pst.setInt(2,p.getEmergencia());
            pst.setInt(3,cod);
            
            pst.execute();
            return true; 
           
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    public boolean Delete(Paciente p,int cod){
        String query = "delete from Paciente where cod_paciente";
        connection.Connect();
        try{
            pst = connection.conn.prepareStatement(query);
            pst.setString(1,cod);
            pst.execute();
            return true;
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
}
