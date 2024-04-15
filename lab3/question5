public class AnonymousArrayExample {

    public static void main(String[] args) {
        // Calling the method with an anonymous array
        displaySumInReverseOrder(new int[]{10, 20, 30, 40, 50});
    }

    // Method to find the sum of values and display them in reverse order
    private static void displaySumInReverseOrder(int[] arr) {
        int sum = 0;

        // Calculate the sum of values
        for (int value : arr) {
            sum += value;
        }

        System.out.println("Sum of values: " + sum);

        // Display values in reverse order
        System.out.print("Values in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
