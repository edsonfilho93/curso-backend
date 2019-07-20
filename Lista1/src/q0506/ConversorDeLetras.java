package q0506;

public class ConversorDeLetras 
{
	private static final int VALOR_LETRA_A_MINUSCULA = 97;
	private static final int DIFERENCA_ENTRE_CAIXAS = 32;
	
	private char letra;
	
	public void setLetra(char letra)
	{	this.letra = letra;
	}
	
	public char getLetraMaiuscula()
	{	if (VALOR_LETRA_A_MINUSCULA <= letra)
		{ return (char) (letra - DIFERENCA_ENTRE_CAIXAS);
		}
		return letra;
	}
	
	public char getLetraMinuscula()
	{	if (letra < VALOR_LETRA_A_MINUSCULA)
		{	return (char) (letra + DIFERENCA_ENTRE_CAIXAS);
		}
		return letra;
	}

}
