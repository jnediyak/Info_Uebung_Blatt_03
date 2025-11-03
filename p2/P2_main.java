package p2;

public class P2_main {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 10;
		int d;
		
		d = 0;
		
		if(a == b) d++;
		if(a == b || a == c) d++;
		if((a + b) >= c) d++;
		if((a+ b+ c) >= 100) d++;

		System.out.println("a: " + a + "; b: " + b + "; c: " + c);
		System.out.println("d: " + d);
	}
}
