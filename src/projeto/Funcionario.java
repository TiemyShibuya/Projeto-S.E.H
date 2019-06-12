package projeto;

public class Funcionario extends Pessoa {
    private int funcionario_id; 
    private String usuario;
    private String senha;
    private String horarioI;
    private String horarioF;
    private int permissao;
    
    public void FazerLogin(){
         System.out.println("Realizar o login");
    }       
    public void MandarMensagem(){
         System.out.println("Funcionario mandando mensagem");
    }
    
    //Construtores
    public Funcionario(){
        System.out.println("Objeto funcionário criado");
    }
    public Funcionario(String User,String Senha,String HorarioI,String HorarioF){
        usuario = User;
        senha = Senha;
        horarioI = HorarioI;
        horarioF = HorarioF;
    }

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getHorarioI() {
        return horarioI;
    }

    public void setHorarioI(String horarioI) {
        this.horarioI = horarioI;
    }

    public String getHorarioF() {
        return horarioF;
    }

    public void setHorarioF(String horarioF) {
        this.horarioF = horarioF;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }
           
  
            
}
