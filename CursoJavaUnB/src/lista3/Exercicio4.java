package lista3;

public class Exercicio4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Antes da chamada do método: a = " + a + ", b = " + b);
		alterarValores(a, b);
		System.out.println("Após a chamada do método: a = " + a + ", b = " + b);
	}

	public static void alterarValores(int x, int y) {
		x += 5;
		y *= 2;
		System.out.println("Dentro do método: x = " + x + ", y = " + y);
	}
}
//O programa executa normalmente, mostrando que os valores de x e y são alterados dentro do método e impressos, mas ao sair os valores de x e y mantém o seu valor original.