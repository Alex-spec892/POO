package aas63.maratonajava.javacore.Eblocosinicializacao.test;

import aas63.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest {
    static void main() {
        Anime anime = new Anime();
        System.out.println(anime.getNome());
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
