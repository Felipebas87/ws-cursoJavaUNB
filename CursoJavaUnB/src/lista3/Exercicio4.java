package lista3;

public class Exercicio4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Antes da chamada do m�todo: a = " + a + ", b = " + b);
		alterarValores(a, b);
		System.out.println("Ap�s a chamada do m�todo: a = " + a + ", b = " + b);
	}

	public static void alterarValores(int x, int y) {
		x += 5;
		y *= 2;
		System.out.println("Dentro do m�todo: x = " + x + ", y = " + y);
	}
}
//O programa executa normalmente, mostrando que os valores de x e y s�o alterados dentro do m�todo e impressos, mas ao sair os valores de x e y mant�m o seu valor original.