package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_5 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		double n;		
		
		System.out.println("Digite um número");
		n = leitor.nextDouble();
		
		if(Math.abs(n) - Math.floor(Math.abs(n)) != 0)
		{
			System.out.println("O número não pode ser classificado como 'PAR' ou 'ÍMPAR'");
		}
		else
		{
			if (n % 2 == 0 )
			{
				System.out.println("O número digitado é PAR");
			}
			else
			{
				System.out.println("O número digitado é ÍMPAR");
			}
		}
	}
}
