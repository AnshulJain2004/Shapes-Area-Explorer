import java.util.Scanner;

// Define a class named Main
public class Main {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        // Read the radius input from the user
        double radius = scanner.nextDouble();

        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        // Read the length input from the user
        double length = scanner.nextDouble();

        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        // Read the width input from the user
        double width = scanner.nextDouble();

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        // Read the base input from the user
        double base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        // Read the height input from the user
        double height = scanner.nextDouble();

        // Create instances of Circle, Rectangle, and Triangle classes
        Circle circle = new Circle(radius, "red");
        Rectangle rectangle = new Rectangle(length, width);
        Triangle triangle = new Triangle(base, height);

        // Display the calculated area of the circle
        System.out.println("Circle area: " + circle.getArea());
        // Display the calculated area of the rectangle
        System.out.println("Rectangle area: " + rectangle.getArea());
        // Display the calculated area of the triangle
        System.out.println("Triangle area: " + triangle.getArea());

        // Close the Scanner object to release resources
        scanner.close();
    }
}