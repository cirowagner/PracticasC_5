package dto;

public class Leopardos extends Thread {
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	String name;
	
	public Leopardos(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<=15; i++) {
			if(i>=1) {
				System.out.println(name + " recorrio "+ i + " km");
			}
			if(i==15) {
				System.out.println(ANSI_PURPLE+"\n|=>TERMINO EL LEOPARDO " + name + "\n"+ANSI_RESET);
			}
		}
	}
}