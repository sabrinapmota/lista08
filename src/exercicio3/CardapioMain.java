package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardapioMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cardapio cardapio1 = new Cardapio();

        boolean executar = true;
        while (executar) {
            System.out.println("Digite 1 para inserir: ");
            System.out.println("digite 2 para listar: ");
            System.out.println("Digite 3 para excluir: ");
            System.out.println("digite 0 para sair");

            Integer opcao = input.nextInt();
            if (opcao == 1) {
                System.out.println("Informe a quantidade de pratos que deseja adicionar: ");
                Integer quantidade = input.nextInt();
                for (Integer i = 1; i <= quantidade; i++) {
                    System.out.println(i + " Nome do prato: ");
                    String nome = input.next();
                    System.out.println("quantidade de ingredientes: " + nome);
                    Integer quantidadeIngredientes = input.nextInt();
                    List<String> ingredientes = new ArrayList<>();
                    for (int j = 1; j <= quantidadeIngredientes; j++) {
                        System.out.println(j + "º ingredientes");
                        ingredientes.add(input.next());

                    }
                    cardapio1.adicionarPrato(nome, ingredientes);
                }
            } else if (opcao == 2) {
                cardapio1.exibirPratos();
            } else if (opcao == 3) {
                System.out.println("Digite o nome do prato que deseja excluir: ");
                String nome = input.next();
                cardapio1.excluirPrato(nome);
            } else if (opcao == 0) {
                System.out.println("Programa encerrado, até a próxima! ");
                executar = false;
            } else {
                System.out.println("Opção inválida, digite um número de 0 a 3: ");
            }
        }
    }
}
