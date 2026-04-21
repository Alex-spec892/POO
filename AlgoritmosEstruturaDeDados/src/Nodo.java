public class Nodo {
    // Classe que representa cada elemento (nó) da lista ligada

         // Armazena o valor inteiro do nó
         int valor;

         // Armazena a referência para o próximo nó da lista
         Nodo proximo;

         // Construtor da classe Nodo
         public Nodo(int valor) {

             // Atribui o valor recebido ao atributo valor do nó
             this.valor = valor;

             // Inicialmente o próximo nó é nulo (não aponta para ninguém)
             this.proximo = null;
             }
}
