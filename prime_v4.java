import java.util.Scanner;
class prime_v4
{
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		long  num;
		num = kbrd.nextLong();
		boolean factor_found_flag;
		factor_found_flag = false;
		long cff ; // check for factor
		long start = System.currentTimeMillis();
		if ( num % 2 == 0 || num % 3 == 0)
		   factor_found_flag = true;
		else 
		{
			for( cff = 5; cff < Math.sqrt(num) ; cff+=6)
			{
			   if (  num % cff == 0 ||  num % (cff+2)==0)
			   {
				   factor_found_flag = true;
				   break;
				   
			   }
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