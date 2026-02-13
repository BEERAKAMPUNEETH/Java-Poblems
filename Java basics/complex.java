import java.util.Scanner;
class complex
{
public static void main ( String [] args )
{
Scanner hp = new Scanner ( System.in );
System.out.printf("Enter the real part of num1 :");
int real_num1 = hp.nextInt ();
System.out.printf("Enter the real part of num2 :");
int real_num2 = hp.nextInt ();
System.out.printf("Enter the imag part of num1 :");
int imag_num1 = hp.nextInt ();
System.out.printf("Enter the imag part of num2 :");
int imag_num2 = hp.nextInt ();
int real_sum = real_num1 + real_num2;
int imag_sum = imag_num1 + imag_num2;
System.out.printf("Sum of two complex numbers =" + real_sum + "+" + imag_sum + "i");
}
}