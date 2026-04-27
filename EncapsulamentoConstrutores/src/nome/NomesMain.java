package nome;

import java.util.Scanner;

public class NomesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nomes nome1 = new Nomes("Alex Alves Santos");
        Nomes nome2 = new Nomes("João", "Pereira", "Silva");
        Nomes nome3 = new Nomes();
        nome3.setNomeCompleto(sc.nextLine());

        nome1.imprimirNomes();
        nome1.retornarRubrica();
        nome1.retornarAssinatura();
        nome2.imprimirNomes2();

        nome3.imprimirNomes();


    }
}
