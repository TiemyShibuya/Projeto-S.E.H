package cotrole;

import modelo.Pessoa;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPessoa { 
    
    ConnectionDB connection = new ConnectionDB();
    Pessoa p = new Pessoa();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean Insert(Pessoa p,String cpf){
        String query = "insert into Pessoa(cpf,nome,sexo,idade,DataNasc,telefone,endereco) values(?,?,?,?,?,?)";
        connection.Connect();
        try{
            pst = connection.conn.prepareStatement(query);
            
            pst.setString(1,p.getCPF());
            pst.setString(2,p.getNome());
            pst.setString(3,p.getSexo());
            pst.setInt(4,p.getIdade());
            pst.setDate(5,p.getData_de_nascimento());
            pst.setInt(6,p.getTelefone());
            pst.setString(7,p.getEndereco());
            
            pst.execute();
            return true; 
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    public boolean update(Pessoa p,String cpf){
        String query="update Pessoa set cpf=?,nome=?,sexo=?,idade=?,DataNasc=?,telefone=?,endereco=? where cpf_pessoa=?";
        connection.Connect();
        try{
             pst = connection.conn.prepareStatement(query);
            
            pst.setString(1,p.getCPF());
            pst.setString(2,p.getNome());
            pst.setString(3,p.getSexo());
            pst.setInt(4,p.getIdade());
            pst.setDate(5,p.getData_de_nascimento());
            pst.setInt(6,p.getTelefone());
            pst.setString(7,p.getEndereco());
            pst.setString(8,cpf);
            
            pst.execute();
            return true; 
           
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    
    public boolean Delete(Pessoa p,String cpf){
        String query = "delete from Pessoa where cpf_pessoa=?";
        connection.Connect();
        try{
            pst = connection.conn.prepareStatement(query);
            pst.setString(1,cpf);
            pst.execute();
            return true;
        }catch(SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
        
}
