package program;

import java.util.Scanner;

public class EmailDomainExtractor {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o endere�o de e-mail: ");
	        String email = sc.nextLine();

	        int index = email.indexOf("@");
	        String domain = email.substring(index + 1);

	        System.out.println("O dom�nio do e-mail �: " + domain);
	        sc.close();
	    }
	
	}