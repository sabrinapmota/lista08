package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Prato> cardapios = new ArrayList<>();

    public void adicionarPrato(String nomedoPrato, List<String> ingredientes) {
        this.cardapios.add(new Prato(nomedoPrato, ingredientes));
    }


    public void excluirPrato(String nomedoPrato) {
        this.cardapios.removeIf(prato -> nomedoPrato.equalsIgnoreCase(prato.getNomedoPrato()));
    }

    public void exibirPratos() {
        this.cardapios.forEach(
                prato -> {
                    System.out.println("Nome do prato: " + prato.getNomedoPrato() + "\nIngredientes " + prato.getIngredientes().toString());
                });
    }
}
