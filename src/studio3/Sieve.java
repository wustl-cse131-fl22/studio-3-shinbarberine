package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		int positive_ints;
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Find all prime numbers up to?: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++)
		{
			positive_ints = i + 1;
			array[i] = positive_ints;
			if (array[i] != 1)
				
				if (array[i] % 2 != 0 && n >= 2 || array[i] == 2)
	
					if (array[i] % 3 != 0 && n >= 3 || array[i] == 3)
						
						if (array[i] % 5 != 0 && n >= 5 || array[i] == 5)
							
							if (array[i] % 7 != 0 && n >= 7 || array[i] == 7)
								
								System.out.println(array[i]);
		}
	}

}
