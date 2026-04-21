package exericicios.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Disciplina disciplina;

    public Professor(String nome) {
        this.nome = nome;
      //  this.especialidade = especialidade;

    }

    public void Imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disciplina.getNome());
       // System.out.println("Especialidade: " + especialidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Disciplina getDiscplina() {
        return disciplina;
    }

    public void setDiscplina(Disciplina discplina) {
        this.disciplina = discplina;
    }
}
