package cas04032026;

import java.util.ArrayList;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		ArrayList <String> imena = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		
		ArrayList <String> osobe = new ArrayList<>();
		
		
		osobe.add("Ivan");
		osobe.add("Tijana");
		osobe.add("Matija");
		osobe.add("Cadjo");
		osobe.add("Petar");
		
		System.out.println(osobe.size());
		System.out.println(osobe);
		
		System.out.println(osobe.get(0).toUpperCase());
		osobe.remove(0);
		System.out.println(osobe);
		System.out.println(osobe.get(0).toUpperCase());
		osobe.remove("Cadjo");
		System.out.println(osobe);
		System.out.println(osobe.contains("Petar"));
		
		for (String osoba : osobe) {
			System.out.print(osoba + " ");
			
		}
		System.out.println();
		
		osobe.set(1, "Biga");
		
		for (String osoba : osobe) {
			System.out.print(osoba + " ");
			
		}
		
		
		// Napisati program koji unosi imena dok se ne unese kraj
	public static void popuni_list(ArrayList <String> osobe) {
		
		
	}
		
	}
	
		
		
		
	}

