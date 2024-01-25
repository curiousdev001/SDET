package SDETComprehensiveAssignment;
public class Rectangle_Demo {
    // Instance variables
    private float length;
    private float width;

    // Setter method for length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter method for length
    public float getLength() {
        return length;
    }

    // Setter method for width
    public void setWidth(float width) {
        this.width = width;
    }

    // Getter method for width
    public float getWidth() {
        return width;
    }

    // Method to calculate and return the area
    public float getArea() {
        return length * width;
    }

    // Method to calculate and return the perimeter
    public float getPerimeter() {
        return 2 * (length + width);
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Create an instance of Rectangle_Demo
        Rectangle_Demo rectangle = new Rectangle_Demo();

        // Set length and width using setter methods
        rectangle.setLength(5.0f);
        rectangle.setWidth(3.0f);

        // Get and print length and width using getter methods
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());

        // Calculate and print area and perimeter
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
