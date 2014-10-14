package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Sumar implements Runnable {
  int total;
 // private static AtomicInteger total = new AtomicInteger(0);
  public void setValor(int i){
	  total=i;
  }


  public  synchronized int incrementar() {
	 
     return total++;
      
		
  }
  
  public synchronized int decrementar(){
	  return total--;
  }
 

public int getValor() {
	// TODO Auto-generated method stub
	return total;
}
public void run() {
	// TODO Auto-generated method stub

	incrementar();
}

}
