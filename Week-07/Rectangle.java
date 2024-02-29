public class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Constructs a default instance of the Rectangle class
     */
    public Rectangle() {
        super();
        width = 1.0;
        height = 1.0;
    }

    /**
     * Constructs an instance of the Rectangle class with the specified width and height and color
     * @param width
     * @param height
     * @param color
     */
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width of the rectangle
     * @return the width of the rectangle
     */
    public double getWidth() { return width; }

    /**
     * Returns the height of the rectangle
     * @return the height of the rectangle
     */
    public double getHeight() { return height; }

    /**
     * Returns the area of the rectangle
     * @return the area of the rectangle
     */
    public double area() {
        return width * height;
    }

    /**
     * Returns the perimeter of the rectangle
     * @return the perimeter of the rectangle
     */
    public double perimeter() {
        return 2 * (width + height);
    }

    /**
     * Returns the string representation of the rectangle
     * @return the string representation of the rectangle
     */
    public String toString() {
        return "Rectangle[width=" + width + ",height=" + height + ",color=" + getColor() + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) { // Check if the object is an instance of the Rectangle class
            Rectangle r = (Rectangle) obj; // Cast the object to a Rectangle
            return width == r.width && height == r.height && getColor().equals(r.getColor()); // Compare the width, height, and color of the two rectangles
        }
        return false;
    }
}
