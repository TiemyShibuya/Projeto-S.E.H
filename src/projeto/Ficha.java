package projeto;

import java.util.Date;

public class Ficha extends Paciente {

    protected int peso;
    protected int altura;
    protected String alergia;
    protected String descricao;
    protected String tipoSG;
    protected String medicamento;
    protected Date data;
    protected int idPac;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTipoSanguineo(String tipo) {
        this.tipoSG = tipo;
    }

    public String getTipoSanguineo() {
        return tipoSG;
    }

    public void setAlergia(String al) {
        this.alergia = al;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setMedicamento(String med) {
        this.medicamento = med;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setIdpac(int idPac) {
        this.idPac = idPac;
    }

    public int getIdpac() {
        return idPac;
    }

}
