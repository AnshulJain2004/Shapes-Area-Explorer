// Define a class named Triangle that implements the Shapes interface
public class Triangle implements Shapes {
    // Declare private instance variables for the base and height of the triangle
    private double base;
    private double height;

    // Constructor to initialize a Triangle object with given base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Getter method to retrieve the base of the triangle
    public double getBase() {
        return base;
    }

    // Setter method to set the base of the triangle
    public void setBase(double base) {
        this.base = base;
    }

    // Getter method to retrieve the height of the triangle
    public double getHeight() {
        return height;
    }

    // Setter method to set the height of the triangle
    public void setHeight(double height) {
        this.height = height;
    }

    // Override the getArea() method defined in the Shapes interface to calculate the area of the triangle
    @Override
    public double getArea() {
        // Area of the triangle = 0.5 * base * height
        return 0.5 * base * height;
    }
}