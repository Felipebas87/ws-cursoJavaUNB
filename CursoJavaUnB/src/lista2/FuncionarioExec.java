package lista2;

public class FuncionarioExec {


	    public static void main(String[] args) {
	        // Criando um funcionário
	        Funcionario funcionario = new Funcionario("João", 2000.0);
	        System.out.println("Funcionário: " + funcionario.getNome());
	        System.out.println("Salário: R$" + funcionario.getSalario());

	        // Criando um gerente
	        Gerente gerente = new Gerente("Maria", 3000.0, "Vendas");
	        System.out.println("\nGerente: " + gerente.getNome());
	        System.out.println("Salário: R$" + gerente.getSalario());
	        System.out.println("Departamento: " + gerente.getDepartamento());

	        // Calculando o bônus do gerente
	        double bonus = gerente.calcularBonus(10);
	        System.out.println("\nBônus: R$" + bonus);
	    }
	}