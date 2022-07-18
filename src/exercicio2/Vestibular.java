package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Vestibular {
    private List<Candidato> candidatos = new ArrayList<>();


    public void adicionarCandidato(String numeroMatricula, Double nota) {
        Candidato candidato1 = new Candidato(numeroMatricula, nota);
        candidatos.add(candidato1);
    }

    public boolean excluirCandidato(String numeroMatricula) {
        return candidatos.removeIf(candidato -> candidato.getNumeroMatricula().equalsIgnoreCase(numeroMatricula));
    }

    public String exibirCandidatos() {
        return candidatos.toString();
    }
}
