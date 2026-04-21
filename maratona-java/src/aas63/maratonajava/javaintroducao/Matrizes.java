package aas63.maratonajava.javaintroducao;

public class Matrizes {
    public static void main(String[] args) {
        int [][] array = new int [3][];
        array[0] = new int[] {1,2};
        array[1] = new int[] {3,4,5,6};
        array[2] = new int[] {7,8,9,10};

        for(int[]i: array){
            for(int j: i){
                System.out.println(j);
            }
        }
    }
}
