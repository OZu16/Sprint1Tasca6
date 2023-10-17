package n1exercici1;

public class Smartphone {
	
	private String marca;
	private String model;
	private String color;
	private int ram;
	private int ssd;
	
	
	public Smartphone(String marca, String model, String color, int ram, int ssd) {
		super();
		this.marca = marca;
		this.model = model;
		this.color = color;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	public String toString() {
	
		return "model: " + this.model;
	}


}