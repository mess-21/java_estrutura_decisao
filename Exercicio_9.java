package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_9 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		double valor_produto,valor_revenda ;

		
		System.out.print("Digite o valor do produto comprado: ");
		valor_produto = leitor.nextDouble();
		
		if(valor_produto <= 0)
		{
			System.out.print("Você já lucrou");
		}
		else
		{
			if(valor_produto <= 20.0)
			{
				valor_revenda = valor_produto+( (valor_produto*45)/100 );
			}
			else
			{
				valor_revenda = valor_produto+( (valor_produto*30)/100 );
			}
		
			System.out.print("O valor de revenda do produto deve ser de: "+valor_revenda);
		}
	}
}
