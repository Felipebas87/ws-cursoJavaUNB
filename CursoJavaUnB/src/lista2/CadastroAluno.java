package lista2;

public class CadastroAluno {


		  public static void main(String[] args) {
		        // Criando um objeto Aluno utilizando o construtor padr�o
		        Aluno aluno1 = new Aluno();
		        aluno1.exibirInformacoes();
		        System.out.println();
		        
		        // Criando um objeto Aluno utilizando o construtor com par�metros
		        Aluno aluno2 = new Aluno("Jo�o", "2021001", "Engenharia");
		        aluno2.exibirInformacoes();
		    }
		}