package n2exercici2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		Person person1 = new Person("Paco", "Pepe", 50);
		char a = '*';
		String word = "marmitaco";
		
		List<Object> genericList = new ArrayList<Object>();
		
		genericList.add(person1);
		genericList.add(a);
		genericList.add(word);
		
		GenericMethods.genericMethod(genericList);
	}

}
