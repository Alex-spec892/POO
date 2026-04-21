package aas63.maratonajava.javaintroducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 20;
        int resultado = valor1 +     valor2;

        System.out.println("O valor 1: "+ valor1+valor2);
        // + pode ter funçoes diferentes dependendo do contexto
        System.out.println(valor1+valor2);
        System.out.println(resultado);
        System.out.println();

        //%
        int resto = 27 % 2;
        // numero par retorna 0, numero impar retorna 1
        System.out.println(resto);
        System.out.println();

        // < > <= >= == !=
    boolean isDezMaiorQueVinte = 10 > 20;
    boolean isDezMenorQueVinte = 10 < 20;
    boolean isDezIgualVinte = 10 == 20;
    boolean isDezMaiorIgualVinte = 10 >= 20;
    boolean isDezMneorIgualVinte = 10 <= 20;
    boolean isDezDiferenteVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezMaiorIgualVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezDiferenteVinte);
        System.out.println();

        // && || !
        int idade = 21;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612F;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381F;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
    }
}
