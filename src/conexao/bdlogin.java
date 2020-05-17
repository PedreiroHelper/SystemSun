package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P4 Solutions
 */
public class bdlogin {

    public static boolean login(String login, String senha) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";

        ResultSet rs = null;

        boolean check = false;
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM usuarios WHERE login = ? and senha = ?");

            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();
            if (rs.next()) {

                check = true;
            }
            stmt.close();

            connection.commit();
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(bdlogin.class.getName()).log(Level.SEVERE, null, ex);

        }

        return check;

    }
}