
import java.util.Scanner;

class ShapeCalculator {
    public double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public double calculateArea(int side) {
        return side * side;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public double calculatePerimeter(int side) {
        return 4 * side;
    }

    public double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}

public class ShapeCalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length of rectangle: ");
                int length = scanner.nextInt();
                System.out.print("Enter breadth of rectangle: ");
                int breadth = scanner.nextInt();
                System.out.println("Area of rectangle: " + shapeCalculator.calculateArea(length, breadth));
                System.out.println("Perimeter of rectangle: " + shapeCalculator.calculatePerimeter(length, breadth));
                break;

            case 2:
                System.out.print("Enter side of square: ");
                int side = scanner.nextInt();
                System.out.println("Area of square: " + shapeCalculator.calculateArea(side));
                System.out.println("Perimeter of square: " + shapeCalculator.calculatePerimeter(side));
                break;

            case 3:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + shapeCalculator.calculateArea(radius));
                System.out.println("Circumference of circle: " + shapeCalculator.calculateCircumference(radius));
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
