package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class bdclientes {

    public static void cadastrarcliente(Cliente arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("insert into clientes (nome,sobrenome,cpf_cnpj,telefone,tipo_telefone,endereco,numero,bairro,cidade,UF,cep) values (?,?,?,?,?,?,?,?,?,?,?) ");

            stmt.setString(1, arg.getNome());
            stmt.setString(2, arg.getSobrenome());
            stmt.setString(3, arg.getCpfcnpj());
            stmt.setInt(4, arg.getTelefone());
            stmt.setString(5, arg.getTipo());
            stmt.setString(6, arg.getEndereco());
            stmt.setInt(7, arg.getNumero());
            stmt.setString(8, arg.getBairro());
            stmt.setString(9, arg.getCidade());
            stmt.setString(10, arg.getUf());
            stmt.setString(11, arg.getCep());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");
        }

    }

    public static void atualizarcliente(Cliente arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("update clientes Set nome = ?,sobrenome = ?,cpf_cnpj = ?,telefone = ?,tipo_telefone = ?,endereco = ?,numero = ?,bairro = ?,cidade = ?,UF = ?,cep = ? WHERE cpf_cnpj = ?");

            stmt.setString(1, arg.getNome());
            stmt.setString(2, arg.getSobrenome());
            stmt.setString(3, arg.getCpfcnpj());
            stmt.setInt(4, arg.getTelefone());
            stmt.setString(5, arg.getTipo());
            stmt.setString(6, arg.getEndereco());
            stmt.setInt(7, arg.getNumero());
            stmt.setString(8, arg.getBairro());
            stmt.setString(9, arg.getCidade());
            stmt.setString(10, arg.getUf());
            stmt.setString(11, arg.getCep());
            stmt.setString(12, arg.getCpfcnpj());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Alteração feita com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");
        }

    }

    public List<Cliente> ler() {
        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";

        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement("select * from clientes");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();

                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setCpfcnpj(rs.getString("cpf_cnpj"));
                cliente.setTelefone(rs.getInt("telefone"));
                cliente.setTipo(rs.getString("tipo_telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("uf"));
                cliente.setCep(rs.getString("cep"));
                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(bdclientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }
}
