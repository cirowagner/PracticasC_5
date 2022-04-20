package dto;

public class Factorial extends Thread{
	
	double f;
	
	public Factorial (double f) {
		this.f = f;
	}
	
	public double factorial (double f) {
		  if (f==0)
		    return 1;
		  else
		    return f * factorial(f-1);
	}
	
	@Override
	public void run() {
		System.out.println("Resultado: "+factorial(f));
	}
}
