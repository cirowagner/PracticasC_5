package model;

import utils.BufferedZ;
import dto.*;

public class Main {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	
	public static void main(String []args){
		try {
			BufferedZ key = new BufferedZ();
			
			char confirm = 'S';
			int opt;
			
			do {
	            System.out.println();
	            opt = key.read(0,"|>------- Ejercicios ------<|\n"+
	                    "1 > Conteo ACS & DESC \n"+
	                    "2 > Suma de Cubos \n"+
	                    "3 > Factoriales \n"+
	                    "4 > Carrera de Michizzz \n");
	            
				switch(opt){
					case 1:
						System.out.println(ANSI_GREEN+"+------------------------------+"+ANSI_RESET);
						 Thread tha = new ConteoASC();
						 System.out.println(ANSI_GREEN+"Conteo ACS & DESC:\n"+ANSI_RESET);
						 	tha.start();
						 	Thread.sleep(100);
						 Thread thd = new ConteoDESC();
						 	thd.start();
						 	Thread.sleep(500);
						System.out.println(ANSI_GREEN+"+------------------------------+"+ANSI_RESET);
						break;
					case 2:
						System.out.println(ANSI_GREEN+"+------------------------------+"+ANSI_RESET);
							Thread sc = new SumaCubos();
							System.out.println(ANSI_GREEN+" Suma de Cubos:\n"+ANSI_RESET);
							sc.start();
							Thread.sleep(500);
						System.out.println(ANSI_GREEN+"+------------------------------+"+ANSI_RESET);
						break;
					case 3:
						System.out.println(ANSI_GREEN+"+------------------------------+"+ANSI_RESET);
							System.out.print(ANSI_GREEN+"Calcular factorial de: "+ANSI_RESET);
							int ft = key.read(0,""); 
							Thread f = new Factorial(ft);
							f.start();
							Thread.sleep(500);
						System.out.println(ANSI_GREEN+"+------------------------------+"+ANSI_RESET);
						break;
					case 4:
						System.out.println(ANSI_GREEN+"+------------------------------+"+ANSI_RESET);
						System.out.print(ANSI_GREEN+" Carrera de Leopardos: "+ANSI_RESET);
							Leopardos l1 = new Leopardos("Mishi1");
							Leopardos l2 = new Leopardos("Mishi2");
							Leopardos l3 = new Leopardos("Mishi3");
							Leopardos l4 = new Leopardos("Mishi4");
							l1.start();
							l2.start();
							l3.start();
							l4.start();
							Thread.sleep(500);
						System.out.println(ANSI_GREEN+"+------------------------------+"+ANSI_RESET);
						break;
					default:
						System.out.println("Opción Incorrecta :c");
						break;
				}
				System.out.println();
				confirm=key.read(' ', "|=>¿Desea Probar mas Algoritmos? [S/N]: ");
			}while(confirm=='S' || confirm=='s');
		}catch(Exception er){
			System.out.println(er.getMessage());
		}
		
		System.out.println();
		System.out.println(ANSI_PURPLE+"zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"zzz    <---       FIN          --->       zzz"+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"+ANSI_RESET);
	}
}