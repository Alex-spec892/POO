package aas63.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno aluno;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;

    }
    public Seminario(String titulo, Professor professor, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
    }
}
