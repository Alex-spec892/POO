package aas63.maratonajava.javacore.Csobrecarga.test;

import aas63.maratonajava.javacore.Csobrecarga.dominio.Anime;

import java.util.Scanner;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime =  new Anime();
        Scanner sc = new Scanner(System.in);

        anime.init(sc.next(), sc.next(), sc.nextInt(), sc.next());

        anime.imprime();

    }
}
