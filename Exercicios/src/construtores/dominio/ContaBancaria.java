package construtores.dominio;
/*
4. Construtor com Validação (Regra de Negócio)
Objetivo: Usar lógica dentro do construtor para impedir dados inválidos.

Enunciado: Crie uma classe ContaBancaria com o atributo saldo.
O construtor deve receber um valor inicial. Se esse valor for negativo, o saldo deve ser iniciado como 0 e uma mensagem de erro deve ser exibida.
 Caso contrário, atribua o valor normalmente.
 */
public class ContaBancaria {
    public double valor;

    public ContaBancaria(double valor){
        if (valor < 0){
            System.out.println("Valor invalido");
            this.valor = 0.0;
        }
        else{
            this.valor = valor;
        }
    }
}
