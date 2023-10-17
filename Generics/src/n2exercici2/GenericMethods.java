package n2exercici2;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
	
	public static <T> void genericMethod(List<T> list) {
		
		List<T> objects = new ArrayList<T>();
		
		for (Object o : list) {
			System.out.println(o);
		}
			
	}

}
