import java.util.Scanner;
class statement
{
public static void main ( String [] args )
{
System.out.printf( "Enter you Age:" );
Scanner hp = new Scanner ( System.in );
int age = hp.nextInt();
if (age >= 18)
{
System.out.printf("Your are Major");
}
else if (age <= 18)
{
System.out.printf("Your are Minor");
}
}
}