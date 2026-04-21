    public class VetoresEMatrizesExercicio02 {
        public static void main(String[] args) {
            int matriz [][] = new int [3][3];
            int trasnposta [][] = new int [3][3];
            matriz[0][0] = 1;
            matriz[0][1] = 4;
            matriz[0][2] = 5;
            matriz[1][0] = -3;
            matriz[1][1] = 2;
            matriz[1][2] = 7;
            matriz[2][0] = 0;
            matriz[2][1] = 5;
            matriz[2][2] = 1;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    trasnposta[j][i] = matriz[i][j];
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(trasnposta[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
