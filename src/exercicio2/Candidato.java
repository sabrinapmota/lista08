package exercicio2;

public class Candidato {
    private String numeroMatricula;
    private Double nota;


    public Candidato(String numeroMatricula, Double nota) {
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }


    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\nCandidato{" +
                "numeroMatricula='" + numeroMatricula + '\'' +
                ", nota=" + nota +
                '}';
    }
}
