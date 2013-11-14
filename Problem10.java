

//This is a variation of problem 7.
public class Problem10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Problem10();
	}
	
	public Problem10() {
		 int N = 2000000;

	        // initially assume all integers are prime
	        boolean[] isPrime = new boolean[N + 1];
	        for (int i = 2; i <= N; i++) {
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
	        long total = 0;
	        
	        for (int i = 0; i < isPrime.length; i++) {
	        	if (isPrime[i]) {
	        	//	System.out.println(i + " is prime");
	        		total += i;
	        	}
	        }
	        System.out.println("The total sum of primes below " + N + " is " + total);
	}

}
