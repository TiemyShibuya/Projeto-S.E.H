package projeto;

public class Medico extends Funcionario {

    protected int codMed;
    protected String especialidade;
    protected String relatorio;

    //Métodos
    public void setEspecialidade(String esp) {
        this.especialidade = esp;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setRelatorio(String rel) {
        this.relatorio = rel;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setCodigoMedico(int cod) {
        this.codMed = cod;
    }

    public int getCodigoMedico() {
        return codMed;
    }

    public void verFicha() {
        System.out.println("ver ficha");
    }

    public void PreencherFicha() {
        System.out.println("preenchendo a ficha");
    }

    public void TotaldeAtendimento() {
        System.out.println("olhando o total de atendimento");
    }

    //Construtores
    public Medico() {
        System.out.println("Objeto medico criado");
    }

    public Medico(String esp, int cod) {
        especialidade = esp;
        codMed = cod;
    }

}
