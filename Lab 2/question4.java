import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] integerArray = new int[sizeOfArray];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element at index " + i + ": ");
            integerArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < sizeOfArray; i++) {
            if (integerArray[i] == element) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
