package contas;

public class Conta {
    private double saldo;
    private double valorSaque;
    private double valorDeposito;
    private double saldoAtualizado;


    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public double getSaldoAtualizado() {
        return saldoAtualizado;
    }

    public void setSaldoAtualizado(double saldoAtualizado) {
        this.saldoAtualizado = saldoAtualizado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(){
        saldoAtualizado = saldo - valorSaque;
        if (saldoAtualizado >= valorSaque){
            saldo = saldoAtualizado;
            System.out.println("Saldo atualizado: " + saldo);
        }
        else {
            System.out.println("Saldo insuficiente");
            return;
        }

    }
    public void depositar(){
        valorDeposito = saldo + valorSaque;
        System.out.println("Deposito: " + valorDeposito);
        saldo = saldo + valorDeposito;
        System.out.println("Saldo atualizado: " + saldo);
    }



}
