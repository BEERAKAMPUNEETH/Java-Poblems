import java.util.Scanner;
class prime_v1
{
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		int num;
		num = kbrd.nextInt();
		boolean factor_found_flag;
		factor_found_flag = false;
		int cff ; // check for factor
		long start = System.currentTimeMillis();
		for( cff = 2; cff < num/2 ; cff++)
		{
		   if (  num % cff == 0)
		   {
		       factor_found_flag = true;
		       break;
			   
		   }
		}
		long stop = System.currentTimeMillis();
		double duration = ( stop - start ) / 1000.0;
		System.out.println(duration);
		if ( factor_found_flag == false )
		   System.out.println("Prime");
		else
           System.out.println("Composite");		
	}
}