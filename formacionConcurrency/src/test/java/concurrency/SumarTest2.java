package concurrency;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


import org.junit.Test;

public class SumarTest2 {

	 private int numHilos = 200;
	 private Sumar s=new Sumar();
	   // private int amount = 1;	 
	
	    @Test
	    public void testSumar() throws Exception {
	    	s.setValor(0);
	    	
	        assertEquals("Suma es 0",0,s.getValor());
	        ExecutorService executorService = Executors.newFixedThreadPool(numHilos);
	        List<Future<Void>> futures = new ArrayList<Future<Void>>();
	        for (int x = 0; x < numHilos; x++) {
	            Callable<Void> callable = new Callable<Void>() {
	                public Void call() throws Exception {
	                    s.incrementar();
	                    return null;
	                }
	            };
	            Future<Void> submit = executorService.submit(callable);
	            futures.add(submit);
	        }
	        List<Exception> exceptions = new ArrayList<Exception>();
	        for (Future<Void> future : futures) {
	            try {
	                future.get();
	            } catch (Exception e) {
	                exceptions.add(e);
	                e.printStackTrace(System.err);
	            }
	        }
	 
	        executorService.shutdown();
	        //executorService.awaitTermination(10,TimeUnit.SECONDS); //poco tiempo no da tiempo a los 
	       
	     //   ReflectionAssert.assertReflectionEquals("No exceptions", new ArrayList<Exception>(), exceptions);	        
	        assertEquals("Suma es 200", 200, s.getValor());
	    
	    }
}
