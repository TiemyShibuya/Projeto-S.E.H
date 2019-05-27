
package modelo;
import java.util.Date;

public class Funcionario extends Pessoa {
    protected String usuario;
    protected int senha;
    protected String horarioI;
    protected String horarioF;
    
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public int getSenha(){
        return senha;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    public String getHorarioI(){
        return horarioI;
    }
    public void setHorarioI(String horarioI){
         this.horarioI = horarioI;   
    }
    public String getHorarioF(){
        return horarioF;
    }
    public void setHorarioF(String horarioF){
        this.horarioF = horarioF;
    }
    
    public Funcionario(){
        System.out.println("Objeto funcionário criado");
    }
    
    public Funcionario(String User,int Senha,String HorarioI,String HorarioF){
        usuario = User;
        senha = Senha;
        horarioI = HorarioI;
        horarioF = HorarioF;
    }
    
     public void FazerLogin(){         
         System.out.println("Realizar o login");
     }       
     public void MandarMensagem(int i,int cod){
         if(cod == 0){//Enfermeira
             if(i==1){
             System.out.println("Preciso de assistência.Emergência máxima!!!!!!");
             }else if(i==2){
             System.out.println("Encaminhando o paciente");
            }
         }else if(cod == 1){//Médico
             if(i==1){
             System.out.println("Preciso de assistência.Emergência máxima!!!!!!");
             }else if(i==2){
             System.out.println("Atendimento finalizado");
            }
         }           
         //System.out.println("Funcionario mandando mensagem");
     }       
            
           
            
}
