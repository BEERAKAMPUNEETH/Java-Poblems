import java.util.Scanner;
import java.util.Arrays;
class sol
{
public static int our_solution ( int [] arr )
{
Arrays.sort(arr);
return arr[arr.length - 1];
}
}
public class asc_sort
{
public static void main ( String [] args )
{
Scanner hp = new Scanner( System.in );
System.out.print("Enter the Size of the array 1:");
int first_size = hp.nextInt();
int[] arr1 = new int[first_size];
System.out.println("Enter the Elements of the array 1:");
for (int first_nums = 0 ; first_nums < first_size ; first_nums++ )
{
	arr1[first_nums] = hp.nextInt(); 
}
System.out.print("Enter the Size of the array 2:");
int second_size = hp.nextInt();
int[] arr2 = new int[second_size];
System.out.println("Enter the Elements of the array 2:");
for (int second_nums = 0 ; second_nums < second_size ; second_nums++)
{
	arr2[second_nums] = hp.nextInt();
}

System.out.println("Largest Element of Arr 1 is:" + sol.our_solution(arr1));
System.out.println("Largest Element of Arr 2 is:" + sol.our_solution(arr2));
}
}