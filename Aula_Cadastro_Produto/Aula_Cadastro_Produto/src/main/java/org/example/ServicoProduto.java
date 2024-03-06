package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServicoProduto {

    static List<Produto> listaProduto = new ArrayList<>();

    //VALIDAR PRODUTO
    public static int validarProduto(Produto produto){
        if(produto.getIdProduto() == 0){
            return 0;
        }
        if(produto.getDescricaoProduto() == null || produto.getDescricaoProduto().trim().isEmpty()){
            return 0;
        }
        if(produto.getCategoria() == null || produto.getCategoria().trim().isEmpty()){
            return 0;
        }
        return 1;
    }

    //CADASTRO DE PRODUTO
    public static int cadastrarProduto(Produto produto){
        try{
            listaProduto.add(produto);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    //EDIÇÃO DE PRODUTO
    public static boolean editarProduto(Produto produto){
        try{
            if(validarProduto(produto) == 1){
                //EDIÇÃO PRODUTO
                for(Produto p : listaProduto){
                    if(p.getIdProduto() == produto.getIdProduto()){
                        p.setDescricaoProduto(produto.getDescricaoProduto());
                        p.setCategoria(produto.getCategoria());
                        p.setPreco(produto.getPreco());
                        p.setQtdEstoque(produto.getQtdEstoque());
                        return true;
                    }
                }
                return false;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    //EXCLUSÃO DE PRODUTO
    public static boolean excluirProduto(int idProduto){
        for(int i = 0; i < listaProduto.size(); i ++){
            if(listaProduto.get(i).getIdProduto() == idProduto){
                listaProduto.remove(i);
                return true;
            }
        }
        return false;
    }

    //CONSULTAR PRODUTO
    public static Produto consultarProduto(int idProduto){
        Produto produto = null;
        for(Produto p : listaProduto){
            if(p.getIdProduto() == idProduto){
                produto = p;
                break;
            }
        }
        return produto;
    }

    public static List<Produto> getListaProduto() {
        return listaProduto;
    }

    public static void setListaProduto(List<Produto> listaProduto) {
        ServicoProduto.listaProduto = listaProduto;
    }
}
