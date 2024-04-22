// Define a class named Rectangle that implements the Shapes interface
public class Rectangle implements Shapes {
    // Declare private instance variables for length and width
    private double length;
    private double width;

    // Constructor to initialize a Rectangle object with given length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter method to retrieve the length of the rectangle
    public double getLength() {
        return length;
    }

    // Setter method to set the length of the rectangle
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method to retrieve the width of the rectangle
    public double getWidth() {
        return width;
    }

    // Setter method to set the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Override the getArea() method defined in the Shapes interface to calculate the area of the rectangle
    @Override
    public double getArea() {
        // Area of the rectangle = length * width
        return length * width;
    }
}