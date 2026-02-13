// sll
class Node
{
     long data ;
	 Node next;
	 Node ( long data )
	 {
	     this.data = data;
		 next = null;
	 }
}
class sll 
{
    Node firstNode;
	Node lastNode;
	int non; // number of nodes
	sll ( )
	{
	    firstNode = null;
		lastNode  = null;
		non       = 0;
	}
	public void addFront(long data )
	{
	    Node newNode = new Node ( data );
		if ( firstNode == null )
		{
		   firstNode = newNode;
		   lastNode  = newNode;
		}
		else{
		     newNode.next = firstNode;
			 firstNode = newNode;
		}
		non++;
	}
	public void add ( sll gl )
	{
	   lastNode.next = gl.firstNode;
	}
	
	public void reverse()
	{
		Node prevNode;
		Node currNode;
		Node nextNode;
		prevNode = null;
		currNode = firstNode;
		nextNode = firstNode.next;
		while ( currNode != null )
		{
		currNode.next = prevNode;
		prevNode = currNode;
		currNode = nextNode;
		if ( nextNode != null )
             nextNode = nextNode.next;
        
	    }		
		Node temp = firstNode;
		firstNode = lastNode;
		lastNode = temp;
		
		
		
		
		
	}
	public void print ()
	{
		Node trav;
		for ( trav = firstNode; trav != null; trav=trav.next)
			   System.out.printf("%d\t", trav.data);
	}
	public long ithElement ( int pos )
	{
	   int walk;
	   Node trav;
	   for( walk = 1, trav = firstNode; walk < pos; walk++, trav=trav.next);
	   return trav.data;
	}
	public void add ( long data )
	{
	   Node newNode = new Node ( data );
	   if ( firstNode == null )
	   {
	      firstNode = newNode;
		  lastNode  = newNode;
	   }
	   else
	   {
	      lastNode.next = newNode;
		  lastNode       = newNode;
	   }
	   non++;
	}
}
class nth_largest_factor_v2
{
	public static void main( String [] parameters )
	{
		long [] data = {1234567890L,25200L,2520L,21621600L,1396755360L,10475665200L,15120L,3212537328000L,93163582512000L,30324746107656000L};
		int  [] k    = { 27,12, 3,100,35,90,10,1900,2000,3030  };
		int ind = 0;
		long begin = System.nanoTime();
		do
		{
		sll by_us = new sll();
        sll partner = new sll ();
	    long cff ; // check for factor
		long proc = data [ ind  ];
		long until = (long) Math.sqrt ( proc );
		for ( cff = 1; cff < until; cff++)
		{
		    if ( proc % cff == 0 )
			{
			    by_us.add( cff );
				partner.add ( proc / cff );
			}
		}
		if ( cff * cff == proc )
		   by_us.add( cff );
		
		
        partner.add ( by_us );
        System.out.printf("%d\n", partner.ithElement ( k[ind++]));
		}while (   ind < data.length);
		long stop =  System.nanoTime();
		System.out.printf("duartion of Process = %d\n" , stop - begin);
	}
}
