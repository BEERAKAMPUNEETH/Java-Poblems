import java.util.Scanner;
   // 1634
   // 4
   // 1^4 + 6^4 + 3^4 + 4^4
   //  1  + 1296 + 81 + 256
   // 1634
   // find the number of digits
   // break into digits, power to NOD
   // sum
   // verify
class arms
{
	public static void main( String [] parameters )
	{
		 Scanner kbrd = new Scanner ( System.in );
		 int num;
		 int copy;
		 int nod_num;
		 int digit;
		 int powered_digit;
		 int sum;
		 // populate
		 num = kbrd.nextInt();
		 // prime
		 nod_num = 0;
		 sum = 0;
		 // process
		 // find the number of digits
	     copy = num;
		 while ( copy != 0 )
		 {
		 digit = copy % 10; // query the LSD
		 nod_num ++;	
		 copy /= 10; // loose the LSD
		 }
	     copy = num;
		 while ( copy != 0 )
		 {
		 digit = copy % 10; // query the LSD
		 powered_digit =(int) Math.pow(digit, nod_num);
		 sum += powered_digit;
		 copy /= 10; // loose the LSD
		 }
		 
		 
		 // output
		 
		 if ( num == sum )
		    System.out.println("ARMS");
		 else
            System.out.println("NOT ARMS");		 
		 
	}
}