package cotrole;

import modelo.Funcionario;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Paciente;

public class ConnectionFuncionario {
    
    ConnectionDB connection = new ConnectionDB();
    Paciente p = new Paciente();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Inserindo os dados
    public boolean Insert(Funcionario f,String user){
        String query = "insert into Funcioanrio(usuario,senha,HorarioI,HorarioF) values(?,?,?,?)";
        connection.Connect();
        try{
            pst = connection.conn.prepareStatement(query);
            
            pst.setString(1,f.getUsuario());
            pst.setInt(2,f.getSenha());
            pst.setString(3,f.getHorarioI());
            pst.setString(4,f.getHorarioF());
            

            pst.execute();
            return true; 
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    //Atualizando os dados
    public boolean update(Funcionario f,String user){
        String query="update Funcionario set usuario=?,senha=?,HorarioI=?,HorarioF=?, where cod_Medico=?";
        connection.Connect();
        try{
             pst = connection.conn.prepareStatement(query);
            
            pst.setString(1,f.getUsuario());
            pst.setInt(2,f.getSenha());
            pst.setString(3,f.getHorarioI());
            pst.setString(4,f.getHorarioF());
            pst.setString(5,user);
            
            pst.execute();
            return true; 
           
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    //Deletando os dados
    public boolean Delete(Funcionario f,int cod){
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
