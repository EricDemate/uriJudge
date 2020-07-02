package uri_1004;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois
		 * valores e atribua esta opera��o � vari�vel PROD. A seguir mostre a vari�vel
		 * PROD com mensagem correspondente.
		 * 
		 * Entrada O arquivo de entrada cont�m 2 valores inteiros.
		 * 
		 * Sa�da Imprima a mensagem "PROD" e a vari�vel PROD conforme exemplo abaixo,
		 * com um espa�o em branco antes e depois da igualdade. N�o esque�a de imprimir
		 * o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a
		 * mensagem: �Presentation Error�.
		 */
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int prod = A * B;

		System.out.println("PROD = " + prod);
		sc.close();

	}

}