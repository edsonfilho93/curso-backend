package q04;

public class ArredondadorNumerico 
{	
	private double numero;
	
	public void setNumero(double numero)
	{	this.numero = numero;
	}
	
	public double getNumeroArredondado()
	{	return ((int) (this.numero * 2) - (int) this.numero);
	}

}
