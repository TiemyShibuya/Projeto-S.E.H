package projeto;

public class Enfermeira extends Funcionario {

    protected int codEnf;
    protected String cargo;

    public int getCodigo() {
        return codEnf;
    }

    public void setCodigo(int codigo) {
        this.codEnf = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void FazerCadastro() {
        System.out.println("Enfermeira fazendo o cadastro do paciente");
    }

    public void PesquisarCadastro() {
        System.out.println("Enfermeira pesquisando cadastro do paciente");
    }

    public void FazerUpdate() {
        System.out.println("Enfermeira fazendo update dos dados");
    }

    public void PesquisarMedico() {
        System.out.println("Enfermeira pesquisando o médico");
    }

    public void PreencherFicha() {
        System.out.println("Enfermeira preenchendo a ficha");
    }

    //Construtores
    public Enfermeira() {
        System.out.println("Objeto enfermeira criado");
    }

    public Enfermeira(int codigo, String Cargo) {
        codEnf = codigo;
        cargo = Cargo;
    }
}
