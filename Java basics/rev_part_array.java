import java.util.Scanner;
import java.util.Random;
// 0 1 2 3 4 5 6 7 8 9 
// 8 9 0 1 3 6 4 5 7 2
// 2 7 5 4 6 3 1 0 9 8

class rev_part_array
{
	private static void swap ( int [] arr, int pos1, int pos2 )
	{
		int temp ;
		temp = arr [ pos1 ];
	    arr [ pos1 ] = arr [ pos2 ];
		arr [ pos2 ] = temp;
	}
	public static void reverse( int [] arr )
	{
		int front;
		int rear;
		front = 0;
		rear = arr.length - 1;
		while ( front < rear )
		{
			swap(arr, front, rear );
			front++;
			rear--;
		}
	}
    public static void print( int [] arr )
	{
	   int arr_ind;
	   for( arr_ind = 0; arr_ind < arr.length; arr_ind++)
	       System.out.printf("%d ", arr [ arr_ind ] );
		   
		   
		   System.out.println();
	}
	public static void main( String [] parameters )
	{
	    int noe; // number of elements
		Scanner kbrd =  new Scanner ( System.in);
		noe = kbrd.nextInt();
		int [] arr = new int [ noe ];
		int arr_ind;
		int tempVal;
        Random rnd = new Random();
		for( arr_ind  =0; arr_ind < noe; arr_ind++)
		{
		    tempVal = rnd.nextInt();
			if ( tempVal < 0 )
			    tempVal = -tempVal;
		    tempVal = tempVal % 1000;	
            arr [ arr_ind ]  = tempVal;			
		}
		print( arr );
		reverse( arr );
		print( arr );
	}
}
