# Shapes Area Explorer

A simple Java console application demonstrating **object-oriented programming** concepts, **interfaces**, and **polymorphism** through the calculation of areas for various geometric shapes. 

## Features

- **Circle, Rectangle, and Triangle Classes**  
  Each class implements the `Shapes` interface, providing its own `getArea()` method.
- **Shapes Interface**  
  Defines the blueprint (`getArea()`) for any shape that wants to calculate its area.
- **Main Program**  
  - Uses `Scanner` to read user input (radius, length, width, base, and height).  
  - Creates instances of `Circle`, `Rectangle`, and `Triangle`.  
  - Calculates and displays the area of each shape.

## How It Works

1. **User Input**  
   - The program prompts the user to enter the necessary dimensions for each shape.
2. **Object Creation**  
   - Based on the input, new shape objects are created (e.g., `new Circle(radius, color)`, `new Rectangle(length, width)`, `new Triangle(base, height)`).
3. **Area Calculation**  
   - Each shape object’s `getArea()` method is called.  
   - For example, `Circle.getArea()` uses the formula \\( \pi \times \text{radius}^2 \\).
4. **Output**  
   - The resulting area is printed to the console.

## File Overview

- **`Shapes.java`**  
  - Interface containing the `getArea()` method signature.
- **`Circle.java`**  
  - Implements `Shapes`.  
  - Includes `radius` and `color` properties.  
  - Calculates circle area using \\( \pi \times \text{radius}^2 \\).
- **`Rectangle.java`**  
  - Implements `Shapes`.  
  - Includes `length` and `width` properties.  
  - Calculates rectangle area using `length * width`.
- **`Triangle.java`**  
  - Implements `Shapes`.  
  - Includes `base` and `height` properties.  
  - Calculates triangle area using \\( 0.5 \times \text{base} \times \text{height} \\).
- **`Main.java`**  
  - The entry point of the program.  
  - Prompts user for input, creates shape objects, calls `getArea()` methods, and prints the results.

## Getting Started

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/YourUsername/Shapes-Area-Explorer.git
   ```
2. **Navigate to the Project Directory**  
   ```bash
   cd Shapes-Area-Explorer
   ```
3. **Compile the Code**  
   ```bash
   javac *.java
   ```
4. **Run the Application**  
   ```bash
   java Main
   ```
5. **Enter the Required Dimensions** when prompted in the console.

## Example

Here’s a quick example of what the console interaction might look like:
```
Enter the radius of the circle: 5
Enter the length of the rectangle: 4
Enter the width of the rectangle: 3
Enter the base of the triangle: 6
Enter the height of the triangle: 2
Circle area: 78.53981633974483
Rectangle area: 12.0
Triangle area: 6.0
```

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to enhance this project. 

## License

This project is open source and available under the [MIT License](LICENSE).

---
