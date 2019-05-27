package cotrole;

import modelo.Ficha;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Funcionario;
import modelo.Paciente;


public class ConnectionFicha {
    ConnectionDB connection = new ConnectionDB();
    Paciente p = new Paciente();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Inserindo os dados
    public boolean Insert(Ficha f,int cod){
        String query = "insert into Ficha(altura,peso,descricao,tipoSanguineo,alergia,medicamento) values(?,?,?,?,?,?,?)";
        connection.Connect();
        try{
            pst = connection.conn.prepareStatement(query);
            
            pst.setInt(1,f.getAltura());
            pst.setInt(2,f.getPeso());
            pst.setString(3,f.getDescricao());
            pst.setString(4,f.getTipoSanguineo());
            pst.setString(5,f.getAlergia());
            pst.setString(6,f.getMedicamento());
            

            pst.execute();
            return true; 
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    //Atualizando os dados
    public boolean update(Ficha f,int cod){
        String query="update Ficha set altura=?,peso=?,descricao=?,tipoSanguineo=?,alergia=?,medicamento=? where cod_pac=?";
        connection.Connect();
        try{
             pst = connection.conn.prepareStatement(query);
            
            pst.setInt(1,f.getAltura());
            pst.setInt(2,f.getPeso());
            pst.setString(3,f.getDescricao());
            pst.setString(4,f.getTipoSanguineo());
            pst.setString(5,f.getAlergia());
            pst.setString(6,f.getMedicamento());
            pst.setInt(7,cod);
            
            pst.execute();
            return true; 
           
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    //Deletando os dados
    public boolean Delete(Ficha f,int cod){
        String query = "delete from Ficha where cod_pac";
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
