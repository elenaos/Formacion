package Test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import Test.*;
public class AggregateOperations {
	
	public static void filtrar(Collection<Poligono>c){
		c.stream()
		.filter(e -> e.getColor() == "rojo")
		.forEach(e -> System.out.println(e.getNumlados()));
	}
	public static void filtrarParalelo(Collection<Poligono>c){
		c.parallelStream()
		.filter(e -> e.getColor() == "rojo")
		.forEach(e -> System.out.println(e.getNumlados()));
	}
	
	public static void PtoS(Collection<Poligono>c){
	    String joined = c.stream()
	    	    .map(Object::toString)
	    	    .collect(Collectors.joining(", "));
	    System.out.println(joined);
	}
	
	//public static void sumaLados(Collection<Poligono>c){
	//	int total = (int) c.stream()
	//			.collect(Collectors.summingInt(c::getArea));
	//}
	public static void Listar(Collection<Poligono>c){
		for (Poligono a : c)
		    System.out.println(a.getColor());
	}
	//static void filter(Collection<?> c) {
	//    for (Iterator<?> it = c.iterator(); it.hasNext(); )
	//        if (!cond(it.next()))
	//            it.remove();
	//}
	 public static void main(String[] args) {
		 
		 //Creo una colección de polígonos con un ArrayList
		 Poligono p=new Poligono(3,1,3,"rojo");
		 ArrayList<Poligono> ap=new ArrayList<Poligono>();
		 ap.add(p);
		 p=new Poligono(4,1,5,"verde");
		 ap.add(p);
		 p=new Poligono(4,1,3,"azul");
		 ap.add(p);
		 p=new Poligono(5,1,5,"rojo");
		 ap.add(p);
		 //Creo colección de personas con un ArrayList
		 ArrayList<Persona> personas=new ArrayList<Persona>();
		 Persona p1=new Persona("Pepe");
		 personas.add(p1);
		 p1=new Persona("Paco");
		 personas.add(p1);
		 p1=new Persona("Maria");
		 personas.add(p1);
		 p1=new Persona("Juana");
		 personas.add(p1);
		 p1=new Persona("Pepe");
		 personas.add(p1);
	//Asigno colección de polígonos a Collection
	Collection<Poligono> c = ap;
    //Filtro por color
	filtrar(c);
	System.out.println("---------------------------");
	//Filtro por color
	filtrarParalelo(c);
	System.out.println("---------------------------");
	//Convertir a String
	PtoS(c);  
	System.out.println("---------------------------");
	//Listar colores de los poligonos de la colección
	Listar(c);
	System.out.println("---------------------------");
	
	//Asigno colección de polígonos a Set
	ArrayList<String> nombres=new ArrayList<String>();
	nombres.add("Pepe");
	nombres.add("Paco");
	nombres.add("Maria");
	nombres.add("Juana");
	nombres.add("Pepe");
	Collection<Persona> gente=personas;
	System.out.println(gente.size());
	gente.stream()
	.collect(Collectors.toSet());
	System.out.println(gente.size());

	
	 }
	
}
