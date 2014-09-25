package collections;

public class Poligono {

	// Declaración de atributos
	private int numlados;
	private float centro;
	private float area;
	private String color;
	// Constructor
	public Poligono(int numlados,float centro,float area,String color)
	{
	this.numlados = numlados;
	this.centro = centro;
	this.area=area;
	this.color=color;
	}
	// Definición de métodos
	public int getNumlados ()
	{
	return numlados;
	}
	public float getCentro ()
	{
	return centro;
	}
	public String getColor ()
	{
	return color;
	}
	public float getArea ()
	{
	return area;
	}
}
