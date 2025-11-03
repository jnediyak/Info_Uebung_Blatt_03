package h3;

public class H3_main {

	public static void main(String[] args) {
		int max = 5;
		int fix = 2;
		int wartend = 2;
		boolean istVoll;

		if (fix == max) {
			istVoll = true;
		} else {
			istVoll = false;
		}

		while (wartend > 0 && istVoll == false) {
			fix++;
			wartend--;
			if (fix >= max) {
				istVoll = true;
			}
		}
		// Testzwecke
		System.out.println("max: " + max + ", fix: " + fix + ", wartend: " + wartend + ", istVoll: " + istVoll);

	}

}
