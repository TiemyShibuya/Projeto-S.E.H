
package modelo;

public class Enfermeira extends Funcionario {
    protected int codigoEnf;
    protected String cargo;
    
    public int getCodigo(){
        return codigoEnf;
    }
    public void setCodigo(int codigo){
        this.codigoEnf = codigo;
 
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
      
    }
    
    public Enfermeira(){
        System.out.println("Objeto enfermeira criado");
    }
    
    public Enfermeira(int codigo,String Cargo){
        codigoEnf = codigo;
        cargo = Cargo;
    }
    
    public void FazerCadastro(){
        System.out.println("Enfermeira fazendo o cadastro do cliente");
    }
     public void PesquisarCadastro(){
         
     }
     public void FazerUpdate(){
         
     }
     public void PesquisarMedico(){
         
     }
     public void PreencherFicha(){
         
     }
}
