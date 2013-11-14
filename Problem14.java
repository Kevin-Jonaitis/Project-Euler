import java.util.TreeMap;

//took a bit of time. After it finds a sequence, it should recursively add all the numbers to the map
//up to the number where the sequence was found
public class Problem14 {

	
	TreeMap<Long, Long> binaryTree = new TreeMap();
	long longestStartingNumber = -1;
	long lengthOfChain = -1;
	/**ss
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem14();
	}
	
	public Problem14()
	{
		for (long i = 2; i <=1000000; i++)
		{
			long current = i;
			long sequence = 0;
			System.out.print("Number " + i + ":");
			while  (current != 1)
			{
				System.out.print(" " + current);

				Long test = binaryTree.get(current);
				if (test == null) {
					current = applyRules(current);
					sequence++;
				} 
				else {
					System.out.print(" Found " +  current  + " in tree. Remaining sequence is " + test + " numbers long");
					sequence += test;
					current = 1;
				}
			}
			System.out.println();
			binaryTree.put(i, sequence);
			sequence++; //just add 1 for some reason

			System.out.println("Number:" + i + " has a total sequence of: " + sequence);
			if (sequence > lengthOfChain) {
				lengthOfChain = sequence;
				longestStartingNumber = i;
			}
		}
		
		System.out.println("Longest starting number is " + longestStartingNumber + " with length " + lengthOfChain);
	}
	
	public Long applyRules(Long l) {
		if(l % 2 == 0)
			return (l /2 );
		else
			return ((l * 3) + 1);
	}
}
