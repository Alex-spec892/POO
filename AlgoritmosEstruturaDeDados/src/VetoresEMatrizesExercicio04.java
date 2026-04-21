public class VetoresEMatrizesExercicio04 {
    public static void main(String[] args) {
        int matriz [][] = new int [3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;
        int somaDiagonal=0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if(i == j){
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.println(somaDiagonal);
    }
}
