import java.util.Scanner;
class swap_test 
{
public static void main ( String [] args)
{
Scanner hp = new Scanner ( System.in );
int first_num = hp.nextInt ();
int second_num = hp.nextInt ();
first_num = first_num ^ second_num;
second_num = first_num ^ second_num;
first_num = first_num ^ second_num;
System.out.printf("Swapped Numbers :" + "\n" + first_num + "\n" + second_num);
}
}