import org.example.Produto;
import org.example.ServicoProduto;
import org.junit.Assert;
import org.junit.Test;

public class TesteServicoProduto {

    // valida o produto - expectativa: produto valido
    @Test
    public void testeProdutoValido(){
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setDescricaoProduto("Detergente ipê");
        produto.setCategoria("Limpeza");
        produto.setPreco(5);
        produto.setQtdEstoque(20);

        Assert.assertEquals(1, ServicoProduto.validarProduto(produto));
    }

    // valida o produto - expectativa: produto invalido
    @Test
    public void testeProdutoInvalido(){
        Produto produto = new Produto();
        Assert.assertEquals(0, ServicoProduto.validarProduto(produto));
    }

    // cadastra o produto - expectativa: produto cadastrado com sucesso
    @Test
    public void testeCadastroProduto(){
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setDescricaoProduto("Detergente ipê");
        produto.setCategoria("Limpeza");
        produto.setPreco(5);
        produto.setQtdEstoque(20);

        Assert.assertEquals(1, ServicoProduto.validarProduto(produto));

        Assert.assertEquals(1, ServicoProduto.cadastrarProduto(produto));
    }

    // cadastra o produto - expectativa: produto cadastrado sem sucesso
    @Test
    public void testeCadastroProdutoInvalido(){
        Produto produto = new Produto();

        Assert.assertEquals(0, ServicoProduto.validarProduto(produto));

        Assert.assertEquals(1, ServicoProduto.cadastrarProduto(produto));
    }

    // edita um produto - expectativa: produto editado com sucesso
    @Test
    public void testeEditarProduto(){
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setDescricaoProduto("Detergente ipê");
        produto.setCategoria("Limpeza");
        produto.setPreco(5);
        produto.setQtdEstoque(20);
        if(ServicoProduto.validarProduto(produto) == 1){
            if(ServicoProduto.cadastrarProduto(produto) == 1){
                produto.setIdProduto(1);
                produto.setDescricaoProduto("Detergente ipê");
                produto.setCategoria("Limpeza para pia");
                produto.setPreco(6);
                produto.setQtdEstoque(10);
                Assert.assertTrue(ServicoProduto.editarProduto(produto));
            }
        }
    }

    // exclui um produto - expectativa: produto excluido com sucesso
    @Test
    public void testeExcluirProduto(){
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setDescricaoProduto("Detergente ipê");
        produto.setCategoria("Limpeza");
        produto.setPreco(5);
        produto.setQtdEstoque(20);
        ServicoProduto.cadastrarProduto(produto);

        Assert.assertTrue(ServicoProduto.excluirProduto(1));
        Assert.assertEquals(0, ServicoProduto.getListaProduto().size());
    }

    // consulta um produto - expectativa: produto consultado.
    @Test
    public void testeConsultarProduto(){
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setDescricaoProduto("Detergente ipê");
        produto.setCategoria("Limpeza");
        produto.setPreco(5);
        produto.setQtdEstoque(20);
        ServicoProduto.cadastrarProduto(produto);

        Assert.assertEquals("Detergente ipê", ServicoProduto.consultarProduto(1).getDescricaoProduto());
    }

}
