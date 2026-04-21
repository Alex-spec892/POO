public class ListaEncadeada {
    private Nodo inicio;

    // Construtor da lista
    // Quando a lista é criada, ela começa vazia
    public ListaEncadeada() {

        // Como não há elementos, o início aponta para null
        this.inicio = null;
    }

    // Método que insere um valor no INÍCIO da lista
    public void inserirNoInicio(int valor) {

        // Cria um novo nó com o valor informado
        Nodo novo = new Nodo(valor);

        // O novo nó aponta para o antigo primeiro nó da lista
        novo.proximo = inicio;

        // O início da lista passa a ser o novo nó
        inicio = novo;
    }

    // Método que insere um valor no FIM da lista
    public void inserirNoFim(int valor) {

        // Cria um novo nó com o valor informado
        Nodo novo = new Nodo(valor);

        // Verifica se a lista está vazia

        if (inicio == null) {

            // Se estiver vazia, o novo nó será o primeiro da lista
            inicio = novo;

        } else {

            // Cria um nó auxiliar que começa no início da lista
            Nodo aux = inicio;

            // Percorre a lista até encontrar o último nó
            while (aux.proximo != null) {

                // Avança para o próximo nó
                aux = aux.proximo;
            }

            // O último nó passa a apontar para o novo nó
            aux.proximo = novo;
        }
    }

    // Método que busca um valor na lista
    public boolean buscar(int valor) {

        // Cria um nó auxiliar que começa no início da lista
        Nodo aux = inicio;

        // Percorre a lista enquanto houver nós
        while (aux != null) {

            // Verifica se o valor do nó atual é igual ao valor buscado
            if (aux.valor == valor) {

                // Valor encontrado, retorna verdadeiro
                return true;

            }

            // Avança para o próximo nó
            aux = aux.proximo;
        }

        // Se chegou ao fim da lista sem encontrar o valor, retorna falso
        return false;
    }

    // Método que remove a primeira ocorrência de um valor da lista
    public void remover(int valor) {

        // Se a lista estiver vazia, não há o que remover
        if (inicio == null) {
            return;
        }

        // Caso especial: o valor esteja no primeiro nó da lista
        if (inicio.valor == valor) {

            // O início passa a apontar para o segundo nó
            inicio = inicio.proximo;

            // Encerra o método após remover
            return;
        }

        // Caso geral: cria um nó auxiliar começando no início
        Nodo aux = inicio;

        // Avança enquanto existir próximo nó e o valor for diferente
        while (aux.proximo != null && aux.proximo.valor != valor) {

            // Avança para o próximo nó
            aux = aux.proximo;

        }

        // Se encontrou o nó que deve ser removido
        if (aux.proximo != null) {

            // Pula o nó que será removido
            aux.proximo = aux.proximo.proximo;
        }
    }

    // Método que exibe todos os elementos da lista
    public void exibir() {

        // Cria um nó auxiliar que começa no início da lista
        Nodo aux = inicio;

        // Percorre toda a lista
        while (aux != null) {

            // Imprime o valor do nó atual seguido de uma seta
            System.out.print(aux.valor + " -> ");

            // Avança para o próximo nó
            aux = aux.proximo;
        }

        // Indica o final da lista
        System.out.println("null");
    }
}
