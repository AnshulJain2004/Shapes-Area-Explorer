// Define a class named Circle that implements the Shapes interface
public class Circle implements Shapes {
    // Declare private instance variables for radius and color
    private double radius;
    private String color;

    // Constructor to initialize a Circle object with given radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter method to retrieve the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Setter method to set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method to retrieve the color of the circle
    public String getColor() {
        return color;
    }

    // Setter method to set the color of the circle
    public void setColor(String color) {
        this.color = color;
    }

    // Override the getArea() method defined in the Shapes interface to calculate the area of the circle
    @Override
    public double getArea() {
        // Area of the circle = π * radius * radius
        return Math.PI * radius * radius;
    }
}