package q04;

import java.util.Scanner;

public class ArredondadorApp 
{
	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args)
	{	ArredondadorNumerico arredondador = new ArredondadorNumerico();
		arredondador.setNumero(leDouble("Digite o numero: "));
		System.out.println(arredondador.getNumeroArredondado());
	}
	
	private static String leString(String mensagem)
	{	System.out.print(mensagem);
		return TECLADO.nextLine();
	}
	
	private static int leInt(String mensagem)
	{	return Integer.parseInt(leString(mensagem));
	}
	
	private static double leDouble(String mensagem)
	{	return Double.parseDouble(leString(mensagem));
	}

}
