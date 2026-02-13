import java.util.Scanner;

class toDecimal
{
    public static int toDecimal( int someBase_rep, int whatBase)
	{
	// someBase_rep 1234
	// whatBase     6
	// 4 *1 + 3*6 + 2 * 36+ 1 * 216
	   int copy; // copy of someBase_rep
	   int digit;
	   int whatBase_power;
	   int inDeci;
	   
	   copy=someBase_rep;
	   whatBase_power = 1;
	   inDeci = 0;
	   while ( copy != 0 )
	   {
	       digit = copy % 10;
		   inDeci += digit * whatBase_power;
		   whatBase_power *= whatBase;
		   copy /= 10;
	   }
	   return inDeci;
	}
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		int anyBase_val;
		int base;
		int inDeci ;
		anyBase_val = kbrd.nextInt();
		base = kbrd.nextInt();
		inDeci = toDecimal( anyBase_val, base );
		System.out.printf("(%d)%d is (%d)10\n", anyBase_val, base, inDeci);
	}
}