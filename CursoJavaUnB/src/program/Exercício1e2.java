package program;

import java.util.Scanner;

public class Exerc�cio1e2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.println("Digite a quantos n�meros verificar�o sua paridade?");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {

			if (i % 2 == 0) {

				soma += i;

			}

		}
		System.out.println("A soma dos n�meros pares s�o: " + soma);
		
		System.out.println("---------------------------Exerc�cio 2----------------");
		System.out.println("Digite o valor de M ?");
		int m = sc.nextInt();
		System.out.println("Digite o valor de N?");
		int f = sc.nextInt();
		
		for (int i = m; i <= f; i++) {

			if (i % 2 == 0) {

				soma += i;

			}

		}
		
		System.out.println("A soma dos n�meros pares entre " + m + " e " + f + " �: " + soma);
		sc.close();
		
		
		
	}

}
