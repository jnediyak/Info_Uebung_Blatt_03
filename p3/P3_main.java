package p3;

public class P3_main {

	public static void main(String[] args) {
		int a = -15; //Zahl für Betrag
		int b = -7; //Zahl für Quadrat
		int c = 4; //Gerade oder Ungerade
		
		System.out.println("Der Betrag der Zahl '" + a + "' ist: " + Math.abs(a));
		System.out.println("Das Quadrat der Zahl '" + b + "' ist: " + b*b);
		
		if(c % 2 == 0) System.out.println("Die Zahl '" + c + "' ist gerade");
		else System.out.println("Die Zahl '" + c + "' ist ungerade");
	}

}
