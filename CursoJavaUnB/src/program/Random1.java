package program;

import java.util.Random;
import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {

		Random gerador = new Random();
		int palpite;

		Scanner sc = new Scanner(System.in);

		int x = gerador.nextInt(100);
		
		 System.out.println("Adivinhe o n�mero entre 1 e 100:");

		do {
			palpite = sc.nextInt();

			if (palpite < x) {
				System.out.println("O n�mero correto � maior");
			} else if (palpite > x) {
				System.out.println("O n�mero correto � menor");
			}
		} while (palpite != x);

		System.out.println("Parab�ns, voc� acertou");
		sc.close();
	}

}
