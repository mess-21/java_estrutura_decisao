package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_1 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		double n;
		System.out.println("Digite um número");
		n = leitor.nextDouble();
		if(n > 20)
		{
		System.out.println("O número digitado é: "+n);
		}
		else
		{
		System.out.println("O número digitado é MENOR ou IGUAL a 20");
		}


	}
}
