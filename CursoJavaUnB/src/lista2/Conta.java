package lista2;

public class Conta {
	
    private int numero;
    private double saldo;
    
    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor);
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
}