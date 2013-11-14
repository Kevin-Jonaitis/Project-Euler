import java.math.BigInteger;


public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger b = new BigInteger("2");
			b = b.pow(1000);
		System.out.println(b);
		String line = b.toString();
		long total = 0;
		for (int i = 0; i < line.length(); i++)
		{
			total += Integer.parseInt(line.substring(i,i+1));
		}
		System.out.println(total);
	}

}
