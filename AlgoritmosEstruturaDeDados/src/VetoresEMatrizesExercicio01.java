import java.util.Scanner;

public class VetoresEMatrizesExercicio01 {
    public static void main(String[] args) {
        int vetor[] = new int[3];
        int vetor2[] = new int[3];
        int vetor3[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
            vetor2[i] = sc.nextInt();
            vetor3[i] = vetor[i] + vetor[i];
        }
      double soma = 0;
        for(int i = 0; i < vetor3.length; i++){
            soma += vetor3[i];
        }
        System.out.println(soma);
    }
}
