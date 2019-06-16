package projeto;

public class Paciente extends Pessoa {

    protected int codPac;
    protected String emergencia;

    //métodos
    public void setCodigoPaciente(int cod) {
        this.codPac = cod;
    }

    public int getCodigoPaciente() {
        return codPac;
    }

    public void setEmergencia(String em) {
        this.emergencia = em;
    }

    public String getEmergencia() {
        return emergencia;
    }

    //Construtores
    public Paciente() {
        System.out.println("Objeto Paciente criado");
    }

    public Paciente(int cod, String emerg) {
        codPac = cod;
        emergencia = emerg;
    }
}
