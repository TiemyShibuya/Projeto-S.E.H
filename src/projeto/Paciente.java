package projeto;

public class Paciente extends Pessoa{
    protected int codigoPaciente;
    protected String emergencia;
    
    //métodos
    public void setCodigoPaciente(int cod){
        this.codigoPaciente = cod;
    }
    public int getCodigoPaciente(){
        return codigoPaciente;
    }
    public void setEmergencia(String em){
        this.emergencia = em;
    }
    public String getEmergencia(){
        return emergencia;
    }
    
    //Construtores
    public Paciente(){
         System.out.println("Objeto Paciente criado");
    }
    public Paciente(int cod,String emerg){
        codigoPaciente = cod;
        emergencia = emerg;
    }
}
