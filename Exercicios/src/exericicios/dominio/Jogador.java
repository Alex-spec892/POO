package exericicios.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(Time time) {
        this.time = time;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(nome);
        if(time == null) System.out.println("Jogador sem time!");
        System.out.println(time.getNome());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
