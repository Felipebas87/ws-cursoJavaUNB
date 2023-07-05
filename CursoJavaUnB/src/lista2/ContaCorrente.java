package lista2;

public class ContaCorrente extends Conta {
    private double limite;
    
    public ContaCorrente(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            super.sacar(valor);
        } else {
            System.out.println("Limite insuficiente para realizar o saque de R$" + valor);
        }
    }
}