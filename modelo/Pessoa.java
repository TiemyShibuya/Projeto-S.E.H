package modelo;

import java.util.Date;

public class Pessoa {
    //Variáveis
    protected String nome;
    protected String cpf;
    protected String sexo;
    protected String data_de_nascimento;
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
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;

    }
    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getData_de_nascimento(){
        return data_de_nascimento;
    }
    public void setData_de_nascimento(String data_de_nascimento){
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
    public Pessoa(String Nome,String Cpf,String data,int Idade,String Telefone,String Endereco){
        nome = Nome;
        cpf = Cpf;
        data_de_nascimento = data;
        idade = Idade;
        telefone = Telefone;
        endereco = Endereco;
        
    }
    
     
   
    
}
