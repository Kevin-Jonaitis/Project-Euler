import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RecycledNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		RecycledNumbers rn = new RecycledNumbers();
	}
	
	public RecycledNumbers()
	{
		
		int min;
		int max;
		int[] permutations;
		int numberOfPermutations = 1;
		int length;
		String test = "12345";
		length = test.length(); //length of number
		for (int i = length; i > 0; i --)
			numberOfPermutations = numberOfPermutations * i;
		
		//getReverseForRange(min, max);
		permutations = new int[numberOfPermutations];
		int[] count = new int[1];
		//perm1(test, count, permutations);
		System.out.println(getReverseOfRange(1111,2222));

	}


	public int getReverseOfRange(int min, int max)
	{

		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		
		for(int i = min; i < max; i++)
		{
			a.add(new ArrayList<Integer>());
		}
		
		boolean[] duplicates = new boolean[max - min];
		
		System.out.println("the length is " + duplicates.length);
		int count = 0;
		String number;
		for (int k = min; k < max; k++)
		{
			number = String.valueOf(k);
			int length = number.length(); //goes through all the possible substrings, but they have to have the end in them

			
			for (int i = length; i >= 0; i--)
			{
				
					String testString = number.substring(i, length) + number.substring(0 , i);
					int testInt = Integer.parseInt(testString);

					if ((testInt > min) && (testInt < max) && k != testInt && (k > testInt))
					{
							int kOffset = k - min;
							int testIntOffset = testInt - min;
							//boolean debug = a.get(testIntOffset).contains(kOffset);
							if (! ((a.get(testIntOffset).contains(kOffset)) || (a.get(kOffset).contains(testIntOffset))))
							{
								    System.out.println("M: " + k);
									System.out.println("N: " + testInt);
									System.out.println(" ");
									
									a.get(kOffset).add(testIntOffset);
									//a.get(testIntOffset).add(kOffset);
								count++;
							}
					}
					//System.out.println(number.substring(j , i));
					//System.out.println(number.substring(i, length));
					//System.out.println("i: " + i + " j: " + j);
					//System.out.println("or " + number.substring(i, j));
			}
		}
		return count;
	}
	
	public int[] getPurmutations(int m, int n) 
	{
		for (int i = n; i < m; i++)
		{
		    int[] mDigits = getCombinations(i, n, m);
		    System.out.println(i);
		}
		return null;
	}
	
	  public  static void perm1(String s, int[] count, int[] perms) { perm1("", s, count, perms); }
	    private static void perm1(String prefix, String s, int[] count, int[] perms) {
	        int N = s.length();
	        if (N == 0) 
	        {
	        	perms[count[0]] = Integer.parseInt(prefix); 
	        	count[0]++;
	        }
	        else {
	            for (int i = 0; i < N; i++)
	               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N), count, perms);
	        }

	    }


	public int[] getCombinations(int number, int min, int max)
	{
		//reads the digits into an array list
		int numOfDigits = (int) Math.log10(number) + 1 ;
		int[] digitList = new int[numOfDigits];
		for (int i = 0; i < numOfDigits; i++)
		{
			digitList[i] = (int) ( ((number % (Math.pow(10, i+1))) / (Math.pow(10, i))) );
			
		}
		return digitList;
	}
}
