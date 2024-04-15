class AreaCalculator {
    private double length;
    private double breadth;
    private double side;

    
    public AreaCalculator(double... values) {
        if (values.length == 2) {
            this.length = values[0];
            this.breadth = values[1];
            this.side = 0; 
        } else if (values.length == 1) {
            this.length = 0;
            this.breadth = 0; 
            this.side = values[0];
        } else {
            this.length = 0; 
            this.breadth = 0; 
            this.side = 0; 
        }
    }

    
    public double calculateAreaRectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        return length * breadth;
    }

   
    public double calculateAreaSquare(double side) {
        this.side = side;
        return side * side;
    }

    
    public void displayDetails() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
        System.out.println("Side: " + this.side);
        System.out.println("Area: " + calculateArea());
    }

    
    private double calculateArea() {
        if (this.side != 0) {
            return this.side * this.side; // Area of square
        } else {
            return this.length * this.breadth; // Area of rectangle
        }
    }
}

public class AreaCalculatorDemo {
    public static void main(String[] args) {
     
        AreaCalculator rectangle = new AreaCalculator(5.0, 10.0);
        AreaCalculator square = new AreaCalculator(4.0);

        
        rectangle.displayDetails();
        square.displayDetails();
    }
}
