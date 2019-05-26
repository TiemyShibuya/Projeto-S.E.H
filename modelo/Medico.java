package modelo;

public class Medico extends Funcionario{
    protected String especialidade;
    protected  int codigoMedico;
    
    
    public void setEspecialidade(String esp){
        this.especialidade = esp;
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setCodigoMedico(int cod){
        this.codigoMedico = cod;
    }
    
    public int getCodigoMedico(){
        return codigoMedico;
    }
    
    public void verFicha(){
        System.out.println("ver ficha");
    }
    public void PreencherFicha(){
        System.out.println("preenchendo a ficha");
    }
    public void TotaldeAtendimento(){
        System.out.println("olhando o total de atendimento");
    }
    
}
