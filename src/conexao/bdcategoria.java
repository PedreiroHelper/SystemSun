package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entidades.Categoria;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class bdcategoria {

    public static void cadastrarcategoria(Categoria arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("insert into categorias (cod_categoria, descricao) values (?,?) ");

            stmt.setInt(1, arg.getCod());
            stmt.setString(2, arg.getNome());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Categoria cadastrado com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");
        }

    }

    public static void atualizarcategoria(Categoria arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("update categorias set cod_categoria = ?,descricao = ? where cod_categoria = ? ");

            stmt.setInt(1, arg.getCod());
            stmt.setString(2, arg.getNome());
            stmt.setInt(3, arg.getCod());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Alteração feita com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");
        }

    }

    public List<Categoria> ler() {
        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";

        ResultSet rs = null;

        List<Categoria> categorias = new ArrayList<>();

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement("select * from categorias");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Categoria categoria = new Categoria();

                categoria.setCod(rs.getInt("cod_categoria"));
                categoria.setNome(rs.getString("descricao"));
                categorias.add(categoria);

            }

        } catch (SQLException ex) {
            Logger.getLogger(bdcategoria.class.getName()).log(Level.SEVERE, null, ex);
        }

        return categorias;
    }
}
