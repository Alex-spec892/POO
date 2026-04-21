public class Principal {
     public class Principal {

         // Método principal: ponto de início da execução do programa em Java
         public static void main(String[] args) {

             // Cria um objeto do tipo ListaEncadeada (lista vazia)
             ListaEncadeada lista = new ListaEncadeada();

             // Insere o valor 30 no início da lista
             // Lista: 30 -> null
             lista.inserirNoInicio(30);

             // Insere o valor 20 no início da lista
             // Lista: 20 -> 30 -> null
             lista.inserirNoInicio(20);

             // Insere o valor 40 no fim da lista
             // Lista: 20 -> 30 -> 40 -> null
             lista.inserirNoFim(40);

             // Exibe a lista após as inserções
             System.out.println("Lista após inserções:");
             lista.exibir();

             // Remove o valor 20 da lista
             // Lista passa a ser: 30 -> 40 -> null
             lista.remover(20);

             // Exibe a lista após a remoção
             System.out.println("Lista após remover o valor 20:");
             lista.exibir();

             // Busca o valor 40 na lista

             boolean encontrado = lista.buscar(40);

             // Exibe o resultado da busca
             System.out.println("Buscar 40: " + encontrado);
              }
 }
}
