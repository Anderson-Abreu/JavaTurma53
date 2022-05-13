package Polimorfismo;

public class ExemploSobrecarga {

	private double calc;
	
	public double soma(int n1, int n2)
	{
		calc=n1+n2;
		return calc;
	}
	
	public double soma(int x, double y)
	{
		calc=x+y;
		return calc;
	}
	public double soma(int n1, int n2, int n3)
	{
		calc=n1+n2+n3;
		return calc;
	}
	
}
