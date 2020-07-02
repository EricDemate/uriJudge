package uri_1008;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
		 * casas decimais.
		 * 
		 * Entrada O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas
		 * casas decimais, representando o n�mero, quantidade de horas trabalhadas e o
		 * valor que o funcion�rio recebe por hora trabalhada, respectivamente.
		 * 
		 * Sa�da Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo
		 * fornecido, com um espa�o em branco antes e depois da igualdade. No caso do
		 * sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.
		 * 
		 * Exemplos de Entrada Exemplos de Sa�da 
		 * 
		 * 25 100 5.50
		 * 
		 * NUMBER = 25 SALARY = U$ 550.00
		 * 
		 * 1 200 20.50
		 * 
		 * NUMBER = 1 SALARY = U$ 4100.00
		 * 
		 * 6 145 15.55
		 * 
		 * NUMBER = 6 SALARY = U$ 2254.75
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int horasTrab = sc.nextInt();
		double salario = sc.nextDouble();
		double result = salario * horasTrab;

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", result);
		sc.close();

	}
}
