import java.util.Scanner;
import java.util.Random;
class sort
{
	private static void maxHeapify ( int [] arr, int pno, int li)
	{
		int left;
		int right;
		left  = pno * 2 + 1;
		right = pno * 2 + 2;
		if ( left > li ) // child
		   return;
		if ( left == li )
		{
			if ( arr [ pno ] < arr [ left ] )
			{
				swap ( arr, left, pno );
			}
			return;
		}
		
		// is there violation
		if ( arr [ left ] > arr [ pno] || arr [ right ] > arr [ pno ] )
		{
			if ( arr [ left ] > arr [ right ] )
			{
				swap ( arr, pno, left );
				maxHeapify ( arr, left, li);
			}
			else
			{
				swap ( arr, pno, right);
				maxHeapify ( arr, right, li);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	private static void swap ( int [] arr, int po1, int po2)
	{
		int temp;
		temp = arr [ po1 ];
		arr [ po1 ] = arr [ po2 ];
		arr [ po2 ] = temp;
	}
	public static void heapSort ( int [] data )
	{
		// arm length
		// set an enviroment
		int numParents;
		int pno;
		numParents = data.length / 2;
		int lastIndex;
		lastIndex = data.length - 1;
		for( pno = numParents-1; pno>=0; pno--)
	    {
			maxHeapify ( data, pno, lastIndex);
		}
		swap(data,0,lastIndex);
		lastIndex--;
        while ( lastIndex >= 0)		{
			maxHeapify ( data, 0, lastIndex );
			swap ( data, 0, lastIndex);
			lastIndex--;
		}			
		// call helper - recursive, pass enviroment, initiate
	
	}
    public static void print ( int [] data )
	{
	   int data_ind;
	   for ( data_ind = 0 ; data_ind < data.length; data_ind ++)
	      System.out.printf("%d ", data [ data_ind ] );
		System.out.println();  
	}
	public static void insertionSort ( int [] arr )
	{
		int unsorted;
		int shift;
		int temp;
		for( unsorted = 1; unsorted < arr.length ; unsorted ++)
		{
			shift = unsorted-1;
			while ( shift >= 0 && arr [ shift ] > arr [ shift + 1] )
			{
				temp = arr [ shift ];
				arr [ shift ] = arr [ shift + 1];
				arr [ shift + 1] = temp;
				shift --;
			}
		}
	}
	public static void bubbleSort ( int [] data )
	{
	    int outer;
		int inner;
		int temp;
		for( outer  = 0; outer < data.length - 1; outer++)
		{
		    for( inner = 0; inner < (data.length - (outer+1) ); inner++)
			{
			   if ( data [ inner ] > data [ inner + 1 ])
			   {
			       temp = data [ inner ];
				   data [ inner ] = data [ inner + 1 ];
				   data [ inner + 1] = temp;
			   }
			}
		}
	}
	public static void main( String [] parameters )
	{
		int noe ;
		Scanner kbrd = new Scanner ( System.in );
		noe = kbrd.nextInt();
		int [] arr = new int [ noe ];
		int arr_ind;
		int rndVal;
		Random rnd = new Random();
		for( arr_ind = 0; arr_ind < noe; arr_ind++)
		    arr [ arr_ind ] = rnd.nextInt()%100;
		 //   print( arr );
			long start = System.nanoTime();
			//bubbleSort( arr );
			//insertionSort ( arr );
			heapSort ( arr );
			long stop = System.nanoTime();
			double duration = ( stop - start ) / 1000000000.0;
		//	print( arr );
//			System.out.printf("%s Sort - %d elements Duration = %.3f", "Bubble", noe, duration);
			System.out.printf("%s Sort - %d elements Duration = %.3f", "Insertion", noe, duration);

	}
}