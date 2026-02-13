import java.util.Scanner;
class simple_intrest
{
public static void main( String [] args )
{
Scanner hp = new Scanner ( System.in );
System.out.printf("Enter Principle Amount:");
int principal = hp.nextInt ();
System.out.printf("Enter Time Period:");
int time = hp.nextInt ();
System.out.printf("Enter Rate of Intrest:");
int rate = hp.nextInt ();
int intrest = principal*time*rate / 100;
System.out.printf("Simple Intrest :" + intrest);
}
}