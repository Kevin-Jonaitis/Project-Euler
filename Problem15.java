
public class Problem15 {
	/**
	 * @param args
	 */
	int[] routes;
	public static final int SIZE = 19;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem15 p = new Problem15();
	}
	
	public Problem15()
	{
		routes = new int[1];
		routes[0] = 1; //start with one route
		run(1,1);
		System.out.println("Number of Routes: " + routes[0]);

	}
	
	public void run(int x, int y)
	{
		
		if (x < SIZE && y < SIZE)
		{
			routes[0]++;
			run(x+1 , y);
			run(x , y+1);
		}
		System.out.println("current number" + routes[0]);
		
	}
}

//BABY, its just 40 choose 20
/**
 * That is, (40!)/(20! * 20!)
 *
 */
