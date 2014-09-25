package concurrency;



class Counter {
    public static int c = 0;

    public Runnable increment()   {
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
    public static void main(String args[])
            throws InterruptedException {
    	 Thread t1 = new Thread(new Counter().increment());
    	// Thread t2 = new Thread(new Counter().decrement());
         //t2.start();
         t1.start();
       
        // System.out.print(c);
         System.out.print(value());
         
    }

}
