package n2exercici2;

public class Person {
	
	private String nom;
	private String cognom;
	private int edat;
	
	public Person(String nom, String cognom, int edat) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}
	
	public String toString() {
		
		return "persona: " + nom + " " + cognom + ", edat: " + edat;
	}
}