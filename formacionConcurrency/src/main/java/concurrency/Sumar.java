package concurrency;

public class Sumar {
  int total;
  public void setValor(int valor){
	  total=valor;
  }
  public int incrementar(){
	  return total++;
  }
  public int decrementar(){
	  return total--;
  }
public int getValor() {
	// TODO Auto-generated method stub
	return total;
}
}
