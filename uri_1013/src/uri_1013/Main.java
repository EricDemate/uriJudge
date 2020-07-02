package uri_1013;

//package application;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores
		 * lidos seguido da mensagem �eh o maior�. Utilize a f�rmula:
		 * 
		 * 
		 * 
		 * Obs.: a f�rmula apenas calcula o maior entre os dois primeiros (a e b). Um
		 * segundo passo, portanto � necess�rio para chegar no resultado esperado.
		 * 
		 * Entrada O arquivo de entrada cont�m tr�s valores inteiros.
		 * 
		 * Sa�da Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem
		 * "eh o maior".
		 * 
		 * Exemplos de Entrada Exemplos de Sa�da 
		 * 
		 * 7 14 106
		 * 
		 * 106 eh o maior
		 * 
		 * 217 14 6
		 * 
		 * 217 eh o maior
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorBC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

		System.out.println(maiorBC + " eh o maior");

		sc.close();
	}

}
