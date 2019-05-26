package modelo;

public class Paciente {
    protected int codigoPaciente;
    protected int emergencia;
    
    public void setCodigoPaciente(int cod){
        this.codigoPaciente = cod;
    }
    public int getCodigoPaciente(){
        return codigoPaciente;
    }
    
    public void setEmergencia(int em){
        this.emergencia = em;
    }
    
    public int getEmergencia(){
        return emergencia;
    }
    
}
