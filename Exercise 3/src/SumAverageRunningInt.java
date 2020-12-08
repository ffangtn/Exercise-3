
public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		System.out.println("1. For Loop");
		int sumf = 0; 
		double averagef; 
		int lowerboundf = 1;
		int upperboundf = 100;

		for (int numberf = lowerboundf; numberf <= upperboundf; numberf++) {
			sumf += numberf;
		}
		
		averagef = sumf/100.00 ;
		
		System.out.println("The sum of 1 to 100 is " + sumf );
		System.out.println("The average is " + averagef );
		System.out.println();
		
		
		System.out.println("2. While Loop");
		int sumw = 0; 
		double averagew; 
		int lowerboundw = 1;
		int upperboundw = 100;
		int numberw = lowerboundw;
		
		while(numberw <= upperboundw) {
			sumw += numberw;
			numberw++;
		}
		
		averagew = sumw/100.00 ;
		
		System.out.println("The sum of 1 to 100 is " + sumw );
		System.out.println("The average is " + averagew );
		System.out.println();
		
		System.out.println("3. Do While Loop");
		int sumd = 0; 
		double averaged; 
		int lowerboundd = 1;
		int upperboundd = 100;
		int numberd = lowerboundd;
		
		do {
			sumd += numberd;
			numberd++;
		}while(numberd <= upperboundd);
		
		averaged = sumd/100.00 ;
		
		System.out.println("The sum of 1 to 100 is " + sumd );
		System.out.println("The average is " + averaged );
		
	}

}
