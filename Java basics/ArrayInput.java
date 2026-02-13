import java.util.Scanner;
class ArrayInput {
    public static void main(String[] args) {

        Scanner hp = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = hp.nextInt();
        }

        System.out.println("Stored values:");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
