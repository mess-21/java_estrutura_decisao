package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_2 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int n, n2, resultado;
		System.out.println("Digite um n�mero");
		n = leitor.nextInt();
		
		System.out.println("Digite outro n�mero");
		n2 = leitor.nextInt();
		
		resultado = n+n2;
		
		if(resultado > 10)
		{
		System.out.println("O Resultado da soma dos n�meros �: "+resultado);
		}
		else
		{
		System.out.println("O resultado � MENOR ou IGUAL a 10");
		}


	}
}
