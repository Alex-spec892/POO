import java.util.Scanner;

public class VetoresEMatrizesExercicio05 {
    public static void main(String[] args) {
        double notas[][]  = new double[3][2];
        double mediaAlunos[] = new double[6];
        double somaNotas = 0;
        int qtdAlunos = 1;
       // double media = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<notas.length; i++){
            for(int j=0; j<notas[i].length; j++){
                System.out.print("notas do aluno " +qtdAlunos + " das provas:");
                notas[i][j] = sc.nextInt();
                mediaAlunos[qtdAlunos] = notas[i][j]/2;



            }
            System.out.println();
            qtdAlunos++;

        }
        for(int i=0; i<mediaAlunos.length; i++){
            System.out.println(mediaAlunos[i]);
        }



    }

}
