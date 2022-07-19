package exercicio3;

import java.util.List;

public class Prato {
    private String nomedoPrato;
    private String ingredientes;

    public Prato(String nomedoPrato, List<String> ingredientes) {
        this.nomedoPrato = nomedoPrato;
        this.ingredientes = String.valueOf(ingredientes);
    }


    public String getNomedoPrato() {
        return nomedoPrato;
    }

    public void setNomedoPrato(String nomedoPrato) {
        this.nomedoPrato = nomedoPrato;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


    @Override
    public String toString() {
        return "Prato{" +
                "nomedoPrato='" + nomedoPrato + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                '}';
    }
}
