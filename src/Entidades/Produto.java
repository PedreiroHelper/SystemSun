package Entidades;

/**
 *
 * @author P4 Solutions
 */
public class Produto {

    private Integer codigo;
    private String nome;
    private Integer categoria;
    private String cnpj;
    private String estilo;

    public String getCategoriadesc() {
        return categoriadesc;
    }

    public void setCategoriadesc(String categoriadesc) {
        this.categoriadesc = categoriadesc;
    }
    private String categoriadesc;

    public String getImagem() {
        return Imagem;
    }

    public void setImagem(String Imagem) {
        this.Imagem = Imagem;
    }
    private String Imagem;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    public Integer getEstoqueatual() {
        return estoqueatual;
    }

    public void setEstoqueatual(Integer estoqueatual) {
        this.estoqueatual = estoqueatual;
    }

    public Integer getEstoqueminimo() {
        return estoqueminimo;
    }

    public void setEstoqueminimo(Integer estoqueminimo) {
        this.estoqueminimo = estoqueminimo;
    }

    @Override
    public String toString() {
        return getCategoriadesc();
    }

    private String marca;
    private String fabricacao;
    private Integer estoqueatual;
    private Integer estoqueminimo;

}
