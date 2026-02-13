import java.util.Scanner;
class swap_v1
{
public static void main ( String [] args )
{
Scanner hp = new Scanner ( System.in );
int first_num;
int second_num;
first_num = hp.nextInt ();
second_num = hp.nextInt ();
first_num = first_num ^ second_num;
second_num = first_num ^ second_num;
first_num = first_num ^ second_num;
System.out.printf("Swapped :\n" + first_num + "\n" + second_num);
}
}