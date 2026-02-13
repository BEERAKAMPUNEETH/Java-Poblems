import java.util.Scanner;
class deci_bina 
{
public static void main ( String [] args )
{
	System.out.printf("Decimal:");
Scanner hp = new Scanner ( System.in ) ;
int decimal = hp.nextInt ();
int num = decimal ;
String binary = "";
while ( num > 0 )
{
int remainder = num % 2 ;
binary = remainder + binary ;
num = num / 2 ;
}
System.out.println( "Binary :" + binary);
}
}