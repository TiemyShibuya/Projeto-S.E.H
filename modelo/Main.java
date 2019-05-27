package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         //Vetor
         String vetor[];
         vetor = new String[3];
         //Variáveis
         String nome,cpf,endereco,rg,cargo,telefone;
         int idade;
         Date data;
         int i=0;
         
         //Instanciando e criando um objeto Scanner
         Scanner ler = new Scanner(System.in);
         
         //Instanciando as classes criadas
         Enfermeira E1 = new Enfermeira();
         Paciente P1 = new Paciente();
         
         //Pedindoos dados para o usuário
         /*
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
         E1.setTelefone(telefone);
         E1.setCargo(cargo);
         */
        //Os métodos
         //E1.FazerLogin();
         E1.MandarMensagem(2,1);
        // E1.FazerCadastro();
        System.out.printf("Informe o seu nome:");
        nome = ler.nextLine();
        vetor[i]=nome;
        i++;
        while(nome != "para"){
         System.out.printf("Informe o seu nome:");
         nome = ler.nextLine();
         vetor[i]=nome;
         i++;
        }
        
        
        
        
         
         //System.out.printf("Os dados do usuario %s :\n",E1.getNome());
         //System.out.printf("CPF :%s\n",E1.getCPF());
         //System.out.printf("Telefone :%s\n",E1.getTelefone());
         //System.out.printf("Cargo :%s\n",E1.getCargo());
         
   
    }
}
