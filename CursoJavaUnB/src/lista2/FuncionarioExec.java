package lista2;

public class FuncionarioExec {


	    public static void main(String[] args) {
	        // Criando um funcion�rio
	        Funcionario funcionario = new Funcionario("Jo�o", 2000.0);
	        System.out.println("Funcion�rio: " + funcionario.getNome());
	        System.out.println("Sal�rio: R$" + funcionario.getSalario());

	        // Criando um gerente
	        Gerente gerente = new Gerente("Maria", 3000.0, "Vendas");
	        System.out.println("\nGerente: " + gerente.getNome());
	        System.out.println("Sal�rio: R$" + gerente.getSalario());
	        System.out.println("Departamento: " + gerente.getDepartamento());

	        // Calculando o b�nus do gerente
	        double bonus = gerente.calcularBonus(10);
	        System.out.println("\nB�nus: R$" + bonus);
	    }
	}