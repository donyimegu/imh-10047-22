public class VariableLengthArgumentExample {

    public static void main(String[] args) {
       
        displayTotalArguments("Hello", 1, 3.5, 'A');

        
        double maxNumber = findMax(10.5, 25.8, 15.2, 30.7, 20.3);
        System.out.println("Maximum number: " + maxNumber);

       
        double sum = calculateSum(5, 10, 15, 20, 25);
        System.out.println("Sum of elements: " + sum);

        
        displayMixedTypes("Mixed Types", 123, 45.67, true, 'X');
    }

   
    private static void displayTotalArguments(Object... args) {
        System.out.println("Total number of arguments: " + args.length);
    }

   
    private static double findMax(double... numbers) {
        double max = Double.MIN_VALUE;

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    
    private static double calculateSum(int... numbers) {
        double sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

   
    private static void displayMixedTypes(Object... args) {
        System.out.println("Mixed types arguments:");

        for (Object arg : args) {
            System.out.println(arg);
        }
    }
}
