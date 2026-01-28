package cas28126;

import java.util.Scanner;

public class main1 {
	
	/*/
	 * napisati funkciju koja vraca predati string naopako
	 * npr Informatika vraca akitamrofnI
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi string:");
		String string = input.nextLine();
		System.out.println(naopako(string));


	}
	
	public static String naopako(String s) {
		String pom = s.substring(s.length()-1);
		for (int i = s.length()-2; i>=0; i--) {
			pom = pom+ s.charAt(i);
		}
		return pom;
	}

}
