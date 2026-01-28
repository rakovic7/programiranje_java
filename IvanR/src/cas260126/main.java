package cas260126;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * funkcija koja izvrsava izraz koji je dat u obliku stringa
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti izraz:");
		
		String izraz = input.next();
		System.out.println(izraz(izraz));
	
		

	}
	
	public static float izraz(String s) {
		
		int op;
		int plus = s.indexOf("+");
		int minus = s.indexOf("-");
		int puta = s.indexOf("*");
		int podijeljeno = s.indexOf("/");
		
		op = plus+minus+puta+podijeljeno+3;
		
		int prvi =  Integer.parseInt(s.substring(0,op));
	    int drugi = Integer.parseInt(s.substring(op+1,s.length()));
	    
	    switch (s.charAt(op)) { 
		case '+': {
			
			return prvi+drugi;
		}
		case '-': {
			
			return prvi-drugi;
		}
		case '*': {
			
			return prvi*drugi;
		}
		case '/': {
			float x = (float) prvi/drugi;
			x = (float) Math.round(x*100)/100;
			return x;
		}
		default:
			System.out.println("Nepoznata operacija");
			return 0;
			
		}
	    
		
	}

}
