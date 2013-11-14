public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int c = 0; c < 1000; c++) {
			for (int b = 0; b < c; b++) {
				for (int a = 0; a < b; a++) {
					if (a + b + c == 1000) {
						if ((a * a) + (b * b) == (c * c)) {
							System.out.println("a: " + a + " b: " + b + " c: " + c);
							System.exit(0);
						}
					}
				}
			}
		}
	}
}
