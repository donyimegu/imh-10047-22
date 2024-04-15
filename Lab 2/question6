import java.util.Scanner;

public class EvenOddSeparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] integerArray = new int[sizeOfArray];
        int[] evenArray = new int[sizeOfArray];
        int[] oddArray = new int[sizeOfArray];

        System.out.println("Enter the elements of the array in random order:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element at index " + i + ": ");
            integerArray[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        
        
        for (int element : integerArray) {
            if (element % 2 == 0) {
                evenArray[evenCount++] = element;
            } else {
                oddArray[oddCount++] = element;
            }
        }

       
       
        System.out.println("Original array:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(integerArray[i] + " ");
        }
        System.out.println();

        
        
        System.out.println("Array with even elements:");

        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        
        
        System.out.println("Array with odd elements:");

        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }

        scanner.close();
    }
}
