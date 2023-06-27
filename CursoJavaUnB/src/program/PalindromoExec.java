package program;

import java.util.Scanner;

public class PalindromoExec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra ou frase: ");
		String input = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

		boolean isPalindrome = true;
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println(input + " � um pal�ndromo!");
		} else {
			System.out.println(input + " n�o � um pal�ndromo.");
		}
		sc.close();
	}

}
