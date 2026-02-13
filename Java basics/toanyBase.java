// 1234
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
import java.util.Scanner;
class toanyBase
{
    public static int dec_to_anyBase ( int deci , int toBase)
	{
	    int targetBase;
		int power;
		int copy_deci;
		int rem; // remainder
		copy_deci = deci;
		targetBase = 0;
		power = 1;
		while ( copy_deci != 0)
		{
		rem = copy_deci % toBase;
		targetBase = rem * power + targetBase;
		copy_deci /= toBase;
		power *= 10;
		}
		return targetBase;
	}
	
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		
		int deci;
		int res;
		deci = kbrd.nextInt();
		for( int base = 2; base < 10; base++)
		{
		res = dec_to_anyBase ( deci, base );
		System.out.printf("(%d)10 = (%d)%d\n", deci,res, base);
		}
	}
}