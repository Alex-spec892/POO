package contas;

public class ContaCorrente extends Conta {
    private double taxa = 0.10;

    public double aplicaTaxa(){
        setValorDeposito(getValorDeposito() * taxa);
        return getSaldo();
    }
}
