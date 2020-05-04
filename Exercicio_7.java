package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_7 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int idade_1,idade_2,comp;
		String nome_1,nome_2;
		
		//-----------------------------------------------
		System.out.println("Digite um nome");
		nome_1 = leitor.nextLine();
		System.out.println("Digite outro nome");
		nome_2 = leitor.nextLine();

		//-----------------------------------------------
		System.out.println("Digite a idade de "+nome_1);
		idade_1 = leitor.nextInt();
		System.out.println("Digite a idade de "+nome_2);
		idade_2 = leitor.nextInt();
		
		
		//Comparando as idades
		if(idade_1 == idade_2)
		{
			System.out.println("Ambos possuem a mesma idade");	
			System.out.println("Nome: "+nome_1);	
			System.out.println("Idade: "+idade_1);	
			System.out.println("Nome: "+nome_2);	
			System.out.println("Idade: "+idade_2);	
		}	
		
		if(idade_1 > idade_2)
		{
			System.out.println(nome_1+" é mais velho");	
			System.out.println("Nome: "+nome_1);	
			System.out.println("Idade: "+idade_1);	
		}
		if(idade_1 < idade_2)
		{
			System.out.println(nome_2+" é mais velho");	
			System.out.println("Nome: "+nome_2);	
			System.out.println("Idade: "+idade_2);	
		}

		
		
		
		


	}
}
