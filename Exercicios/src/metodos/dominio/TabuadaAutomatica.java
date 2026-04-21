package metodos.dominio;

import java.util.Scanner;

public class TabuadaAutomatica {
    public void imprimirTabuada(){
        int n;
        double multi, div, soma, subt;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            multi = n * i;
            System.out.print(multi + ", ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            div = (double) n / i;
            System.out.print(div + ", ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            soma = n + i;
            System.out.print(soma + ", ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            subt = n - i;
            System.out.print(subt + ", ");
        }

    }
}
