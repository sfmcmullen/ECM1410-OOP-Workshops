public abstract class Shape {
    private String color;

    /**
     * Constructs a default instance of the Shape class
     */
    public Shape() {}

    /**
     * Constructs an instance of the Shape class with the specified color
     * @param color
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * Returns the color of the shape
     * @return the color of the shape
     */
    public String getColor() { return color; }
    /**
     * Sets the color of the shape
     * @param color
     */
    public void setColor(String color) { this.color = color; }

    /**
     * Returns the area of the shape
     * @return the area of the shape
     */
    public abstract double area();

    /**
     * Returns the perimeter of the shape
     * @return the perimeter of the shape
     */
    public abstract double perimeter();
}
