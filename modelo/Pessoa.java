/* Aula prática
 * Tiemy Shibuya Watanabe 5214
 */
package modelo;
import java.util.Date;

public class Pessoa {
    //Variáveis
    protected String nome;
    protected String cpf;
    protected Date data_de_nascimento;
    protected int idade;
    protected String telefone;
    protected String endereco;
    
    //Métodos
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public Date getData_de_nascimento(){
        return data_de_nascimento;
    }
    public void setData_de_nascimento(Date data_de_nascimento){
        this.data_de_nascimento = data_de_nascimento;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
  
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    //Construtor da classe Pessoa
    public Pessoa(){
        System.out.println("Objeto pessoa criado");
    }
    public Pessoa(String Nome,String Cpf,Date data,int Idade,String Telefone,String Endereco){
        nome = Nome;
        cpf = Cpf;
        data_de_nascimento = data;
        idade = Idade;
        telefone = Telefone;
        endereco = Endereco;
        
    }
    
     
   
    
}
