package q0708;

public class ConversorDeTemperatura 
{
	private double temperaturaCelsius;
	private double temperaturaFahrenheit;
	
	public void setTemperaturaCelsius(double temperatura)
	{	this.temperaturaCelsius = temperatura;
	}
	
	public void SetTempetraturaFahr(double temperatura) 
	{	this.temperaturaFahrenheit = temperatura;
	}
	
	public double getTemperaturaConvertidaCelsius()
	{	return 9.0 / 5.0 * (this.temperaturaCelsius + 32); 
	}
	
	public double getTemperaturaConvertidaFahrenheit()
	{	return 5.0 / 9.0 * (this.temperaturaFahrenheit	 - 32);
	}
}
