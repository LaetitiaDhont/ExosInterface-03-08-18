package package1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création d'une instance pour la note minimale 
		InplInterface1 noteMinimale = new InplInterface1();
		// Création d'une instance pour la note maximale
		InplInterface1 noteMaximale = new InplInterface1();
	
		noteMinimale.setV1(14);
		noteMinimale.setV2(12);
		
		noteMaximale.setV1(200);
		noteMaximale.setV2(1000);
	
		
		System.out.println("Voici la note minimale numéro une :" + noteMinimale.getV1());
		System.out.println("Voici la note minimale numéro deux : " + noteMinimale.getV2());
		System.out.println("Voici la note minimale : " + noteMinimale.minimum());
		System.out.println("Voici la note maximale : " + noteMaximale.maximum());
		
	}

}
