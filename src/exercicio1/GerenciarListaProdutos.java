package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class GerenciarListaProdutos {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(String nome, Double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
    }

    public boolean remover(String nome) {
        return produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));

    }

    public String exibirProdutos() {
        return produtos.toString();
    }
}
