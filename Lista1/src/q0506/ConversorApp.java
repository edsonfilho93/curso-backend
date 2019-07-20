package q0506;

import java.util.Scanner;

public class ConversorApp 
{
	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	ConversorDeLetras conversor = new ConversorDeLetras();
		conversor.setLetra(leChar("Digite a letra: "));
		System.out.println("Letra maiuscula: " + conversor.getLetraMaiuscula() + "\n" + 
		"Letra minuscula: "+ conversor.getLetraMinuscula());
	}
	
	private static char leChar(String mensagem)
	{	System.out.print(mensagem);
		return TECLADO.next().charAt(0);
	}
}
