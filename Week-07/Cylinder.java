public class Cylinder extends Circle{
    /** The height of the cylinder */
    public double height;


    /**
     * Constructor for the Cylinder class with default radius of 1.0, default color of "red", and default height of 1.0
     */
    public Cylinder(){
        super(); // calls the constructor of the superclass
        height = 1.0; // default height
    }
    
    /**
     * Constructor for the Cylinder class with a given height, default radius of 1.0, and default color of "red"
     * @param height The height of the cylinder
     */
    public Cylinder(double height){
        super(); // calls the constructor of the superclass
        this.height = height;
    }

    /**
     * Constructor for the Cylinder class with a given height and radius, and default color of "red"
     * @param height The height of the cylinder
     * @param radius The radius of the cylinder
     */
    public Cylinder(double height, double radius){
        super(radius); // calls the constructor of the superclass
        this.height = height;
    }

    /**
     * Constructor for the Cylinder class with a given height, radius, and color
     * @param height The height of the cylinder
     * @param radius The radius of the cylinder
     * @param color The color of the cylinder
     */
    public Cylinder(double height, double radius, String color){
        super(radius, color); // calls the constructor of the superclass
        this.height = height;
    }

    /**
     * Gets the height of the cylinder
     * @return The height of the cylinder
     */
    public double getHeight(){ return height; }

    /**
     * Sets the height of the cylinder
     * @param height The new height of the cylinder
     */
    public void setHeight(double height){ this.height = height; }


    /**
     * Gets the volume of the cylinder
     * @return The volume of the cylinder
     */
    public double getVolume(){
        return super.getArea() * height;
    }

    /**
     * Gets the surface area of the cylinder
     * Overrides the getArea method in the Circle class
     * @return The surface area of the cylinder
     */
    @Override
    public double getArea(){
        return 2 * Math.PI * getRadius()*getRadius() + 2 * Math.PI * getRadius() * height;
    }


    /**
     * Returns a string representation of the cylinder as "Cylinder[height=xxx, radius=xxx, color=xxx]"
     * @return A string representation of the cylinder
     */
    public String toString(){
        return "Cylinder[height=" + height + ", radius=" + getRadius() + ", color=" + getColor() + "]";
    }

    /**
     * Prints the class information
     * This method is static, so it is called on the class itself, not on an instance of the class
     */
    public static void printClassInfo() {
        System.out.println("It is a Cylinder class");
    }
}
