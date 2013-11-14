import java.math.BigInteger;

//Convoluted method, not very efficent, but was quick to write
public class Problem20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger b = new BigInteger("100");
		for (int i = 99; i > 0; i--) {
			BigInteger j = new BigInteger(Integer.toString(i));
			b = b.multiply(j);
			System.out.println("i:" + i);
		}
		String line = b.toString();
		System.out.println(line);
		long total = 0;
		for (int i = 0; i < line.length(); i++)
		{
			total += Integer.parseInt(line.substring(i,i+1));
		}
		System.out.println(total);
	}

}
