package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		Smartphone s1 = new Smartphone("samsing","galaxia24","blau",12,10);
		Smartphone s2 = new Smartphone("apli","iphone999","blau",40,30);
		Smartphone s3 = new Smartphone("nokia","n3310","blau",110,30);
		
		NoGenericMethods noGernericMethodObject1 = new NoGenericMethods(s1, s2 , s3);
		NoGenericMethods noGernericMethodObject2 = new NoGenericMethods(s3, s1 , s2);
		
		System.out.println(noGernericMethodObject1);
		System.out.println(noGernericMethodObject2);
	}

}