package uri_1013;

//package application;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia três valores e apresente o maior dos três valores
		 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
		 * 
		 * 
		 * 
		 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um
		 * segundo passo, portanto é necessário para chegar no resultado esperado.
		 * 
		 * Entrada O arquivo de entrada contém três valores inteiros.
		 * 
		 * Saída Imprima o maior dos três valores seguido por um espaço e a mensagem
		 * "eh o maior".
		 * 
		 * Exemplos de Entrada Exemplos de Saída 
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
