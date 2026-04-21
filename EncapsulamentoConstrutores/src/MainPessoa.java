import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção:1, 2 ou 3");
        int escolha = input.nextInt();
        switch(escolha){
            case 1:
                System.out.println("Digite seu CPF: ");
                p1.setCPF(input.next());
                System.out.println("Digite seu Nome: ");
                p1.setNome(input.next());
                System.out.println("Digite seu Idade: ");
                p1.setIdade(input.nextByte());
                System.out.println("Digite seu Sexo: ");
                p1.setSexo(input.next().charAt(0));
                break;

            case 2:
                p1.imprimir();
                break;

            case 3:
                break;
        }

    }
}
