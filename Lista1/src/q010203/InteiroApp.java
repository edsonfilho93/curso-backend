package q010203;

import java.util.Scanner;

public class InteiroApp 
{	
	public static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args)
	{	Inteiro numero = new Inteiro();
		numero.setNumero(leInt("Digite um numero: "));
		System.out.println("Algarismo das Unidades: " + numero.getUnidade());
		System.out.println("Algarismo das Dezenas: " + numero.getDezena());
		System.out.println("Algarismo das Centenas: " + numero.getCentena());
	}
	
	private static String leString(String mensagem)
	{	System.out.print(mensagem);
		return TECLADO.nextLine();
	}
	
	private static int leInt(String mensagem)
	{	return Integer.parseInt(leString(mensagem));
	}

}
