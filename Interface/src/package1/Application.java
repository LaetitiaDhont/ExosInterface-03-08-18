package package1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cr�ation d'une instance pour la note minimale 
		InplInterface1 noteMinimale = new InplInterface1();
		// Cr�ation d'une instance pour la note maximale
		InplInterface1 noteMaximale = new InplInterface1();
	
		noteMinimale.setV1(14);
		noteMinimale.setV2(12);
		
		noteMaximale.setV1(200);
		noteMaximale.setV2(1000);
	
		
		System.out.println("Voici la note minimale num�ro une :" + noteMinimale.getV1());
		System.out.println("Voici la note minimale num�ro deux : " + noteMinimale.getV2());
		System.out.println("Voici la note minimale : " + noteMinimale.minimum());
		System.out.println("Voici la note maximale : " + noteMaximale.maximum());
		
	}

}
