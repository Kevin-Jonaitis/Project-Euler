
public class Problem21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int amicSum = 0;
		for (int a = 1; a< 10000; a++) {
			int bTest = 0;
			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					bTest = bTest + i; //284
				}
			}
			
			if (a != bTest  && ((a % 2 == 0 && bTest % 2 == 0) || (bTest % 2 != 0 && a % 2 != 0))) //if they are not the same number, and both even or both odd
			{
				int aTest = 0;
				for (int i = 1; i < bTest; i++) {
					if (bTest % i == 0)
						aTest = aTest + i; //220
				}
				if (aTest == a) {
					System.out.println("Pair:" + bTest + " " + aTest);
					amicSum = amicSum + aTest;//only add one half of the pair, the other half will be found later
			}
			
			}
		}
		
		System.out.println("Sum: " + amicSum);
	}

}
