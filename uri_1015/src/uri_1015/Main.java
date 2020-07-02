package uri_1015;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		/*
		 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos
		 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles,
		 * mostrando 4 casas decimais ap�s a v�rgula, segundo a f�rmula:
		 * 
		 * Distancia =
		 * 
		 * Entrada O arquivo de entrada cont�m duas linhas de dados. A primeira linha
		 * cont�m dois valores de ponto flutuante: x1 y1 e a segunda linha cont�m dois
		 * valores de ponto flutuante x2 y2.
		 * 
		 * Sa�da Calcule e imprima o valor da dist�ncia segundo a f�rmula fornecida, com
		 * 4 casas ap�s o ponto decimal.
		 * 
		 * Exemplo de Entrada Exemplo de Sa�da 
		 * 
		 * 1.0 7.0 5.0 9.0
		 * 
		 * 4.4721
		 * 
		 * -2.5 0.4 12.1 7.3
		 * 
		 * 16.1484
		 * 
		 * 2.5 -0.4 -12.2 7.0
		 * 
		 * 16.4575
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.printf("%.4f%n", distancia);

		sc.close();
	}

}
