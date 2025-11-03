package h2;
import java.util.*;
public class H2_main {

	public static void main(String[] args) {
		int jahr;
		boolean schalt = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie Ihr Jahr ein:");
		jahr = s.nextInt();
		s.close();
		
		if(jahr % 4 == 0) {
			schalt = true;
			if(jahr % 100 == 0) {
				schalt = false;
				if(jahr % 400 == 0) {
					schalt = true;
				}
			}
		}
		
		
		if(schalt) System.out.println(jahr + " ist ein Schaltjahr.");
		else System.out.println(jahr + " ist kein Schaltjahr.");
	}

}
