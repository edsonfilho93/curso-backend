package q010203;

public class Inteiro 
{	
	private static final int MASCARA_UNIDADE = 1_0;
	private static final int MASCARA_DEZENA = 1_00; 
	private static final int MASCARA_CENTENA = 1_000; 
	private long numero;
	
	public void setNumero(long numero)
	{	this.numero = numero;
	}
	
	public long getUnidade()
	{	return numero % MASCARA_UNIDADE;
	}
	
	public long getDezena()
	{	return ((numero % MASCARA_DEZENA) / MASCARA_UNIDADE);
	}
	
	public long getCentena()
	{	return ((numero % MASCARA_CENTENA) / MASCARA_DEZENA);
	}
}
