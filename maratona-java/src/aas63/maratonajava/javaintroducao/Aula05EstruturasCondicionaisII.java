package aas63.maratonajava.javaintroducao;

public class Aula05EstruturasCondicionaisII {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Vou doar 500 reais";
        String mensagemNaoDoar = "Nao vou doar 500 reais";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
