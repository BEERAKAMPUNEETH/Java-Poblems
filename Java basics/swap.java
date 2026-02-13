import java.util.Scanner;
class swap
{
public static void main ( String [] args )
{
Scanner hp = new Scanner ( System.in ) ;
int first_num;
int second_num;
first_num = hp.nextInt ();
second_num = hp.nextInt ();
int temp;
temp = first_num;
first_num = second_num;
second_num = temp ;
System.out.println(first_num + " " +second_num);
}
}