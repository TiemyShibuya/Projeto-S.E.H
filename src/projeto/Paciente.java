package projeto;

import java.util.Date;

public class Paciente {

    private int idPac;
    private String nome;
    private String cpf;
    private String sexo;
    private int idade;
    private Date dataNasc;
    private String telefone;
    private String endereco;
    private String rg;
    private int emergencia;
    private int enfermeira_idEnf;
    private int medico_idMed;

    public int getIdPac() {
        return idPac;
    }

    public void setIdPac(int idPac) {
        this.idPac = idPac;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(int emergencia) {
        this.emergencia = emergencia;
    }

    public int getEnfid() {
        return enfermeira_idEnf;
    }

    public void setEnfid(int enf) {
        this.enfermeira_idEnf = enf;
    }

    public int getMedid() {
        return medico_idMed;
    }

    public void setMedid(int med) {
        this.medico_idMed = med;
    }

}
