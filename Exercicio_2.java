package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_2 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int n, n2, resultado;
		System.out.println("Digite um número");
		n = leitor.nextInt();
		
		System.out.println("Digite outro número");
		n2 = leitor.nextInt();
		
		resultado = n+n2;
		
		if(resultado > 10)
		{
		System.out.println("O Resultado da soma dos números é: "+resultado);
		}
		else
		{
		System.out.println("O resultado é MENOR ou IGUAL a 10");
		}


	}
}
