package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_4 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		double n,n2;		
		
		System.out.println("Digite um n�mero");
		n = leitor.nextDouble();
		
		System.out.println("Digite outro n�mero");
		n2 = leitor.nextDouble();
		
		System.out.println("Os n�meros em ordem decresente s�o");
		
		if(n > n2)
		{
			
		System.out.println(n);
		System.out.println(n2);
		}
		else
		{
		System.out.println(n2);
		System.out.println(n);
		}

	}
}
