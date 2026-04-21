package aas63.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Iniciando anime");
        episodios = new int[100];
        for(int i = 0; i< episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }

    public Anime() {


        for(int i = 0; i < episodios.length; i++){
            System.out.print(episodios[i] + " ");
        }
    }
}
