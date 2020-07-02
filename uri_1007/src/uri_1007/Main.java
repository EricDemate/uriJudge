package uri_1007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
		 * diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula:
		 * DIFERENCA = (A * B - C * D).
		 * 
		 * Entrada O arquivo de entrada cont�m 4 valores inteiros.
		 * 
		 * Sa�da Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme
		 * exemplo abaixo, com um espa�o em branco antes e depois da igualdade.
		 * 
		 * Exemplos de Entrada Exemplos de Sa�da 
		 * 
		 * 5 6 7 8
		 * 
		 * DIFERENCA = -26
		 * 
		 * 0 0 7 8
		 * 
		 * DIFERENCA = -56
		 * 
		 * 5 6 -7 8
		 * 
		 * DIFERENCA = 86
		 */

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int result = (A * B) - (C * D);

		System.out.println("DIFERENCA = " + result);
		sc.close();

	}
}
