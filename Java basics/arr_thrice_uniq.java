import java.util.Scanner;
class arr_thrice_uniq
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
    public static int anyBase_XOR ( int v1, int v2, int base )
	{
	   int copy_v1;
	   int copy_v2;
	   int d1;
	   int d2;
	   int res;
	   int res_d;
	   int res_power;
	   copy_v1 = v1;
	   copy_v2 = v2;
	   res = 0;
	   res_power = 1;
	   while ( copy_v1 != 0 || copy_v2 != 0 )
	   {
	   d1 = copy_v1 % 10;
	   d2 = copy_v2 % 10;
	   res_d = ( d1 + d2 ) % base;
	   res = res_d * res_power + res;
	   copy_v1 /= 10;
	   copy_v2 /= 10;
	   res_power*=10;
	   }
	   return res;	   
	}
    public static void main( String [] parameters )
	{
	    //System.out.printf("%d", anyBase_XOR ( 1011222, 2120 ,3));	
	    Scanner kbrd = new Scanner ( System.in );
		int noe; // number of elments in the array
		noe = kbrd.nextInt();
		int [] data = new int [noe];
		int [] temp = {283, 429, 345, 228, 283, 548, 916, 715, 548, 292, 399, 13, 429, 785, 785, 493, 13, 143, 429, 399, 982, 131, 765, 35, 292, 443, 399, 960, 556, 21, 429, 493, 702, 508, 556, 143, 1806, 916, 21, 958, 445, 228, 718, 21, 958, 95, 785, 960, 225, 548, 765, 35, 283, 131, 228, 322, 345, 449, 445, 95, 715, 718, 449, 225, 702, 556, 493, 960, 982, 322, 131, 445, 508, 143, 958, 443, 345, 443, 35, 429, 429, 702, 449, 715, 13, 548, 292, 982, 548, 225, 765, 322, 916, 548, 95, 369, 369, 718, 369, 508};
		data = temp;
/*		int triplets = noe / 3;
		Random rnd = new Random();
		int data_ind;
		for( data_ind = 0; data_ind < noe ; data_ind+=3)
		{
			  rndVal = rnd.nextInt() % 1000;
			  if ( rndVal <  0)
				  rndVal = -rndVal;;
			  data [ data_ind + 0 ] = rndVall
			  data [ data_ind + 1 ] = rndVall
			  data [ data_ind + 2 ] = rndVall
			  
		}
		int uniq;
		uniq = kbrd.nextInt();
		data [ noe - 1] = uniq;
*/		
		
    int data_ind;
	int res;
	res = 0;
	for( data_ind = 0; data_ind < noe; data_ind++)
	{
		int inb3;
		inb3 = dec_to_anyBase ( data [ data_ind ] , 3);
		res = anyBase_XOR ( res, inb3 , 3 );
	}
	res = toDecimal( res, 3 );
	System.out.printf("uniq = %d\n", res );
		
	}
}























