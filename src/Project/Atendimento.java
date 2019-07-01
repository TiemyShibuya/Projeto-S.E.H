package projeto;

import java.util.Date;

public class Atendimento {

    private int Medico_idMed;
    private int Enfermeira_idEnf;
    private int Paciente_idPac;
    private Date date;

    public int getMedico_idMed() {
        return Medico_idMed;
    }

    public void setMedico_idMed(int Medico_idMed) {
        this.Medico_idMed = Medico_idMed;
    }

    public int getEnfermeira_idEnf() {
        return Enfermeira_idEnf;
    }

    public void setEnfermeira_idEnf(int Enfermeira_idEnf) {
        this.Enfermeira_idEnf = Enfermeira_idEnf;
    }

    public int getPaciente_idPac() {
        return Paciente_idPac;
    }

    public void setPaciente_idPac(int Paciente_idPac) {
        this.Paciente_idPac = Paciente_idPac;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
