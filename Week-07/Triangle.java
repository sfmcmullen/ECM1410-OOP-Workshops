public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    /**
     * Constructs a default instance of the Triangle class
     */
    public Triangle() {
        super();
        a = 1.0;
        b = 1.0;
        c = 1.0;
    }

    /**
     * Constructs an instance of the Triangle class with the specified side lengths
     * @param a
     * @param b
     * @param c
     * @param color
     */
    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Returns the side A length of the triangle
     * @return the side A length of the triangle
     */
    public double getSideA() { return a; }

    /**
     * Returns the side B length of the triangle
     * @return the side B length of the triangle
     */
    public double getSideB() { return b; }

    /**
     * Returns the side C length of the triangle
     * @return the side C length of the triangle
     */
    public double getSideC() { return c; }

    /**
     * Returns the area of the triangle
     * @return the area of the triangle
     */
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Returns the perimeter of the triangle
     * @return the perimeter of the triangle
     */
    public double perimeter() {
        return a + b + c;
    }

    /**
     * Returns the string representation of the Triangle class
     * @return the string representation of the Triangle class
     */
    public String toString() {
        return "Triangle[a=" + a + ", b=" + b + ", c=" + c + ", color=" + getColor() + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Triangle) { // Check if the object is an instance of the Triangle class
            Triangle other = (Triangle) obj; // Cast the object to a Triangle 
            return a == other.a && b == other.b && c == other.c && getColor().equals(other.getColor()); // Check if the sides and color are equal
        }
        return false;
    }
}
