package cotrole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Teste {
    public static void main(String[] args) {
        ConnectionDB bd = new ConnectionDB();
        ConnectionPessoa p = new ConnectionPessoa();

        System.out.println("Teste da conexÃ£o:");
        System.out.println(bd.Connect());

        System.out.println("Inserir:");
        System.out.println(p.insert());

        System.out.println("Deletar:");
        //System.out.println(bd.deleteExemplo());

        System.out.println("Atualizar:");
        //System.out.println(bd.updateExemplo());

        System.out.println("Consulta:");
        ResultSet result = bd.selectExemplo();
        try {
            while (result.next()) {
                System.out.println(result.getInt(1)+ " " + result.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }

        System.out.println("Desconectar:");
        System.out.println(bd.setDesconecta());
    }
}
