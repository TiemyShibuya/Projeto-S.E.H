
package modelo;
import java.util.Date;

public class Funcionario extends Pessoa {
    protected String usuario;
    protected String senha;
    protected Date horarioI;
    protected Date horarioF;
    
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public Date getHorarioI(){
        return horarioI;
    }
    public void setHorarioI(Date horarioI){
         this.horarioI = horarioI;
      
    }
    public Date getHorarioF(){
        return horarioF;
    }
    public void setHorarioF(Date horarioF){
        this.horarioF = horarioF;
    }
    
    public Funcionario(){
        System.out.println("Objeto funcionário criado");
    }
    
    public Funcionario(String User,String Senha,Date HorarioI,Date HorarioF){
        usuario = User;
        senha = Senha;
        horarioI = HorarioI;
        horarioF = HorarioF;
    }
    
            
     public void FazerLogin(){
         System.out.println("Realizar o login");
     }       
     public void MandarMensagem(){
         System.out.println("Funcionario mandando mensagem");
     }       
            
           
            
}
