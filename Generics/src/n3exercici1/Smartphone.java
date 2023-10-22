package n3exercici1;

public class Smartphone implements Telephone{
	
	@Override
	public void call() {
		System.out.println("smartphone trucant");
	}
	
	public void takePhoto() {
		System.out.println("smartphone fent foto");
	}

}
