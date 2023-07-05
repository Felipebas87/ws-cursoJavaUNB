package lista2;

public class ContaExec {

	
	    public static void main(String[] args) {
	        ContaCorrente conta = new ContaCorrente(123, 1000.0);
	        
	        conta.depositar(500.0);
	        conta.sacar(200.0);
	        conta.sacar(1000.0);
	    }
	}