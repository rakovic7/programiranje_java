package cas04022026;

import java.util.Scanner;
import javax.swing.text.html.FormSubmitEvent;
import javax.swing.text.html.FormSubmitEvent;


public class main2 {
	
	/*
	 * Funckija koja provjerava da li se odredjeni element nalazi u nizu
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] niz = {5, 10, 28, 12, 26, 32, 42};	
		System.out.println(je_u_nizu(25,niz));
	

	}
	
	public static boolean je_u_nizu(int x, int [] niz) {
		/*for (int i = 0; i < niz.length; i++) {
			if(niz[i]==x) {
				return true;
			}
		}
		return false;
		*/ 
		for (int element : niz) {
			if (element == x) {
				return true;
			}
			return false;
		}
	}

	
	

}
