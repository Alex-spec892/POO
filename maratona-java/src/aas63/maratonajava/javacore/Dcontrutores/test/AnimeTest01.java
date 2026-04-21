package aas63.maratonajava.javacore.Dcontrutores.test;


import aas63.maratonajava.javacore.Dcontrutores.dominio.Anime;

import java.util.Scanner;

public class AnimeTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Anime anime =  new Anime(sc.next(), sc.next(), sc.nextInt(), sc.next());
    //    Anime anime2 = new Anime();
        anime.imprime();
    //    anime2.imprime();
    }
}
