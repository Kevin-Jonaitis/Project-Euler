
public class Problem7 {
	
	

	public static void main(String[] args)
	{
		Problem7 p = new Problem7();
	}

	public Problem7() 
	{
		 int N = 1000000;

	        // initially assume all integers are prime
	        boolean[] isPrime = new boolean[N + 1];
	        for (int i = 2; i <= N; i++) 
	        {
	            isPrime[i] = true;
	        }

	        // mark non-primes <= N using Sieve of Eratosthenes
	        for (int i = 2; i*i <= N; i++) {

	            // if i is prime, then mark multiples of i as nonprime
	            // suffices to consider mutiples i, i+1, ..., N/i
	            if (isPrime[i]) {
	                for (int j = i; i*j <= N; j++) {
	                    isPrime[i*j] = false;
	                }
	            }
	        }

	        // count primes
	        int primes = 0;
	        for (int i = 2; i <= N; i++) {
	            if (isPrime[i]) primes++;
	        }
	        
	        int i = 0;
        	int j = 0;

	        while (i != 10001)
	        {
	        	if (isPrime[j] == true)
	        	{
	        		i++;
	        	}
	        		j++;
	            	System.out.println(j);

	        }

        	
	        System.out.println("The number of primes <= " + N + " is " + primes);
		
	}

}
