package conexao;

import Entidades.Produto;
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

public class bdprodutos {

    public static void cadastrarproduto(Produto arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("INSERT INTO produtos( cod_produto,nome,cnpj,cod_categoria,estilo,marca,data_fabricacao,estoque_atual,estoque_minimo,imagem) values (?,?,?,?,?,?,?,?,?,?) ");

            stmt.setInt(1, arg.getCodigo());
            stmt.setString(2, arg.getNome());
            stmt.setString(3, arg.getCnpj());
            stmt.setInt(4, arg.getCategoria());
            stmt.setString(5, arg.getEstilo());
            stmt.setString(6, arg.getMarca());
            stmt.setString(7, arg.getFabricacao());
            stmt.setInt(8, arg.getEstoqueatual());
            stmt.setInt(9, arg.getEstoqueminimo());
            stmt.setString(10, arg.getImagem());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente!");
            JOptionPane.showMessageDialog(null, "Verifique se o fornecedor está cadastrado!");
        }

    }

    public static void atualizarproduto(Produto arg) {

        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);

            PreparedStatement stmt = connection.prepareStatement("update produtos set cod_produto = ?, nome=?,cod_categoria=?,cnpj=?,estilo=?,marca=?,data_fabricacao=?,estoque_atual=?,estoque_minimo=?,imagem = ? WHERE cod_produto = ?");

            stmt.setInt(1, arg.getCodigo());
            stmt.setString(2, arg.getNome());
            stmt.setInt(3, arg.getCategoria());
            stmt.setString(4, arg.getCnpj());
            stmt.setString(5, arg.getEstilo());
            stmt.setString(6, arg.getMarca());
            stmt.setString(7, arg.getFabricacao());
            stmt.setInt(8, arg.getEstoqueatual());
            stmt.setInt(9, arg.getEstoqueminimo());
            stmt.setString(10, arg.getImagem());
            stmt.setInt(11, arg.getCodigo());

            stmt.executeUpdate();
            stmt.close();

            connection.commit();
            connection.close();

            JOptionPane.showMessageDialog(null, "Alteração feita com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar! Verifique a conexão com o Banco ou se os campos foram preenchidos corretamente");
        }

    }

    public List<Produto> ler() {
        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";

        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement("SELECT produtos.cod_produto,produtos.nome,categorias.descricao,produtos.cnpj,produtos.estilo,produtos.marca,produtos.data_fabricacao,produtos.estoque_atual,produtos.estoque_minimo from produtos,categorias where produtos.cod_categoria = categorias.cod_categoria ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodigo(rs.getInt("cod_produto"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoriadesc(rs.getString("descricao"));
                produto.setCnpj(rs.getString("cnpj"));
                produto.setEstilo(rs.getString("estilo"));
                produto.setMarca(rs.getString("marca"));
                produto.setFabricacao(rs.getString("data_fabricacao"));
                produto.setEstoqueatual(rs.getInt("estoque_atual"));
                produto.setEstoqueminimo(rs.getInt("estoque_minimo"));
                produtos.add(produto);

            }

        } catch (SQLException ex) {
            Logger.getLogger(bdclientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return produtos;
    }

    public List<Produto> lercategoria() {
        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";

        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement("select * from categorias ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCategoriadesc(rs.getString("descricao"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(bdclientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return produtos;
    }
}
