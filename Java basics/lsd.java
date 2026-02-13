import java.util.Scanner;
   
class lsd
{
	public static void main( String [] parameters )
	{
		 Scanner kbrd = new Scanner ( System.in );
		 int num;
		 int copy;
		 int nod_num;
		 int sod_num;
		 int digit;
		 // populate
		 num = kbrd.nextInt();
		 // prime
		 nod_num = 0;
		 sod_num = 0;
		 // process
	     copy = num;
		 while ( copy != 0 )
		 {
		 digit = copy % 10; // query the LSD
		 System.out.println ( digit );
		 nod_num ++;
		 sod_num += digit;
		 copy /= 10; // loose the LSD
		 }
		 // output
		 
		 System.out.printf("SOD = %d , NOD = %d",sod_num, nod_num);
		 
		 
	}
}