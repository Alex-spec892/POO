package aas63.maratonajava.javaintroducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida =  idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado comprar bebida");
        }
        System.out.println("fora do if");
    }
}
