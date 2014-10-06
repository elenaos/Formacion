package concurrency;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SumarTest extends TestCase {
	 private int numHilos = 1000;
	 private Sumar s=new Sumar();
	   // private int amount = 1;	 
	    @Test
	    public void testSumaResta() throws Exception {
	    	s.setValor(0);
	    	
	        Assert.assertEquals("Suma es 0",0,s.getValor());
	        ExecutorService executorService = Executors.newFixedThreadPool(numHilos);
	        
	       
	        for (int x = 0; x < numHilos; x++) {
	        	if (x%2==0){
	            Callable<Void> callable = new Callable<Void>() {
	                public Void call() throws Exception {
	                    s.incrementar();
	                    return null;
	                }
	            };
	        	}else{
	        		 Callable<Void> callable = new Callable<Void>() {
	 	                public Void call() throws Exception {
	 	                    s.decrementar();
	 	                    return null;
	 	                }
	 	            };
	        	}
	        }
	     /*   for (int x = numHilos/2; x < numHilos; x++) {
	            Callable<Void> callable = new Callable<Void>() {
	                public Void call() throws Exception {
	                    s.decrementar();
	                    return null;
	                }
	            };
	            
	        }*/
	      
	 
	        executorService.shutdown();
	        
	        Assert.assertEquals("Suma es 200", 0, s.getValor());
	    }
}
