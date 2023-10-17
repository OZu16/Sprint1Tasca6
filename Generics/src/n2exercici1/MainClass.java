package n2exercici1;

public class MainClass {

	public static void main(String[] args) {
		
		Person person1 = new Person("Paco", "Pepe", 50);
		char a = '*';
		String word = "marmitaco";
		
		GenericMethods.genericMethod(person1, a, word);
	}

}
