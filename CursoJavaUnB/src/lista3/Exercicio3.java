package lista3;

public class Exercicio3 {


	    public static void main(String[] args) {
	        Retangulo retangulo = new Retangulo(5, 10);
	        retangulo.exibirInformacoes();
	        retangulo.calcularArea();
	    }
	}

	class Forma {
	    public  void exibirInformacoes() {
	        System.out.println("Esta � uma forma geom�trica.");
	    }
	}

	class Retangulo extends Forma {
	    private int largura;
	    private int altura;

	    public Retangulo(int largura, int altura) {
	        this.largura = largura;
	        this.altura = altura;
	    }

	 
	    public void exibirInformacoes() {
	        System.out.println("Este � um ret�ngulo com largura " + largura + " e altura " + altura + ".");
	    }

	    public void calcularArea() {
	        int area = largura * altura;
	        System.out.println("A �rea do ret�ngulo �: " + area);
	    }
	}
	//D� erro, o c�digo tenta sobrescrever um m�todo final, ao retirar o final do m�todo roda tranquilamente. 