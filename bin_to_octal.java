import java.util.Scanner;
class bin_to_octal
{
	public static void main( String [] parameters )
	{
       long inBinary;
	   int octal;
	   int octal_digit;
	   int bits;
	   int pv;
	   long copy_inBinary;
	   Scanner kbrd = new Scanner ( System.in );
	   // populate
	   inBinary = kbrd.nextLong();
	   // priming
	   pv = 1;
	   octal = 0;
	   // processing
	   copy_inBinary = inBinary;
	   octal_digit=0;
	   while ( copy_inBinary != 0 )
	   {
		   bits = (int) (copy_inBinary % 1000);
		   switch ( bits )
		   {
			 case 0   : octal_digit  = 0; break;
			 case 1   : octal_digit  = 1; break;
			 case 10  : octal_digit  = 2; break;
			 case 11  : octal_digit  = 3; break;
			 case 100 : octal_digit  = 4; break;
			 case 101 : octal_digit  = 5; break;
			 case 110 : octal_digit  = 6; break;
			 case 111 : octal_digit  = 7; break;
			 
		   }
		   octal = octal_digit * pv + octal;
		   pv *= 10;
		   copy_inBinary /= 1000;
	   }
       // output
       System.out.printf("(%d)2 = (%d)8", inBinary, octal);	   
	   
	}
}