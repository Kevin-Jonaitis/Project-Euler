import java.util.Random;


public class Problem12 {
	
	public static void main(String[] args) 
	{
		Problem12 p = new Problem12();
		p.run();
	}
	
	public Problem12()
	{
	
	} 	
	
	
	public int calculateTriangle(int triangleNumber)
	{
		
		return (triangleNumber + 1) * triangleNumber / 2;
	}
	
	public int[] calculateFactors(int number, boolean[] numbers, int[] numOfFactors)
	{
		if (!(numbers[number]))
		{
				numbers[number] = true;
				numOfFactors[0]++;
		}

		for (int i = 2; i <= (int) (Math.sqrt(number) + 1); i++)
		{
				//System.out.println("i is " + i);
				//System.out.println("n is " + number);
			if (number % i == 0)
			{
				//System.out.println(i + " is divisible");
				if (!(numbers[i]))
				{
					numbers[i] = true;
					numOfFactors[0]++;
				}
				
			calculateFactors((number/i), numbers, numOfFactors);
			}
		}
		return numOfFactors;
	}
	
	//http://mathschallenge.net/index.php?section=faq&ref=number/number_of_divisors
	//used for logic
	public int calculateFactors(int number)
	{
		int bottom = 1;
		int top = number;
		int numberOfFactors = 0;
		
		while (bottom  < top)
		{
			if (number % bottom == 0)
			{	
				top = number / bottom;
				numberOfFactors = numberOfFactors + 2;
			}
			bottom++;
		}
		
		return numberOfFactors++;
		
	}
	
	public void run()
	{
		
		int numOfFac;
		int triangle;
		boolean foundTriangle = false;
		int i = 2;
		
		while (!foundTriangle)
     	{
			triangle = calculateTriangle(i);
			numOfFac = calculateFactors(triangle);
			
			System.out.println("the number of factors is " + numOfFac + " with number " + triangle);
			//System.out.println("The number is " + triangle);
			
			if (numOfFac >= 500)
			{
				foundTriangle = true;
				System.out.println("The winner is " + triangle);
			}
			i++;
		}
	}
}
