import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

//was going to create a big int class, but already defined
public class Problem13 {
	File f;
	int[][] digitPlace;
	public static void main(String[] args) throws FileNotFoundException 
	{
		Problem13 p = new Problem13();
		p.ReadIn();
		p.run();
	}
	
	private void ReadIn() throws FileNotFoundException
	{
		Scanner freader = new Scanner(f);
		BigInteger sum = new BigInteger(freader.next());
		while(freader.hasNext())
		{
			sum = sum.add(freader.nextBigInteger());
		}
		
		System.out.println(sum);

		// TODO Auto-generated method stub
		
	}

	Problem13()
	{
		f = new File("problem13digits.txt");
		digitPlace = new int[100][50];
	}
	public void run()
	{
		
		
	}

}
