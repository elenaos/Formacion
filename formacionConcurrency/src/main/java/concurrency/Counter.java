package concurrency;

import java.util.concurrent.atomic.AtomicInteger;



class Counter {
     //public static int c = 0;

    //Clase inicial counter con interferencia de hilos
 /*   public Runnable increment()   {
        c++;
		return null;
    }

    public Runnable decrement() {
        c--;
		return null;
    }

    public static int value() {
        return c;
    }
    */
    
    //Clase Counter con metodos sincronizados
    /*
    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized  int value() {
        return c;
    }
    */
	//Clase Counter con AtomicInteger
	  private static AtomicInteger c = new AtomicInteger(0);

	    public Runnable increment() {
	        c.incrementAndGet();
			return null;
	    }

	    public  Runnable decrement() {
	        c.decrementAndGet();
			return null;
	    }

	    public static int value() {
	        return c.get();
	    }

    
    public static void main(String args[])
            throws InterruptedException {
    	 Thread t1 = new Thread(new Counter().increment());
    	 //Thread t2 = new Thread(new Counter().decrement());
         //t2.start();
         t1.start();
       
        // System.out.print(c);
         System.out.print(value());
         
    }

}
