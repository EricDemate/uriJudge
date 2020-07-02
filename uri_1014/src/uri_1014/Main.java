package uri_1014;

//package application;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	/*
	 * Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total
	 * percorrida (em Km) e o total de combust�vel gasto (em litros).
	 * 
	 * Entrada O arquivo de entrada cont�m dois valores: um valor inteiro X
	 * representando a dist�ncia total percorrida (em Km), e um valor real Y
	 * representando o total de combust�vel gasto, com um d�gito ap�s o ponto
	 * decimal.
	 * 
	 * Sa�da Apresente o valor que representa o consumo m�dio do autom�vel com 3
	 * casas ap�s a v�rgula, seguido da mensagem "km/l".
	 * 
	 * Exemplo de Entrada Exemplo de Sa�da 
	 * 
	 * 500 35.0
	 * 
	 * 14.286 km/l
	 * 
	 * 2254 124.4
	 * 
	 * 18.119 km/l
	 * 
	 * 4554 464.6
	 * 
	 * 9.802 km/l
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		double y = sc.nextDouble();

		double valor = x / y;

		System.out.printf("%.3f km/l%n", valor);

		sc.close();
	}

}