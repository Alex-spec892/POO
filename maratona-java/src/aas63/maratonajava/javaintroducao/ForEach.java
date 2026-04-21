package aas63.maratonajava.javaintroducao;

public class ForEach {
    public static void main(String[] args) {
        int[] numeros = new int [3];
        int[] numeros1 = {1,2,3,4,5};
     //   for(int i =0; i<numeros1.length; i++){
       //     System.out.println(numeros1[i]);
        //}
       // for(int i : numeros1){
     //       System.out.println(i);
      //  }
        int [][] matriz = new int[3][3];
        for(int[]i: matriz){
            for(int j: i){
                System.out.println(j);
            }

        }
    }
}
