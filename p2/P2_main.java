package p2;

public class P2_main {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 10;
		int d;
		
		d = 0;
		
		if(a == b) d++; //E1
		if(a == b || a == c) d++; //E2
		if((a + b) >= c) d++; //E3
		if((a+ b+ c) >= 100) d++; //E4

		System.out.println("a: " + a + "; b: " + b + "; c: " + c);
		System.out.println("d: " + d);
	}
}
