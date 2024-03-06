package org.example;

public class Produto {

    //OBRIGATÓRIO
    private int idProduto;
    //OBRIGATÓRIO
    private String DescricaoProduto;
    //OBRIGATÓRIO
    private String categoria;
    private Integer preco;
    private Integer QtdEstoque;

    public Produto() {
    }

    public Produto(int idProduto, String DescricaoProduto, String categoria, Integer preco, Integer QtdEstoque) {
        this.idProduto = idProduto;
        this.DescricaoProduto = DescricaoProduto;
        this.categoria = categoria;
        this.preco = preco;
        this.QtdEstoque = QtdEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return DescricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        DescricaoProduto = descricaoProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Integer getQtdEstoque() {
        return QtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        QtdEstoque = qtdEstoque;
    }
}









































