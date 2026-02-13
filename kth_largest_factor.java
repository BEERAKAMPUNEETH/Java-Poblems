import java.util.Scanner;
class Node
{
    long quo;
	long partner;
	Node next;
	Node ( long quo, long partner ) // constructor
	{
	    this.quo = quo;
		this.partner = partner;
		next = null;
	}
}
class sll
{
    Node first;
	Node last;
	int non; // number of nodes
	boolean odd_factors_flag;
    sll()
	{
	    first = null;
		last  = null;
		non = 0;
		odd_factors_flag = false;
	}
	void print ()
	{
	   Node trav;
	   for( trav = first; trav  != null; trav = trav.next )
	       System.out.printf("%d %d\n", trav.quo, trav.partner);
	}
	void append ( long quo, long partner )
	{
	   Node nn = new Node ( quo, partner );
	   if ( quo == partner )
	      odd_factors_flag = true;
	   if ( first == null )
	   {
	       first = nn;
		   last = nn;
	   }
	   else
	   {
	        last.next = nn;
			last = nn;
	   }
	   non++;
	   
	   
	}
	int numberOfFactors()
	{
		int ret;
		ret = non * 2;
		if ( odd_factors_flag == true )
			ret--;
		return ret;
	}
 }

class kth_largest_factor
{
	public static void main( String [] parameters )
	{
		sll factors = new sll ();
		long num;
		Scanner kbrd = new Scanner ( System.in );
		long cff;
		num = kbrd.nextLong();
		for( cff = 1; cff < Math.sqrt( num ); cff++)
		{
		   if ( num % cff == 0 )
		   {
		    factors.append( cff , num /cff );
		   }
		}
		if ( cff * cff == num )
		    factors.append( cff, cff );
			
			factors.print();
			System.out.printf("\nnof = %d\n", factors.numberOfFactors());
	}
}