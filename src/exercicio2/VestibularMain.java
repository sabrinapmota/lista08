package exercicio2;

import java.util.Scanner;

public class VestibularMain {
    public static void main(String[] args) {

        Vestibular listaCandidatos = new Vestibular();

        boolean executar = true;
        Integer opcao;
        Scanner input = new Scanner(System.in);
        while (executar) {
            System.out.println("Digite 1 para adicionar um candidato: ");
            System.out.println("Digite 2 para excluir um candidato: ");
            System.out.println("Digite 3 para exibir a lista de candidatos cadastrados: ");
            System.out.println("Digite 0 para sair: ");

            opcao = Integer.parseInt(input.nextLine());
            if (opcao == 1) {
                System.out.println("Por favor digite o número da matrícula: ");
                String numero = input.nextLine();
                System.out.println("Por favor, digite a nota do candidato: ");
                Double nota = Double.parseDouble(input.nextLine());
                listaCandidatos.adicionarCandidato(numero, nota);
                System.out.println("Candidato adicionado com sucesso! ");
            } else if (opcao == 2) {
                System.out.println("Digite o número da matrícula: ");
                String numero = input.nextLine();

                boolean seExcluido = listaCandidatos.excluirCandidato(numero);
                if (seExcluido) {
                    System.out.println("candidato excluido com sucesso! ");
                } else {
                    System.out.println("Candidato não encontrado: ");
                }
            } else if (opcao == 3) {
                System.out.println("Candidatos cadastrados até agora: ");
                System.out.println(listaCandidatos.exibirCandidatos());
            } else if (opcao == 0) {
                executar = false;
                System.out.println("Programa finalizado, até a próxima! ");
            } else {
                System.out.println("opção inválida, digite um número de 0 a 3: ");
            }
        }
    }

}