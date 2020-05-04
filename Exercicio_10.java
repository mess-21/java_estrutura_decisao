package exercicio_de_condicional;

import java.util.Scanner;

public class Exercicio_10 
{	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		double altura,peso_ideal;
		String sexo;
		peso_ideal = 0;
		

		System.out.print("Digite seu gênero sexual: ");
		sexo = leitor.nextLine();
		System.out.print("Digite sua altura em metros: ");
		altura = leitor.nextDouble();
		
	
		if(sexo.equals("masculino") || sexo.equals("Masculino") || sexo.equals("MASCULINO") )
		{
			peso_ideal = (72.7*altura)-58;
			System.out.println("Seu peso ideal é: "+peso_ideal);
		}
		else if(sexo.equals("feminino") || sexo.equals("Feminino") || sexo.equals("FEMININO"))
		{
			peso_ideal = (62.1*altura)-44;
			System.out.println("Seu peso ideal é: "+peso_ideal);
		}
		else
		{
			System.out.println("Sexo não reconhecido");
		}


	}
}
