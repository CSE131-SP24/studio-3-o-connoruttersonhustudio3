package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		//this code collects user input for
		//the value of cap
		Scanner in = new Scanner(System.in);
		System.out.println("search up to what integer?");
		int cap = in.nextInt();
		
		//this code initializes an array
		//which stores the natural numbers
		//up to cap
		int[] intArray = new int[cap];
		for (int l = 0; l < cap; l++) {
			intArray[l] = l + 1;
		}
		
		//since 1 is not prime, we set
		//intArray[0] to 0, as we will
		//later exclude the entries with
		//value 0
		intArray[0] = 0;
		
		//this for loop excludes multiples
		//of all primes, i is capped at the
		//sqrt(cap) for efficiency, j is 
		//capped at cap / i to remain in
		//bounds
		for (int i = 2; i <= Math.sqrt(cap);) {
			for (int j = 2; j <= cap / i;) {
				intArray[i * j - 1] = 0;
				j++;
			}
			i++;
		}
		
		//this code prints the prime numbers
		//(entries that are not 0)
		for (int k = 0; k < cap; k++) {
			if (intArray[k] != 0) {
				System.out.println(intArray[k]);
			}
		}
}
}