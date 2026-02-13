import java.util.Scanner;
class pattern
{
public static void main ( String [] args )
{
Scanner hp = new Scanner ( System.in );
System.out.printf( "Enter Your Number:");
int num = hp.nextInt ();
int row;
int col;
for ( row=1 ; row<=num ; row++)
{
for ( col=1 ; col<=row ; col++)
{
System.out.print(row);
}
System.out.println();
}
}
}