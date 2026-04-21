import java.util.Scanner;

public class VetoresEMatrizesExercicio03 {
    public static void main(String[] args) {
        int vetor[] = new int [3];
        int inteiro = 0;
        int posicaoX = 0;
        Scanner sc = new Scanner(System.in);
        inteiro = sc.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        if (inteiro == vetor[i]){
            posicaoX = i;
        }
        }
        System.out.println(posicaoX);
    }
}
