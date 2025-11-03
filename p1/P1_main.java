package p1;
import java.util.*;
public class P1_main {

	public static void main(String[] args) {

		int wuerfel;
		
		Random r = new Random();
		wuerfel = r.nextInt(7);
		
		if(wuerfel == 1 || wuerfel == 4) System.out.println("Gewonnen!!!");
		else if(wuerfel == 2) System.out.println("Verloren :(");
		else if(wuerfel == 5) System.out.println("Unentschieden *_*");
		else System.out.println("Unklare Lage");
	}

}
