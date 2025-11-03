package h1;

public class H1_main {

	public static void main(String[] args) {

		double guthaben = -100;
		double monEingang = 200;
		int rating = -2;
		boolean warnhinweis = false;
		boolean negativ = false;
		
		/**
		if (guthaben < 0) {
			negativ = true;
		}

		if (guthaben > 0) {
			rating += 3;
		}

		if (guthaben == 0) {
			rating += 2;
		}

		if (guthaben < 0 && monEingang >= Math.abs(guthaben)) {
			rating++;
		}

		if (guthaben < 0 && monEingang < Math.abs(guthaben)) {
			rating--;
		}

		if (guthaben < 0 && monEingang < Math.abs(guthaben) && rating < 0) {
			warnhinweis = true;
		} else {
			warnhinweis = false;
		}
		**/
		if (guthaben < 0) {
			negativ = true;
			if (monEingang >= Math.abs(guthaben)) {
				rating++;
			} else {
				rating--;
				if (rating < 0) {
					warnhinweis = true;
				} else {
					warnhinweis = false;
				}
			}
		} else if (guthaben == 0) {
			rating += 2;
		} else {
			rating += 3;
		}

		// Für Testzwecke:
		System.out.println(guthaben + ", " + monEingang + ", " + rating + ", " + warnhinweis + ", " + negativ);
	}

}
