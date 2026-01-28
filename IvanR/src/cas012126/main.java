package cas012126;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ime = "Peror";
		String ime2 = "Pero";
		String prezime = "Perovic";
		String ImePrezime = ime + " " + prezime;
		System.out.println(ImePrezime);
		System.out.println(ImePrezime.length());
		System.out.println(ime==ime2);
		System.out.println(ime.equals(ime2));
		System.out.println(ime.equalsIgnoreCase(ime2));
		System.out.println(ime.toLowerCase());
		System.out.println(ime.charAt(3));
		System.out.println(ime.indexOf("r"));
		System.out.println(prezime.indexOf("ro"));
		System.out.println(ime.contains("ro"));
		System.out.println(ime.compareTo(prezime)>0);
		ime = ime.replace("o", "a");
		System.out.println(ime);
		String izraz = "123*45";
		System.out.println();
		
		


	}

}