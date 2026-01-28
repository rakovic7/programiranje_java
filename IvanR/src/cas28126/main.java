package cas28126;

import java.util.Scanner;

public class main {

	/*
	 * napisati funkciju koja za unijeti string ispisuje koliko ima samoglasnika
	 * A E I O U
	 * npr za Informatika vraca 5
	 */
	
	/*/
	 * napisati funkciju koja vraca predati string naopako
	 * npr Informatika vraca akitamrofnI
	 */
	
	/*
	 * Provjerava da li je string palindrom
	 * npr. radar, vraca true
	 */
	
	/*
	 * Vraca broj rijeci u stringu (recenici)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unijeti string");
		String String = input.nextLine();
		
		System.out.println(br_samoglasnika(String));

		
	}
	
	public static int br_samoglasnika(String s) {
		int br=0;
		String pom = "aeoiuAEIOU";
		for(int i =0; i<s.length();i++) {
			if (pom.contains(s.substring(i,i+1))) {
				br++;
			}
		}
		return br;
	}

}
