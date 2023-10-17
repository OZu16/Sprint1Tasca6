package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoGenericMethods {
	
	Smartphone[] smartphoneArray = new Smartphone[3];

	public NoGenericMethods(Smartphone first, Smartphone second, Smartphone third) {
		super();
		smartphoneArray[0] = first;
		smartphoneArray[1] = second;
		smartphoneArray[2] = third;
	}

		public Smartphone getFirst() {
			return smartphoneArray[0];
		}
	
		public Smartphone getSecond() {
			return smartphoneArray[1];
		}
	
		public Smartphone getThird() {
			return smartphoneArray[2];
		}
		
		public void setFirst(Smartphone newFirst){
			smartphoneArray[0] = newFirst;
			
		}
		
		public void setSecond(Smartphone newSecond){
			smartphoneArray[0] = newSecond;
			
		}
		
		public void setThird(Smartphone newFirst){
			smartphoneArray[0] = newFirst;
			
		}
		
		
		public String toString() {
			return	 " smartphone (" + smartphoneArray[0]
					+ ", " + smartphoneArray[1]
					+ ", " + smartphoneArray[2] + ")";
		}
		
}
