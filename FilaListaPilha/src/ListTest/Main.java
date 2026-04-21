package ListTest;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
   public static void main() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Alex");
        nomes.add("Zara");
        nomes.add("João");
      /*  for(String nome : nomes) {
            System.out.println(nome);
        }*/
        System.out.println("Antes: " + nomes);
        nomes.add(0, "Carlos");
        System.out.println("Depois: " + nomes);
        System.out.println(nomes.size());
        nomes.remove("Carlos");
        boolean existe = nomes.contains("Alex");
        System.out.println(existe);
        Collections.sort(nomes);
        System.out.println(nomes);
   }
}
