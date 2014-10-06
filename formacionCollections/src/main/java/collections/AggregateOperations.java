package collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
	public static void FindDups(ArrayList<String> n){
		 Set<String> distinctWords =n.stream()
					.collect(Collectors.toSet()); 
			        System.out.println(distinctWords.size()+ 
			                           " distinct words: " + 
			                           distinctWords);
	}
	public static void FindDups2(ArrayList<String> n){
		
		        Set<String> s = new HashSet<String>();
		        for (String a : n)
		               s.add(a);
		               System.out.println(s.size() + " distinct words: " + s);
		    
	}
	
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
 //Eliminar duplicados SET
	FindDups(nombres);
	//Eliminar duplicados HashSet
	FindDups2(nombres); 
	ArrayList<String> nombres2=new ArrayList<String>();
	nombres2.add("Manuel");
	nombres2.add("Lorenzo");
	nombres2.add("Maria");
	nombres2.add("Sofia");
	nombres2.add("Elena");
	
	//Union de conjuntos
	Set<String> union = new HashSet<String>(nombres);
	union.addAll(nombres2);
	System.out.print("Union: ");
		System.out.println(union);
		
	//Interseccion de conjuntos
		Set<String> intersection = new HashSet<String>(nombres);
		intersection.retainAll(nombres2);
		System.out.print("Interseccion: ");
		System.out.println(intersection);
		
	//Diferencia de conjuntos
		Set<String> difference = new HashSet<String>(nombres);
		difference.removeAll(nombres2);
		System.out.print("Diferencia: ");
		System.out.println(difference);
	 }
	 

	
}
