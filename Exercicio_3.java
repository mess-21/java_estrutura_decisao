package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_3 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		double n;		
		System.out.println("Digite um número");
		n = leitor.nextDouble();
		if(n >= 0)
		{
		System.out.println("O número digitado é POSITIVO");
		}
		else
		{
		System.out.println("O número digitado é NEGATIVO");
		}

	}
}
