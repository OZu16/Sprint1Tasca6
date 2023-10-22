package n3exercici1;

public class MainClass {

	public static void main(String[] args) {
		
		/*resposta a la pregunta del exercici:
			
			no, el mètode limitat per la interfície Telefon, de la classe Generica, NO pot cridar al mètode ferFotos()*/
			
		
		Smartphone smartphone1 = new Smartphone();
		Generic generic1 = new Generic(); 
		
		generic1.callTelephoneMethod(smartphone1);
		generic1.callSmartphoneMethod(smartphone1);
	}
	

}
