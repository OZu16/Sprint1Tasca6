package n3exercici1;

public class Generic {

	public <T extends Telephone> void callTelephoneMethod(T tel) {
		
		tel.call();
	}
	
	public <S extends Smartphone> void callSmartphoneMethod(S sphone) {
		
		sphone.call();
		sphone.takePhoto();
	}
}
