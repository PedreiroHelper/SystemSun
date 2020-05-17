package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Entidades.Fornecedor;

public class bdfornecedor {

    public static void cadastrarfornecedor(Fornecedor arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("INSERT INTO fornecedores( cnpj, nome, telefone, email, endereco, numero, complemento, bairro, cep, estado, cidade, pais)  values (?,?,?,?,?,?,?,?,?,?,?,?) ");

            stmt.setString(1, arg.getCnpj());
            stmt.setString(2, arg.getNome());
            stmt.setInt(3, arg.getTelefone());
            stmt.setString(4, arg.getEmail());
            stmt.setString(5, arg.getEndereco());
            stmt.setInt(6, arg.getNumero());
            stmt.setString(7, arg.getComplemento());
            stmt.setString(8, arg.getBairro());
            stmt.setString(9, arg.getCep());
            stmt.setString(10, arg.getUf());
            stmt.setString(11, arg.getCidade());
            stmt.setString(12, arg.getPais());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");
        }

    }

    public static void atualizarfornecedor(Fornecedor arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("update fornecedores set  cnpj=?, nome=?, telefone=?, email=?, endereco=?, numero=?, complemento=?, bairro=?, cep=?, estado=?, cidade=?, pais=? where cnpj=? ");

            stmt.setString(1, arg.getCnpj());
            stmt.setString(2, arg.getNome());
            stmt.setInt(3, arg.getTelefone());
            stmt.setString(4, arg.getEmail());
            stmt.setString(5, arg.getEndereco());
            stmt.setInt(6, arg.getNumero());
            stmt.setString(7, arg.getComplemento());
            stmt.setString(8, arg.getBairro());
            stmt.setString(9, arg.getCep());
            stmt.setString(10, arg.getUf());
            stmt.setString(11, arg.getCidade());
            stmt.setString(12, arg.getPais());
            stmt.setString(13, arg.getCnpj());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Alteração feita com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");

        }

    }

    public List<Fornecedor> ler() {
        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";

        ResultSet rs = null;

        List<Fornecedor> fornecedor = new ArrayList<>();

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement("select * from fornecedores");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedor fornecedores = new Fornecedor();

                fornecedores.setCnpj(rs.getString("cnpj"));
                fornecedores.setNome(rs.getString("nome"));
                fornecedores.setTelefone(rs.getInt("telefone"));
                fornecedores.setEmail(rs.getString("email"));
                fornecedores.setCep(rs.getString("cep"));
                fornecedores.setEndereco(rs.getString("endereco"));
                fornecedores.setNumero(rs.getInt("numero"));
                fornecedores.setComplemento(rs.getString("complemento"));
                fornecedores.setBairro(rs.getString("bairro"));
                fornecedores.setUf(rs.getString("estado"));
                fornecedores.setCidade(rs.getString("cidade"));
                fornecedores.setPais(rs.getString("pais"));
                fornecedor.add(fornecedores);

            }

        } catch (SQLException ex) {
            Logger.getLogger(bdfornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fornecedor;
    }

}
