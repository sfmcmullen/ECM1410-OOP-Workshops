public class Circle{
    /** The radius of the circle. */
    private double radius;
    /** The color of the circle. */
    private String color;


    /**
     * Constructor for the Circle class with default radius of 1.0 and default color of "red".
     */
    public Circle(){
        radius = 1.0; // default radius
        color = "red"; // default color
    }

    /**
     * Constructor for the Circle class with a given radius and default color of "red".
     * @param radius The radius of the circle
     */
    public Circle(double radius){
        this.radius = radius;
        color = "red"; // default color
    }

    /**
     * Constructor for the Circle class with a given radius and color.
     * @param radius The radius of the circle
     * @param color The color of the circle
     */
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }


    /**
     * Gets the radius of the circle
     * @return The radius of the circle
     */
    public double getRadius(){ return radius; }

    /**
     * Sets the radius of the circle
     * @param radius The new radius of the circle
     */
    public void setRadius(double radius){ this.radius = radius; }

    /**
     * Gets the color of the circle
     * @return The color of the circle
     */
    public String getColor(){ return color; }

    /**
     * Sets the color of the circle
     * @param color The new color of the circle
     */
    public void setColor(String color){ this.color = color; }


    /**
     * Gets the area of the circle
     * @return The area of the circle
     */
    public double getArea(){
        return Math.PI * radius * radius; 
    }


    /**
     * Returns a string representation of the circle as "Circle[radius=xxx, color=xxx]".
     * @return A string representation of the circle.
     */
    public String toString(){
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    /**
     * Prints the class information
     * This method is static, so it is called on the class itself, not on an instance of the class
     */
    public static void printClassInfo() {
        System.out.println("It is a Circle class");
    }
}