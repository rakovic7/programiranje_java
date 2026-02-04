package cas04022026;

import java.util.Scanner;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] niz = {5, 10, 28, 12, 26, 32, 42};	
		System.out.println(je_u_nizu(25,niz));
		

	}
	
	public static boolean je_u_nizu(int x, int niz []) {

		for (int element : niz) {
			if (element == x) {
				return true;
			}
			else {
				return false;
			}
			
		}
	}

}
// fix error wtf