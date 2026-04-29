package cas060426_oop;

public class Osobe {
	long jmbg;
	String ime;
	String prezime;
	int godinja_rodjenja;
	
	
	public Osobe(long jmbg, String ime, String prezime, int godinja_rodjenja) {
		this.jmbg = jmbg;
		this.ime = ime;
		this.prezime = prezime;
		this.godinja_rodjenja = godinja_rodjenja;
	}
		
	public Osobe(){
		this.jmbg = 1111111111;
		this.ime = "Ana";
		this.prezime = "Petrovic";
		this.godinja_rodjenja = 2001;
	}


	
	
	
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	
	
	
	
	public void info() {
		System.out.println("***************************************");
		System.out.println("Ova osoba je: ");
		System.out.println(this.ime + " " + this.prezime);
		System.out.println("I rodjena je " +this.godinja_rodjenja+". godine.");
		System.out.println("***************************************");
	}
	
	
}
