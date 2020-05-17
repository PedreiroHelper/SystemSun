package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entidades.Usuarios;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class bdusuario {

    public static void cadastrarusuario(Usuarios arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("INSERT INTO usuarios( cod_usuario, nome, sobrenome, login, email, senha, telefone )VALUES (?,?,?,?,?,?,?) ");

            stmt.setString(1, arg.getCod());
            stmt.setString(2, arg.getNome());
            stmt.setString(3, arg.getSobrenome());
            stmt.setString(4, arg.getLogin());
            stmt.setString(5, arg.getEmail());
            stmt.setString(6, arg.getSenha());
            stmt.setString(7, arg.getTelefone());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");
        }

    }

    public static void atualizarusuario(Usuarios arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("update usuarios Set cod_usuario = ?,nome = ?, sobrenome = ?, login = ?,email = ?,senha = ?,telefone = ? WHERE cod_usuario = ?");

            stmt.setString(1, arg.getCod());
            stmt.setString(2, arg.getNome());
            stmt.setString(3, arg.getSobrenome());
            stmt.setString(4, arg.getLogin());
            stmt.setString(5, arg.getEmail());
            stmt.setString(6, arg.getSenha());
            stmt.setString(7, arg.getTelefone());
            stmt.setString(8, arg.getCod());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Alteração feita com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");
        }

    }

    public List<Usuarios> ler() {
        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";

        ResultSet rs = null;

        List<Usuarios> Usuario = new ArrayList<>();

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement("select * from usuarios");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuarios usuario = new Usuarios();

                usuario.setCod(rs.getString("cod_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                Usuario.add(usuario);

            }

        } catch (SQLException ex) {
            Logger.getLogger(bdclientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Usuario;
    }
}
