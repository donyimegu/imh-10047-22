
import java.util.Scanner;

public class ArrayInsertion {

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

        System.out.println("\nEnter the position where you want to insert the element: ");
        int position = scanner.nextInt();

        if (position < 0 || position > sizeOfArray) {
            System.out.println("Invalid position. Insertion not possible.");
        } else {
            System.out.print("Enter the element to be inserted: ");
            int element = scanner.nextInt();

           
           
            for (int i = sizeOfArray - 1; i > position; i--) {
                integerArray[i] = integerArray[i - 1];
            }

           
           
            integerArray[position] = element;

            System.out.println("Array after insertion:");

            for (int i = 0; i < sizeOfArray + 1; i++) {
                System.out.print(integerArray[i] + " ");
            }
        }

        scanner.close();
    }
}
