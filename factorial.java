import java.util.Scanner;
class factorial
{
public static void main ( String [] args )
{
	System.out.printf("Enter your Number:");
Scanner hp = new Scanner ( System.in );
int num = hp.nextInt ();
int original = num;
int fact = 1;
while ( num > 0) 
{
fact = fact * num ;
num = num -1 ;
}
System.out.printf("Factorial of a num:" + fact);
}
}