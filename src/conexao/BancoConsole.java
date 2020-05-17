package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BancoConsole {

    public static void main(String[] args) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            connection.commit();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Erro! Driver JDBC não encontrado!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro! Problemas realizando a conexão ou Inclusão!");
            e.printStackTrace();
        }

    }

}
