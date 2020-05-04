package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_6 
{	
	public static void main(String[] args)
	{
		float n1,n2,n3,media;	
		n1 = 2;
		n2 = 3;
		n3 = 5;
		media = (n1+n2+n3)/3;
		if(media >= 7)
		{
			System.out.println("A média do aluno é "+media+", ele foi APROVADO");
		}
		else
		{
			System.out.println("A média do aluno é "+media+", ele NÃO foi APROVADO");
		}

	}
}
