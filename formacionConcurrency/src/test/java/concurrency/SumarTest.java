package concurrency;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import java.util.concurrent.TimeUnit;


import org.junit.Test;

import junit.framework.TestCase;

public class SumarTest extends TestCase {
	 private int numHilos = 200;
	 private Sumar s=new Sumar();

	    @Test
	    public void testSumar() throws Exception {
	    	s.setValor(0);
	    	
	        assertEquals("Suma es 0",0,s.getValor());
	        ExecutorService executorService = Executors.newFixedThreadPool(numHilos);
	      for (int x = 0; x < numHilos; x++) {

	          	
	        	executorService.execute(s);
	        
	        }
	        executorService.shutdown();
	        executorService.awaitTermination(10,TimeUnit.SECONDS); //poco tiempo no da tiempo a los 
	        													   //hilos a terminar
	        
	        assertEquals("Suma es 200", 200, s.getValor());
	    
	    }
}
