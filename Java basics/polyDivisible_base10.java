class polyDivisible_base10
{
	private static int toDecimal ( int ob_Value, int ob)
	{
	    // ob_Value = other base value
		// ob other base
		int digit;
		int ob_power;
		int copy_ob_Value;
		int decimal;
		// populate
		copy_ob_Value = ob_Value;
		// priming
		ob_power = 1;
		decimal = 0;
		// process
		while ( copy_ob_Value != 0 )
		{
		digit = copy_ob_Value % 10;
		decimal += digit * ob_power;
		ob_power *= ob;
		copy_ob_Value /= 10;
		}
		
		return decimal;		
	}

    private static void pd_helper ( int base, boolean [] used, int convalue, int pos )
	{
	// check
	if (pos == base )
	{
	  System.out.printf( "%d\t",convalue );
	  return;
	}
	int digit;
	int myConVal;
	for ( digit = 1; digit < base; digit++)
	{
	   if ( used [ digit ] == false )
	   {
	      // divisibility
		  myConVal = convalue * 10 + digit;
		  
		  int test = toDecimal( myConVal, base );
		  if ( test % pos == 0 )
		  {
		       used [ digit ] = true;
			   pd_helper ( base, used, myConVal, pos + 1);
			   used [ digit ] = false;
		  }
	   }
	}
	   
	}
    public static void solvePolyDivisible ( int base )
	{
	   if ( base == 1 ) 
	     return;
	    // set an environment

        boolean [] used = new boolean[base];
		// call helper - recursive, pass , initiate
		
		pd_helper ( base, used, 0 , 1 );
		
	}
	public static void main( String [] parameters )
	{
		solvePolyDivisible ( 10 );
		System.out.println();
	    solvePolyDivisible ( 8 );
		System.out.println();
	    solvePolyDivisible ( 6 );
		System.out.println();
	    solvePolyDivisible ( 4 );


	}


}