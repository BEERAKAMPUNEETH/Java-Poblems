import java.util.Scanner;
class fibonacci
{
public static void main ( String [] args )
{
Scanner hp = new Scanner ( System.in );
System.out.printf("Enter your number:");
int num = hp.nextInt ();
int first_num = 0;
int second_num = 1;
int position = 1;
int count = 0;
int sum = 0;
while ( count < num )
{
if ( position % 2 == 0 )
{
sum = sum + first_num;
count++;
}
int next = first_num + second_num;
first_num = second_num;
second_num = next;
position++;
}
System.out.printf("Sum of Even indexes of fibonacci:" + sum);
}
}