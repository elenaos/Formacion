package Test;

public class Persona {
	private String nombre;
	
	public Persona(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public String getNombre(Persona p){
		return p.nombre;
	}
}
