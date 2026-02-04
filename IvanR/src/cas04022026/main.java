package cas04022026;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
	    int niz [];
		niz = new int[10]; // niz[0],niz[1],niz[2]... do  n[9]; znaci daje mu 10 elemenata koje su 0
		System.out.println(niz.length);
		int n = 15;
		double [] x = new double [n]; // daje mu 15 elementara cije su vrijednosti 0.0
		System.out.println(x.length);
		String [] s = {"Ana", "Marko", "Jelena", "Janko"};
		System.out.println(s.length);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		s[2] = "Ivan";
		n = 3;
		System.out.println(s[n]);
		
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		for (String element : s) {
			System.out.println(element);
		}
		
		System.out.println(String.join(" ", s));

	}
	
	
	

}
