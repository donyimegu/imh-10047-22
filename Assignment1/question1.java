import java.util.Scanner;

public class CreateIntArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();
        int[] integerArray = new int[sizeOfArray];
        System.out.println("Enter the elements of the array in random order:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element at index " + i + ": ");
            integerArray[i] = scanner.nextInt();
        }
        System.out.println("The elements of the array are:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(integerArray[i] + " ");
        }
        scanner.close();
    }
}
