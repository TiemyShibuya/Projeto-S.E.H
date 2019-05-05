package projeto;

import java.util.Scanner;
import java.util.Date;

public class Main {
     public static void main(String[] args) {
         //Variáveis
         String nome,cpf,endereco,rg,cargo,telefone;
         int idade;
         Date data;
         
         //Instanciando e criando um objeto Scanner
         Scanner ler = new Scanner(System.in);
         
         //Instanciando as classes criadas
         Enfermeira E1 = new Enfermeira();
         Medico M1 = new Medico();
         Paciente P1 = new Paciente();
         Ficha F1 = new Ficha();
         
         //Pedindoos dados para o usuário
         System.out.println("Olá enfermeiro(a)!!\n");
         System.out.printf("Informe o seu nome:");
         nome = ler.nextLine(); //entrada de dados (lendo uma string)
         
         System.out.printf("Informe o seu CPF:");
         cpf = ler.nextLine();
         
         System.out.printf("Informe o seu rg:");
         rg = ler.nextLine();
         
         System.out.printf("Informe o seu telefone:");
         telefone = ler.nextLine();
         
         System.out.printf("Informe o seu cargo:");
         cargo = ler.nextLine();
         
        //Os dados do funcionario
         E1.setNome(nome);
         E1.setCPF(cpf);
         E1.setRG(rg);
         E1.setTelefone(telefone);
         E1.setCargo(cargo);
         
        //Os métodos
         E1.FazerLogin();
         E1.MandarMensagem();
         E1.FazerCadastro();
         
         System.out.printf("Os dados do usuario %s :\n",E1.getNome());
         System.out.printf("CPF :%s\n",E1.getCPF());
         System.out.printf("RG :%s\n",E1.getRG());
         System.out.printf("Telefone :%s\n",E1.getTelefone());
         System.out.printf("Cargo :%s\n",E1.getCargo());
         
   
    }
}
