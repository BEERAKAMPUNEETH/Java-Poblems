import java.util.Scanner;
class toOctal
{
    public static int dec_to_octal ( int deci )
	{
	    int octalRep;
		int power;
		int copy_deci;
		int rem; // remainder
		copy_deci = deci;
		octalRep = 0;
		power = 1;
		while ( copy_deci != 0)
		{
		rem = copy_deci % 8;
		octalRep = rem * power + octalRep;
		copy_deci /= 8;
		power *= 10;
		}
		return octalRep;
	}
	
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		
		int deci;
		int octa;
		deci = kbrd.nextInt();
		octa = dec_to_octal ( deci );
		System.out.printf("(%d)10 = (%d)8", deci,octa);
	}
}