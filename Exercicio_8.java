package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_8 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		String senha;
		
		
		System.out.print("Digite a Senha: ");
		senha = leitor.nextLine();
		
	
		if(senha.equals("AEDB"))
		{
			System.out.println("ACESSO PERMITIDO");	
		}
		else
		{
			System.out.println("VOC� N�O TEM ACESSO AO SISTEMA");	
		}

			


	}
}
