package exercicio1;

import java.util.Scanner;

public class Produtomain {
    public static void main(String[] args) {
        GerenciarListaProdutos listaproduto = new GerenciarListaProdutos();

        boolean executar = true;
        Integer opcao;
        Scanner input = new Scanner(System.in);
        while (executar) {
            System.out.println("Digite 1 para adicionar um produto");
            System.out.println("Digite 2 para remover um produto");
            System.out.println("digite 3 para exibir a lista de produtos adicionados");
            System.out.println("Digite 0 para sair");
            opcao = Integer.parseInt(input.nextLine());

            if (opcao == 1) {
                System.out.println("Por favor digite o nome do produto: ");
                String nome = input.nextLine();
                System.out.println("Por favor digite o preço do produto: ");
                Double preco = Double.parseDouble(input.nextLine());
                listaproduto.adicionar(nome, preco);

                System.out.println("Produto adicionado com sucesso ");
            } else if (opcao == 2) {
                System.out.println("Digite o nome do produto: ");
                String nome = input.nextLine();
                boolean seRemovido = listaproduto.remover(nome);
                if (seRemovido) {
                    System.out.println("Produto removido com sucesso. ");
                } else {
                    System.out.println("Produto não encontrado. ");
                }
            } else if (opcao == 3) {
                System.out.println(listaproduto.exibirProdutos());

            } else if (opcao == 0) {
                executar = false;
            } else {
                System.out.println("Opção inválida! ");
            }


        }
    }
}
